package ex0205.이예진;

import java.util.Scanner;

public class ArrayExercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
			} else if(selectNo == 2) {
				scores = new int [studentNum];
				for(int i=0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for(int j=0; j < studentNum; j++) {
					System.out.println("scores[" + j + "]: " + scores[j]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				for(int k=0; k < studentNum; k++) {
					if(scores[k]>=max) max = scores[k];
					sum += scores[k];
				}
				double avg = (double)sum/studentNum;
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				// System.out.println("sum: " + sum);
			} else if (selectNo == 5) {
				run = false;
			} else System.out.println("숫자는 1 ~ 5만 입력");
		}
		
		System.out.println("프로그램 종료");
		
	}

}
