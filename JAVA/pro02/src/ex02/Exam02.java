package ex02;

public class Exam02 {
	public static void main(String[] args) {
		// 단일 문자 데이터 타입 : char
		// 단일 문자 표현식 : '' 
		char ch1 = 'A';
		System.out.println(ch1);
		char ch2 = '대';
		System.out.println(ch2);
		
		// char 형식을 입력은 정수와 문자 가능
		// char 형식의 출력은 문자 가능
		char ch3 = 65;
		System.out.println(ch3);
		// ASCII (1byte) : 0 ~ 127 의 숫자를 단일문자로 처리(영문 대소문 + 기호)
		// UNICode(2byte) : ASCII + 제3지대 언어 표현까지 처리
		
		System.out.println((int)ch1);
		System.out.println((int)ch2);
	}
}