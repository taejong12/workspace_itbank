package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) throws IOException {
		/**
		 * 이름, 주소, 이메일 을 입력 받고 출력하세요
		 * BufferedReader 와 Scanner 를 이용하세요
		 */
		
		BufferedReader in =
				new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 : ");
		String name1 = in.readLine();
		
		System.out.println("이름 : " + name1);
		
		System.out.print("주소 입력 : ");
		String address1 = in.readLine();
		
		System.out.println("주소 : " + address1);
		
		System.out.print("이메일 입력 : ");
		String email1 = in.readLine();
		
		System.out.println("이메일 : " + email1);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		// Scanner.next() : 문자열 입력
		String name2 = sc.next();
		
		System.out.print("주소 입력 : ");
		// Scanner.nextDouble() : 실수 입력
		String address2 = sc.next();
		
		System.out.print("이메일 입력 : ");
		// Scanner.nextInt() : 정수 입력
		String email2 = sc.next();
		
		System.out.println("이름 : " + name2);
		System.out.println("주소 : " + address2);
		System.out.println("이메일 : " + email2);
	}
}