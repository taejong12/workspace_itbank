package ex04_method;

import java.util.Scanner;

public class Exam02 {
	Scanner sc = new Scanner(System.in);
	
	public void title() {
		// 반환값 없고 매개변수 없는 메서드 - 단순 출력문에서 사용 
		System.out.println("###################");
		System.out.println("### 계산기 프로그램 ###");
		System.out.println("###################");
		System.out.println();
	}
	
	public void inputTitle(String sub) {
		System.out.print(sub + " 정수 입력 : ");
	}
	
	public int input()  {
		return sc.nextInt();
	}
	
	public void output(int num1, int num2) {
		System.out.println(num1 + " + " + num2 
				+ " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 
				+ " = " + (num1-num2));
	}
	
	public static void main(String[] args) {
		Exam02 ex = new Exam02();
	
		ex.title();
		
		ex.inputTitle("첫번째");
		int num1 = ex.input();
		ex.inputTitle("두번째");
		int num2 = ex.input();
		
		ex.output(num1, num2);
	}
}



