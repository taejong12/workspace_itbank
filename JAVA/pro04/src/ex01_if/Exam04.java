package ex01_if;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("첫번째 정수가 큽니다.");
		} else if (num2 > num1){
			System.out.println("두번째 정수가 큽니다.");
		} else {
			System.out.println("두 값은 동일하다.");
		}
	}
}




