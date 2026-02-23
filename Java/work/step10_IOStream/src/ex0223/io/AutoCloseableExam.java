package ex0223.io;

class Test implements AutoCloseable{
	@Override
	public void close() {
		System.out.println("Test의 close 호출됨!!!");
	}
}

public class AutoCloseableExam {

	public static void main(String[] args) {
		System.out.println("----시작합니다.--------");
		
		try (Test t = new Test()) {//try resources with
			System.out.println("오늘은 월요일!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("----끝.---------");
	}

}
