package input;

import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) throws IOException {
		// 입력 : 
		// 키보드나 그외 입력장치로 값을 프로그램이 받는 것을 의미
		// System.in.read() : ASCII 코드 값을 입력받는다.
		System.out.print("문자 입력 : ");
		int x = System.in.read();
		System.in.read(); // \r
		System.in.read(); // \n
		
		System.out.println("입력 받은 값 : " + x);
		System.out.println("문자로 변환 : " + (char)x);
		
		// 엔터 : \r\n 
		// \r : 13
		// \n : 10
		
		System.out.print("문자 입력 2 : ");
		int y = System.in.read();
		
		System.out.println("입력 받은 값 2 : " + y);
		System.out.println("문자로 변환 2 : " + (char)y);
	}
}






