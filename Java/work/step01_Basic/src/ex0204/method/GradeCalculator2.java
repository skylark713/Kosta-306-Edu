package ex0204.method;

import java.util.Scanner;

public class GradeCalculator2 {
	
	private int total(int kor, int eng, int math) {
		int total = kor + eng + math;
		
		return total;
	}
	
	private double avg(int total, int num) {
		double avg = total/num;
		return avg;
	}
	
	private char grade(double avg) {
		char grade;
		
		if(avg >= 90)
			grade = 'A';
		else if(avg >= 80)
			grade = 'B';
		else if(avg >= 70)
			grade = 'C';
		else if(avg >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		return grade;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		

	}

}
