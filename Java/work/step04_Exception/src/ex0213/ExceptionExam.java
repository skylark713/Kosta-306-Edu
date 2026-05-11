package ex0213;

public class ExceptionExam {
	public static void main(String[] args) {
		System.out.println("**메인 시작 ******");
		System.out.println("args =" + args);
		try {
			System.out.println("args [0] = " + args[0]);
			
			int convertNo = Integer.parseInt(args[0]);
			System.out.println("변환 값 = " + convertNo);
			
			int result = 100/convertNo;
			System.out.println("나눈 결과 = " + result);
		//catch블럭을 여러 개 작성할 때 반드시 서브클래스부터 작성	
		}catch (ArrayIndexOutOfBoundsException | NullPointerException e) {//예외 여러 개일때 작성법
			//예외가 발생했을 때 해야할 일
			System.out.println("인수 전달해주세요. "+e);//e.toString() 호출됨. 객체를 찍으면 toString이 자동으로 호출
													//class이름: 메시지 //java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		}catch (NumberFormatException e) {
			System.out.println("숫자만 입력해주세요 => " + e.getMessage());//메시지만 가져오는 경우
		}catch(Exception e) {
			//이외의 모든 예외는 여기서 처리한다.
			System.out.println("예외가 발생했어요~~~");
			
			//개발자가 개발할 때 예외에 대한 정보를 추적(디버깅) 할 때 사용한다.
			//반드시 배포 (prodution 환경)에서는 제거해야 한다.
			e.printStackTrace();//예외정보를 detail하게 stack에서 꺼내서 출력해준다.
		}finally {
			System.out.println("finally영역은 예외 상관없이 항상 실행해요~6");
		}
		
		
		
		
		
		System.out.println("**메인 끝 ******");
	}
}
