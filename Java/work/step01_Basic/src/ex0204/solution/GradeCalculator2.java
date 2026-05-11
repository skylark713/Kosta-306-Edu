package ex0204.solution;

import java.util.Scanner;
/**
 * 	주제 :
 * 	작성일 :
 * 	작성자 :
 */

public class GradeCalculator2 {
	
	private int total(int kor, int eng, int math) {
		int sum = kor + eng + math;
		
		return sum;
	}
	
	/**
	 * 평균 구하기
	 * @param num : 국어, 영어, 수학
	 * @return : 총점
	 * */
	private double average(int sum, int num) {
		double avg = (double)sum / num;
		
		return avg;
	}
	
	private char grade(double avg) {
		char gr;
		
		if(avg >= 90)
			gr = 'A';
		else if(avg >= 80)
			gr = 'B';
		else if(avg >= 70)
			gr = 'C';
		else if(avg >= 60)
			gr = 'D';
		else
			gr = 'F';
		
		return gr;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GradeCalculator2 gc = new GradeCalculator2(); // 반복문 밖에서 생성
		
		while(true) {
			System.out.println("1. 성적표구하기       2. 종료");
			System.out.print("메뉴 > ");
			String choice = sc.nextLine();
			
			switch(choice) {
			case "1":
				System.out.println("이름은 ? ");
				String name = sc.nextLine();
				
				System.out.println("국어점수는 ? ");
				int kor = sc.nextInt();
				
				System.out.println("영어점수는 ? ");
				int eng = sc.nextInt();
				
				System.out.println("수학점수는 ? ");
				int math = sc.nextInt();
				sc.nextLine();
				
				// GradeCalculator2 gc = new GradeCalculator2();
				// 반복문 안에서 생성하면 메모리 낭비. 밖에서 생성.
				int sum = gc.total(kor, eng, math);
				double avg = gc.average(sum, 3);
				char gr = gc.grade(avg);
				
				System.out.println("이름: " + name);
				System.out.println("총점: " + sum);
				System.out.println("평균: " + avg);
				System.out.println("등급: " + gr);
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
