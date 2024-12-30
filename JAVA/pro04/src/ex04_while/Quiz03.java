package ex04_while;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/**
		 * 1. 구구단 출력
		 * 2. 계산기 출력
		 * 0. 프로그램 종료
		 * 
		 * - 구구단 출력 : 단 입력 받고 해당 하는 단 출력
		 * - 계산기 출력 : 
		 * 	두개의 정수 값 입력 받고 +,-,*,/ 값 출력
		 * - 프로그램 종료 : while 문 종료
		 */

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("1. 구구단 출력");
			System.out.println("2. 계산기 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print(">>> ");
			int menu = sc.nextInt();

			switch(menu) {
			case 1:
				System.out.print("출력할 단 입력 : ");
				int dan = sc.nextInt();

				for (int i=1;i<10;i++) {
					System.out.println(dan + " * " + i + 
							" = " + (dan * i));
				}
				break;
			case 2:
				System.out.print("첫번째 정수 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 정수 입력 : ");
				int num2 = sc.nextInt();

				System.out.println(num1 + " + " + num2 + 
						" = " + (num1 + num2));
				System.out.println(num1 + " - " + num2 + 
						" = " + (num1 - num2));
				System.out.println(num1 + " * " + num2 + 
						" = " + (num1 * num2));
				System.out.println(num1 + " / " + num2 + 
						" = " + (num1 / num2));
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못된 메뉴 번호");
			}
		}
	}
}




