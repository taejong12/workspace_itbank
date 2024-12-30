package ex05_doWhile;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("1 ~ 10 까지의 수 입력 : ");
			num = sc.nextInt();
		} while(num < 1 || num > 10);
		
		System.out.println("입력 받은 수 : " + num);
		
		do {
			System.out.print("1 ~ 10 까지의 수 입력 : ");
			num = sc.nextInt();
		} while(!(num >= 1 && num <= 10));
		
		System.out.println("입력 받은 수 : " + num);
	}
}







