package ex0225.multiChat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 접속한 클라이언트들을 관리하기 위한 SERVER
 * */
public class ServerGUIChatExam {
	Socket sk;
	List<ClientSKThread> list = new ArrayList<>();
	public ServerGUIChatExam() {
		try (ServerSocket server = new ServerSocket(8002)){
			while(true) {
				System.out.println("Client 접속 대기중입니다~^^");
				sk = server.accept();
				
				System.out.println(sk.getInetAddress()+"님 접속하셨습니다.");
				
				ClientSKThread th = new ClientSKThread();
				list.add(th);
				th.start();
				
				System.out.println("현재 접속 인원 : " + list.size() + "명\n");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//생성자 끝
	
	/**
	 * 접속한 클라이언트에게 메시지 전송하는 메소드
	 * */
	public void sendMessage(String message) {
		for(ClientSKThread th : list) {
			th.pw.println(message);
		}
	}
	
	////Inner class/////////////////////////////////////////
	class ClientSKThread extends Thread{
		PrintWriter pw;
		BufferedReader br;
		String nickName; //대화명
		
		ClientSKThread(){
			try {
				pw = new PrintWriter(sk.getOutputStream(), true);
				br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			//클라이언트가 보내온 내용을 읽어서 접속한 모든 클라이언트에게 전송한다.
			try {
				nickName = br.readLine(); //대화명 저장
				
				sendMessage("[" + nickName + "]님 입장하셨습니다.");
				
				
				while(true) {
					String inputData =br.readLine();
					sendMessage("[" + nickName + "]" + inputData);
					
				}
			
 			} catch (Exception e) {
				e.printStackTrace();
				//현재 스레드에 문제가 생겼다
				//현재 스레드를 list에서 제거
				list.remove(this);
				
				//남아있는 클라이언트에게 알린다.
				sendMessage("[" + nickName + "]님 퇴장 | 현재 인원 = " + list.size() + "명");
 			}
		
		}
	}
	
	//////////////////////////////////////////////
	
	public static void main(String[] args) {
		new ServerGUIChatExam();
	}
}
