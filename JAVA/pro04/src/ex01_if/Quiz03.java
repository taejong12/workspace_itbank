package ex01_if;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/**
		 * 1. 점수 0 ~ 100 사이 값 입력 받기
		 * 2. 90 ~ 100 사이의 값이면 A 출력
		 * 3. 80 ~ 89 사이의 값이면 B 출력
		 * 4. 70 ~ 79 사이의 값이면 C 출력
		 * 5. 60 ~ 69 사이의 값이면 D 출력
		 * 6. 59 이하의 값이면 F 출력
		 * =    7. 음수와 100초과의 값은 "없는 값입니다." 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		// 첫번째 방법
		if(score >= 0 && score < 60) {
			System.out.println("F");
		} else if (score >= 60 && score < 70) {
			System.out.println("D");
		} else if (score >= 70 && score < 80) {
			System.out.println("C");
		} else if (score >= 80 && score < 90) {
			System.out.println("B");
		} else if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else {
			System.out.println("없는 값 입니다.");
		}
		
		// 두번째 방법
		if (score <= 100 && score >= 90) {
			System.out.println("A");
		} else if (score < 90 && score >= 80) {
			System.out.println("B");
		} else if (score < 80 && score >= 70) {
			System.out.println("C");
		} else if (score < 70 && score >= 60) {
			System.out.println("D");
		} else if (score < 60 && score >= 0) {
			System.out.println("F");
		} else {
			System.out.println("없는 값 입니다. ");
		}
		
		// 세번째 방법
		if (score < 0 || score > 100) {
			System.out.println("없는 값 입니다.");
		} else if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
		String result = "";
		if (score < 0 || score > 100) {
			result = "없는 값입니다.";
		} else if (score >= 90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";
		} else if (score >= 70) {
			result = "C";
		} else if (score >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		System.out.println(result);
	}
}





