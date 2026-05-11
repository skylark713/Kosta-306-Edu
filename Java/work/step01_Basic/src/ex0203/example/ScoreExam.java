package ex0203.example;

import java.util.Scanner;

public class ScoreExam {

	public static void main(String[] args) {
		String name = "이예진";
		int kor, eng, math;
		int totalScore;
		double average;
		char grade;
		
		kor = (int)(Math.random() * 56) + 45;
		eng = (int)(Math.random() * 56) + 45;
		math = (int)(Math.random() * 56) + 45;
		
		// 총점
		totalScore = kor + eng + math;
		
		// 평균
		average = totalScore/3.0;
		
		// 평균 90이상이면 A, 아니면 F
//		if (average >= 90) grade ='A';
//		else grade = 'F';
		
		// 삼항연산자 -> 조건식 ? 참일 경우 : 거짓일 경우;
		//grade = average >= 90 ? 'A' : 'F';
		
		// if문
//		if(average >= 90)
//			grade = 'A';
//		else if(average >= 80)
//			grade = 'B';
//		else if(average >= 70)
//			grade = 'C';
//		else if(average >= 60)
//			grade = 'D';
//		else
//			grade = 'F';
		
		// switch문
		grade = switch((int)(average/10)) {
		case 9, 10 -> grade = 'A';
		case 8 -> grade = 'B';
		case 7 -> grade = 'C';
		case 6 -> grade = 'D';
		default -> grade = 'F';
		};
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + totalScore);
		System.out.println("평균: " + average);
		System.out.println("학점: " + grade);
		
		average = (int)(average*100)/100.0;
		System.out.println("평균(소수점 아래 2자리): " + average);
	}
}
