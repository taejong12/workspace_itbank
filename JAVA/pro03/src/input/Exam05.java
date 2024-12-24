package input;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		// System.in.read() : 한글자씩 입력
		// BufferedReader() 
		// : 문장으로 입력, 타입 문자열, 형변환 문제
		// Scanner() : 문자열, 실수, 정수 타입별 입력 가능
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		// Scanner.next() : 문자열 입력
		// 공백, 엔터 두가지끝 종료의 의미로 생각한다.
		String name = sc.next();
		
		System.out.print("키 입력 : ");
		// Scanner.nextDouble() : 실수 입력
		// 문자열이 입력되면 예외 발생
		double height = sc.nextDouble();
		
		System.out.print("몸무게 입력 : ");
		// Scanner.nextInt() : 정수 입력
		// 문자열과 실수가 입력되면 예외 발생
		int weight = sc.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
	}
}









