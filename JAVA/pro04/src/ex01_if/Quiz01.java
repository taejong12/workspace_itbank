package ex01_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/**
		 * 정수 하나를 입력 받아서 짝수, 홀수 출력해보세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 결과값은 true, false 
		// 비교 연산자를 사용한다. == != > < >= <=
		if (num%2 == 0) {
			System.out.println("짝수");
		}
		if (num%2 == 1) {
			System.out.println("홀수");
		}
	}
}





