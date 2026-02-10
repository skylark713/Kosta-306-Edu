package ex0206.array.student.solution;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("***학생 관리 프로그램 시작합니다.******");
		//service.init(); // 초기치데이터 세팅
		String [][]data = new String [][] {
				{"희정","20", "서울"},
				{"나정", "25", "대구"},
				{"미미", "30", "부산"},
				{"효리", "32", "경기"},
				{"재석", "27", "제주도"}
		};
		
		// int a=100;
		StudentService service = new StudentService(); //StudentService의 전역변수들이 초기화
		service.init(data);
				
		//전체학생정보 출력
		Student[] stArr = service.selectAll();
		StudentEndView.printSelectAll(stArr);
		
		//등록하기
		System.out.println("--1. 등록하기 -----");
		Student student = new Student();
		student.setName("미미");
		student.setAge(25);
		student.setAddr("오리역");
		
		int result = service.insert(student);
		if(result==0)
			StudentEndView.printMessage(student.getName()+"중복입니다. 등록실패");
		else if(result==-1)
			StudentEndView.printMessage("인원이 초과하여 등록할 수 없습니다.");
		else
			StudentEndView.printMessage("등록되었습니다.");
		
		
		//service.insert(student);
		
		System.out.println("--2. 전체검색 -----");
		StudentEndView.printSelectAll(service.selectAll());
		//service.selectAll();
		
		//이름으로 검색하기
		//System.out.println("--3. 이름으로 검색 -----");
		//service.selectByName("희정");
		
		//System.out.println("--이름이 없는경우----");
		//service.selectByName("삼순이");
		
		//수정하기 
		System.out.println("--4. 수정하기 -----");
		Student st2 =new Student();
		st2.setName("나영");//조건
		st2.setAge(23);
		st2.setAddr("대전");
		
		if(service.update(st2)) {
			StudentEndView.printMessage(st2.getName()+"님 정보를 수정했습니다.");
		}else {
			StudentEndView.printMessage("수정되지 않았습니다.");
		}
		
		System.out.println("---변경후 ---");
		stArr = service.selectAll();
		StudentEndView.printSelectAll(stArr);
	}

}








