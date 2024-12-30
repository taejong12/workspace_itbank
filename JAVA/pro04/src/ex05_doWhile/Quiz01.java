package ex05_doWhile;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/**
		 * 1. 국어, 영어, 수학 점수를 입력 받기
		 * 2. 0 ~ 100 점 사이의 점수 입력
		 * 3. 그외 점수면 다시 입력 받기
		 * 4. 입력 받은 3개 점수의 총합과 평균 출력
		 */
		// Scanner 로 입력 객체 만들기
		Scanner sc = new Scanner(System.in);
		
		// 국어, 영어, 수학 점수 저장 변수
		int kor, eng, math;
		
		// sysout : ctrl + space 자동완성
		// System.out.print("요기내용출력" + 변수)
		do {
			System.out.print("국어 점수 입력 : "); // 출력
			kor = sc.nextInt(); // 국어 점수 입력 
			if (kor < 0 || kor > 100) {
				System.out.println("0 ~ 100 점 사이로 다시 입력 하세요.");
			}
		} while(kor < 0 || kor > 100);
		
		do {
			System.out.print("영어 점수 입력 : "); // 출력
			eng = sc.nextInt(); // 영어 점수 입력
			if (eng < 0 || eng > 100) {
				System.out.println("0 ~ 100 점 사이로 다시 입력 하세요.");
			}
		} while(eng < 0 || eng > 100);
		
		do {
			System.out.print("수학 점수 입력 : "); // 출력
			math = sc.nextInt(); // 수학 점수 입력
			if (math < 0 || math > 100) {
				System.out.println("0 ~ 100 점 사이로 다시 입력 하세요.");
			}
		} while(math < 0 || math > 100);
		
		int sum = kor + eng + math;
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);
	}
}


