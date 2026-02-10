package ex0203.solution;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.성적구하기       2. 종료 ---");
			System.out.print("메뉴는 > ");
			String choice = sc.nextLine();
			
			switch(choice) {
			case "1":
				System.out.print("이름은? ");
				String name = sc.nextLine();
				
//				System.out.print("국어점수는? ");
//				int kor = Integer.parseInt(sc.nextLine());
				
				int kor = (int)(Math.random() * 56 + 45);
				int eng = (int)(Math.random() * 56 + 45);
				int math = (int)(Math.random() * 56 + 45);
				
				int total = kor + eng + math;
				double avg = total / 3.0;
				
				char grade;
				
//				// if문
//				if(avg >= 90)
//					grade = 'A';
//				else if(avg >= 80)
//					grade = 'B';
//				else if(avg >= 70)
//					grade = 'C';
//				else if(avg >= 60)
//					grade = 'D';
//				else
//					grade = 'F';
//				
				// switch문
				// 문제점: 100점 맞은 사람도 default로 F학점으로 나옴
				switch((int)avg/10) {
				// 100점 맞은 사람 추가
				case 9, 10:
					grade = 'A';
					break;
				case 8:
					grade = 'B';
					break;
				case 7:
					grade = 'C';
					break;
				case 6:
					grade = 'D';
					break;
				default: grade = 'F';
				}
				
				System.out.println("이름: " + name);
				System.out.println("국어: " + kor);
				System.out.println("영어: " + eng);
				System.out.println("수학: " + math);
				System.out.println("총점: " + total);
				System.out.println("평균: " + avg);
				System.out.println("학점: " + grade);
				break;
				
			case "2":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
				
			default: System.out.println("숫자는 1 ~ 2만 입력");
				
			}
		}

	}

}
