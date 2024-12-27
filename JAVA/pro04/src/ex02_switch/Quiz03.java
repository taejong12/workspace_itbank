package ex02_switch;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/**
		 * # 출력 예제
		 * 1. 덧셈
		 * 2. 뺄셈
		 * 3. 곱셈
		 * 4. 나눗셈
		 * 선택 : 1
		 * 첫번째 정수 입력 : 10
		 * 두번재 정수 입력 : 3
		 * 10 + 3 = 13
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("### 계산기 ###");
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.println("4. 나눗셈");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		
		int num1 = 0, num2 = 0;
		if(menu >= 1 && menu <=4) {
			System.out.print("첫번째 정수 입력 : ");
			num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 : ");
			num2 = sc.nextInt();
		}
		
		switch(menu) {
		case 1:
			System.out.println(num1 + " + " 
				+ num2 + " = " + (num1+num2));
			break;
		case 2:
			System.out.println(num1 + " - " 
				+ num2 + " = " + (num1-num2));
			break;
		case 3:
			System.out.println(num1 + " * " 
				+ num2 + " = " + (num1*num2));
			break;
		case 4:
			System.out.println(num1 + " / " 
				+ num2 + " = " + ((double)num1/num2));
			break;
		default:
			System.out.println("선택된 메뉴 번호가 없습니다.");
		}
		
	}
}


