package ex03_for;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		/**
		 * Quiz04 문제 추가
		 * 입력한 숫자만큼 출력
		 * 출력 형식은 Quiz04 동일하게 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.printf("%2d ", i);
			if(i%5 == 0) {
				System.out.println();
			}
		}
	}
}