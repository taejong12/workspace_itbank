package ex04_method;

import java.util.Scanner;

public class Calculator {
	private int num1;
	private int num2;
	Scanner sc = new Scanner(System.in);
	
	public void main() {
		System.out.print("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		
		System.out.println(num1 + " + " + num2 
				+ " = " + (num1 + num2));
	}
}
