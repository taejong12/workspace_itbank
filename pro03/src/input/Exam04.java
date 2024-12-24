package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam04 {
	public static void main(String[] args) 
			throws IOException {
		// System.in.read() : 한글자 입력
		// BufferedReader() : 문장 입력
		BufferedReader in =
				new BufferedReader
				(new InputStreamReader(System.in));
		
		// BufferedReader.readLine()
		// 엔터 전까지의 문장을 가져오는 메서드
		// 이때 가지고 오는 데이터의 타입은 문자열이다.
		System.out.print("이름 입력 : ");
		String name = in.readLine();
		
		System.out.println("이름 : " + name);
		
		System.out.print("키 입력 : ");
		String height = in.readLine();
		
		System.out.println("키 : " + height + "cm");
		
		System.out.print("주소 입력 : ");
		String address = in.readLine();
		
		System.out.println("주소 : " + address);
	}
}




