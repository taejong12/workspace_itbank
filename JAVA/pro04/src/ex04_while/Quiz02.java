package ex04_while;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/**
		 * while 문을 이용하여 구구단 출력
		 * - 단의 정수를 입력 받아서 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		int i = 1;
		while(i < 10) {
			System.out.println(dan + " * " + i +
					" = " + (dan * i));
			i++;
		}
	}
}







