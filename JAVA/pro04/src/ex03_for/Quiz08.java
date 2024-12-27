package ex03_for;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		/**
		 * 정수 입력 : 4
		 * 1
		 * 1 2 
		 * 1 2 3
		 * 1 2 3 4
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}




