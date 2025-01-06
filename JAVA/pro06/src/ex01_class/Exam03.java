package ex01_class;

import java.util.Scanner;

public class Exam03 {
	// 메서드를 이용하면 소스코드의 중복을 줄일 수 있다.
	// 유지보수가 편하다.
	void add() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		System.out.println("더한값 : " + (num1 + num2));
	}

	public static void main(String[] args) {
		Exam03 e = new Exam03();
		e.add();
		e.add();
	}
}



