package ex0205.staticex;

class Test{ // class 앞에 static 불가
	int a; // 전역변수 0 - a가 속성
	static int b; // static 전역변수 0 - b가 속성 (static 있음)
	// 메소드 x
	
	// non-static 메소드에서 static, non-static 접근가능
	public void aa() {
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
		System.out.println(this.b); // static "메소드"에서만 this 사용 불가.
		System.out.println(Test.b);
	}
	public void bb() {
		// 메소드 호출
		aa();
		this.aa();
		
		cc(); // non-static 메소드가 static 메소드 호출 가능
		this.cc(); // this도 사용 가능
	}
	
	// static 메소드에서는 static만 접근, this 사용불가
	public static void cc() {
//		System.out.println(a); // 앞에서 int a; 라고 선언. static x
//		System.out.println(this.a); // static 메소드 안에서 this 사용 불가.
		
		System.out.println(b);
//		System.out.println(this.b); // static 메소드 안에서 this 사용 불가.
		System.out.println(Test.b);
	}
	public static void dd() {
		// 메소드 호출
//		aa(); // static 메소드끼리만 가능. aa()는 non-static 메소드.
//		this.aa(); // this 사용 불가
		
		cc(); // static 메소드가 static 메소드 호출 가능
		Test.cc(); 
		
//		this.cc(); // this 사용 불가
	}
}
// public 불가
/////////////////////////// 

public class StaticVariableExam {
	
	static {// 메소드 안에 static 있으면 안됨. class 안에서는 가능
		System.out.println("난 메소드보다 먼저 실행돼요!!");
	}

	public static void main(String[] args) {
		System.out.println("---메인 시작---");
		// 객체를 생성
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("t1 = " + t1); // t1~t3 주소가 다 다음
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		
		System.out.println("--non-static 접근 ---");
		
		System.out.println("t1.a = " + t1.a); // t1~t3의 a값 전부 0
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);
		
		// 값 변경
		t2.a = 100;
		System.out.println("-- 변경 후 접근 ---");
		System.out.println("t1.a = " + t1.a); // t1, t3 값 변동 x
		System.out.println("t2.a = " + t2.a); // t2 값 100으로 변경됨
		System.out.println("t3.a = " + t3.a);
		
		System.out.println("--static 접근 ---");
		
		System.out.println("t1.b = " + t1.b); // t1~t3의 b값 전부 0
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);
		
		// 값 변경
		// t2.b = 50; // 경고: Test.b를 사용하는게 더 좋다
		Test.b = 70; // static은 공유 필드. 인스턴스 필드.
		System.out.println("-- 변경 후 접근 ---");
		System.out.println("t1.b = " + t1.b); // t1~t3의 b값 전부 변경됨.
		System.out.println("t2.b = " + t2.b); // static 필드는 전부 공유가 된다.
		System.out.println("t3.b = " + t3.b);
	}

}
