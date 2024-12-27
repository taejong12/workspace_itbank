package ex03_for;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/**
		 * 입력 받은 숫자의 구구단을 출력
		 * 출력할 단 입력 : 2
		 * 2단 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 단 입력 : ");
		int dan = sc.nextInt();
		
		for(int i=1; i< 10; i++) {
			System.out.println(dan + " * " + 
				i + " = " + (dan * i));
		}
	}
}








