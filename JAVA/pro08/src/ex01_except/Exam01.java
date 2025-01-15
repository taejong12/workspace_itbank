package ex01_except;

import java.io.IOException;

public class Exam01 {
	// 예외
	// - 실행 중 오작동이 발생할 경우
	// - 실행 결과에 악영향을 미치는 경우
	// - 에러가 아닌 사용자의 잘못된 입력 등으로 인한 경우
	
	// 예외 처리 종류
	// - throw : 강제 예외 - 예외를 프로그램화 시키는 것
	// - throws : 예외 전가 - 예외에 대한 처리를 다른 클래스에서 처리
	// - try ~ catch : 예외 처리 - 프로그래머가 예외를 직접 처리
	public static void main(String[] args) 
			throws IOException {
		System.out.print("한 글자 입력 : ");
		char ch = (char)System.in.read();
		
		// Java 에서 최상위 예외 클래스는 Exception 이다.
		
		// throws
		// - 예외가 발생하면 throws 뒤에 있는 클래스에서 처리 
		
		
	}
}





