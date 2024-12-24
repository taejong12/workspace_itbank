package input;

import java.io.IOException;

public class Exam03 {
	public static void main(String[] args) 
			throws IOException {
		System.out.print("세자리 숫자 입력 : ");
		int x = System.in.read() - 48;
		int y = System.in.read() - 48;
		int z = System.in.read() - 48;
		
		System.out.println(x + "" + y + "" + z);
		
	}
}