package ex03_for;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		/**
		 * Quiz05 이어진 문제
		 * 1. 1 ~ 99 까지만 입력
		 * 2. 그외 숫자는 출력 불가능
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 99) {
			for(int i=1; i<=num; i++) {
				System.out.printf("%2d ", i);
				if(i%5 == 0) {
					System.out.println();
				}
			}
		} else {
			System.out.println("출력할 수 없습니다.");
		}
	}
}