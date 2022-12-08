package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice { //기능정의용 클래스
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");		
		int num = sc.nextInt();
		
		if (num <= 0) {
			System.out.println("양수만 입력해주세요.");		
			}else if (num > 0 && num % 2 ==0) {
				System.out.println("짝수입니다.");
			}else if (num > 0 && num % 2 !=0) {
				System.out.println("홀수입니다.");
			}
		
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");		
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");		
		int eng = sc.nextInt();
		System.out.print("영어점수 : ");		
		int math = sc.nextInt();
		
		
		if ((kor >= 40 && eng >= 40 && math >= 40) && ((kor + eng + math/3)>=60)){
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");		
			}
		
		
		
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");		
		int month = sc.nextInt();
		
		int result ;
		
		
		switch (month) {
		case 1 : result = 31; break;
		case 2 : result = 28; break;
		case 3 : result = 31; break;
		case 4 : result = 30; break;
		case 5 : result = 31; break;
		case 6 : result = 30; break;
		case 7 : result = 31; break;
		case 8 : result = 31; break;
		case 9 : result = 30; break;
		case 10 : result = 31; break;
		case 11 : result = 30; break;
		case 12 : result = 31; break;
		default : result = 0;	
		}
		
		if (result == 0) {
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		} else {
			System.out.printf("%d월은 %d일까지 있습니다.", month, result);
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요: ");		
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요: ");		
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.println("BMI 지수: " + bmi);
		
		if (bmi >= 30) {
			System.out.println("고도 비만");
		}else if (bmi <= 18.5 || bmi > 23) {
			System.out.println("정상체중");
		}else if (bmi <= 23 || bmi > 25) {
			System.out.println("과체중");
		}else if (bmi <= 25 || bmi >30){
			System.out.println("비만");	
		}else {
			System.out.println("저체중");
		}
		

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수(20) : ");		
		int midTest = sc.nextInt();
		System.out.print("기말 고사 점수(30) : ");		
		int finalTest = sc.nextInt();
		System.out.print("과제 점수 (30): ");		
		int homework = sc.nextInt();
		System.out.print("출석 횟수 (20): ");		
		int attend = sc.nextInt();
		
		double score = ((midTest * 0.2) + (finalTest * 0.3) + (homework * 0.3) + (attend * 0.2)); 
		System.out.println("총점: " + score);
		if (score >= 70) {
			System.out.println("Pass");
		}else if (score < 70 || attend >= 6) {
			System.out.println("Fail");
		}
	
	}

}





