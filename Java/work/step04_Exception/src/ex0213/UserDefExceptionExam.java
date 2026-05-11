package ex0213;

import java.util.Random;

class NoKidsException extends Exception{
	
	static int countException;
	public NoKidsException() {
		super("애들은 가라");
		countException++;
	}
	
	public NoKidsException(String message) {
		super(message);
		countException++;
	}
}

class ShoppingMall{
	int age;
	
	public void checkAge(int age) throws NoKidsException{
		if(age < 18){
			//발생할 객체 생성
			/*NoKidsException e = new NoKidsException();
			throw e;*/ //해당 코드를 한 줄로 줄이면 throw new NoKidsException();
			throw new NoKidsException();
			//throw new NoKidsException(age+"살은 더 커서 오세요.");
		}else System.out.println("입장하신 걸 환영합니다.");
	}
}


public class UserDefExceptionExam {

	public static void main(String[] args) {
		System.out.println("***** ShoppingMall OPEN *****");
		
		ShoppingMall shop = new ShoppingMall();
		
		//난수발생 전용 클래스
		Random r = new Random();
		
		for(int i=0; i<10; i++) {
			int age = r.nextInt(55)+1; //1~55
			//int age = (int)(Math.random()*55) + 1;
			System.out.print(age +"살입니다. ");
			try {
				shop.checkAge(age);
			}catch(NoKidsException e){
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("***** ShoppingMall CLOSED *****");
		System.out.println("총 발생한 예외의 개수: " + NoKidsException.countException);

	}

}
