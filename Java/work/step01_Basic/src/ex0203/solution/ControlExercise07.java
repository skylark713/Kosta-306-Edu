package ex0203.solution;
import java.util.Scanner;

public class ControlExercise07 {

	public static void main(String[] args) {
		boolean run = true; // 상태변수 역할(반복문 실행여부를 판단하는 변수)
		
		int balance = 0; // 잔액
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("예금액> ");
				int deposit = scanner.nextInt();
				balance += deposit;
				break;
				
			case 2:
				System.out.print("출금액> ");
				int withdraw = scanner.nextInt();
				balance -= withdraw;
				break;
				
			case 3:
				System.out.println("잔고> " + balance);
				break;
			
			case 4:
				run = false;
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");

	}

}
