package ex01_if;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/**
		 * 두개의 정수를 입력 받기
		 * 첫번째 입력한 정수가 큰 값인지 
		 * 두번째 입력한 정수가 큰 값인지 출력 해 보세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("첫번째 정수가 큽니다.");
		} else {
			System.out.println("두번째 정수가 큽니다.");
		}
	}
}






