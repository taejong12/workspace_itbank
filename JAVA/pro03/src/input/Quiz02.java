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
//		BufferedReader br = 
//				new BufferedReader
//				(new InputStreamReader(System.in));
//		
//		System.out.print("이름 입력 : ");
//		String name = br.readLine();
//		
//		System.out.print("주소 입력 : ");
//		String address = br.readLine();
//		
//		System.out.print("이메일 입력 : ");
//		String email = br.readLine();
//		
//		
//		System.out.println(name + "님의 주소는 " + 
//		address + "이고, 이메일은 " + email + " 입니다.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name1 = sc.nextLine();
		
		System.out.print("주소 입력 : ");
		String address1 = sc.nextLine();
		
		System.out.print("이메일 입력 : ");
		String email1 = sc.nextLine();
		
		System.out.println("이름 : " + name1);
		System.out.println("주소 : " + address1);
		System.out.println("이메일 : " + email1);
	}
}















