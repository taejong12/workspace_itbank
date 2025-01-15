package ex01_except;

import java.util.Scanner;

public class Exam02 {
	// 예외 처리 : try ~ catch ~ finally
	// try - 실행할 문장을 정의하고 예외가 발생하면 catch 가 실행 
	// catch - try 에서 발생한 예외에 대한 처리 정의
	// finally - 생략 가능, try ~ catch 가 종료 되면 실행
	// try 에서 예외가 발생하지 않으면 catch 가 실행 되지 않는다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;

		try {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류 발생");
		}
//		 finally {
//			// TODO: handle finally clause
//			System.out.println("try ~ catch 문 종료");
//		}
		
		System.out.println(num);
		sc.close();
	}
}