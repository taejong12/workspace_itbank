package input;

import java.io.IOException;

public class Exam02 {
	public static void main(String[] args) throws IOException {
		System.out.print("첫번째 숫자 입력 : ");
		int x = System.in.read() - 48;
		System.in.read();
		System.in.read();
		
		System.out.println("입력 받은 수1 : " + x);
		
		System.out.print("두번째 숫자 입력 : ");
		int y = System.in.read() - 48;
		
		System.out.println("입력 받은 수2 : " + y);
		
		System.out.println(x + " + " + y + " = " + (x+y));
	}
}





