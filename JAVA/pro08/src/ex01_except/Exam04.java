package ex01_except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 : ");
			int num2 = sc.nextInt();
			System.out.println(num1 + " / " + 
					num2 + " = " + (num1/num2));
		} catch(ArithmeticException | InputMismatchException aie) {
			// 멀티 catch 에서는 변수명을 하나만 사용 할 수 있다.
			System.out.println("0으로는 나눌 수 없습니다.");
			System.out.println("정수 이외에는 입력하실 수 없습니다.");
			aie.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			// 사용자가 보는 오류 메세지
			System.out.println("오류가 발생했습니다.");
			// 개발자가 보는 디버그 메세지
			e.printStackTrace();
		}
		
		sc.close();
	}
}