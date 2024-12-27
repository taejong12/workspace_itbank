package ex03_for;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/**
		 * 출력할 단을 입력하고 구구단 출력
		 * 단 2 ~ 9단 까지 출력
		 * 나머지는 "출력할 수 있는 단이 아닙니다" 출력 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 단 입력 : ");
		int dan = sc.nextInt();
		
		// && : 선택 범위 지정
		if(dan >= 2 && dan < 10) {
			for(int i=1; i< 10; i++) {
				System.out.println(dan + " * " + 
					i + " = " + (dan * i));
			}
		} else {
			System.out.println("출력할 수 있는 단이 아닙니다.");
		}
		
		// || : 제외 범위 지정
		if (dan < 2 || dan > 9) {
			System.out.println("출력할 수 있는 단이 아닙니다.");
		} else {
			for(int i=1; i< 10; i++) {
				System.out.println(dan + " * " + 
					i + " = " + (dan * i));
			}
		}
		
	}
}



