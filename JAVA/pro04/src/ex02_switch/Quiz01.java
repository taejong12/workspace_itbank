package ex02_switch;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/**
		 * switch ~ case 문 사용
		 * 정수를 입력 받고 3의 배수 여부 출력
		 * 3배의 배수면 3의 배수 입니다.
		 * 아니면 3의 배수가 아닙니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// if 문은 조건이 반드시 true, false 결과가 나옴
		if (num%3 == 0) {
			System.out.println("3의 배수 입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		// switch(변수)의 변수의 값이 case 와 맞아야 한다.
		// num = num%3; // num %= 3;
		switch(num%3) {
		case 0:
			System.out.println("3의 배수 입니다.");
			break;
		default:
			System.out.println("3의 배수가 아닙니다.");
		}
		
	}
}







