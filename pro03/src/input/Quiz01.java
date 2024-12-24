package input;

import java.io.IOException;

public class Quiz01 {
	public static void main(String[] args) throws IOException {
		/**
		 * 자신의 이니셜을 입력 및 출력
		 */
		
		System.out.println("이니셜 입력 : ");
		char x1 = (char) System.in.read();
		char x2 = (char) System.in.read();
		char x3 = (char) System.in.read();
		
		System.out.println("이니셜 출력 : "+x1+x2+x3);
		
	}
}