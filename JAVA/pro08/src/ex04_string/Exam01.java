package ex04_string;

public class Exam01 {
	public static void main(String[] args) {
		String str1 = "HELLO hi Java";
		String str2 = "hello HI JaVa";
		
		// String 은 기본 자료형이 아닌 참조 자료형이다.
		// 원초적인 프로그래밍언어에서 문자열은 char[] 이다.
		char ch[] = {'H','e','l','l','o'};
		
		// charAt(int index) : 인덱스번호로 해당 문자 반환
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(7));
		
		for(int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
		
		// "문자열".compareTo("문자열")
		// 	- 문자열의 값을 비교, 대소문자는 구분 된다.
		//	- 같으면 0을 반환 그렇지 않은 다른 수로 출력
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str1));
		System.out.println(str2.compareTo(str2));
		
		// "문자열".compareToIngnoreCase("문자열")
		// - 대소문자 구분 없이 같은 지 비교
		System.out.println(str1.compareToIgnoreCase(str2));
		
		// 문자열 연결 : 문자열 + 문자열
		System.out.println(str1 + str2);
		// 문자열.concat(문자열)
		System.out.println(str1.concat(str2));
		
		// startsWith(문자열) : 문자열로 시작하는지 비교
		System.out.println(str1.startsWith("HELLO"));
		System.out.println(str1.startsWith("hello"));
		
		// endsWith(문자열) : 문자열로 끝나는지 비교
		System.out.println(str1.endsWith("Java"));
		System.out.println(str1.endsWith("JAVA"));
		
		// equals(문자열) : 문자열이 같은지 비교 - true, false
		System.out.println(str1.equals(str1));
		System.out.println(str1.equals(str2));
		
		// equalsIgnoreCase(문자열) 
		//	: 문자열 같은지 비교 - 대소문자 구분 없음
		System.out.println(str1.equalsIgnoreCase(str2));
		
		// getBytes() : 문자열을 byte 배열로 반환
		byte[] text = str1.getBytes();
		for(byte b : text) {
			System.out.println(b);
		}
		for(byte b : text) {
			System.out.println((char)b);
		}
		
		// indexOf("문자열") : 문자열의 인덱스 번호를 반환
		//	- 같은 문자열이 여러개 일 경우 제일 첫 인덱스 번호 반환
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.indexOf("J"));
		
		// lastIndexOf("문자열") : 문자열의 인덱스 번호를 반환
		// - 뒤에서 부터 검색 후 제일 첫 인덱스 번호 반환
		System.out.println(str1.lastIndexOf("a"));
		
		// isEmpty() : 비어 있는지 
		System.out.println(str1.isEmpty());
		
		// length() : 길이 반환
		System.out.println(str1.length());
		
		// split("기준문자") 
		//		: 기준문자를 기준으로 문자열을 배열로 반환
		String[] str3 = str1.split(" ");
		for(String s : str3) {
			System.out.println(s);
		}
		
		// substring(숫자) : 숫자부터 문자열 끝까지 반환
		System.out.println(str1.substring(6));
		
		// substring(숫자1, 숫자2)
		//	: 숫자1 ~ (숫자2 -1) 까지 문자열 반환
		System.out.println(str1.substring(0, 5));
		
		// toCharArray() : 문자열을 char 배열로 반환
		char[] ch1 = str1.toCharArray();
		for(char c: ch1) {
			System.out.println(c);
		}
		
		// toLowerCase() : 문자열 전체를 소문자로 변환
		System.out.println(str1.toLowerCase());
		// toUpperCase() : 문자열 전체를 대문자로 변환
		System.out.println(str1.toUpperCase());
		
		// trim() : 앞뒤 공백 제거
		String name = " 홍 길 동 ";
		System.out.println(name.trim());
		
		// valueOf(값) : 값을 문자열로 출력
		System.out.println(String.valueOf(123));
		
		String num1 = "1234";
		int num2 = Integer.parseInt(num1);
		System.out.println(num2);
		
		String num3 = String.valueOf(num2);
		System.out.println(num3);
		
		String num4 = String.valueOf(1.234);
		System.out.println(num4);
		
		String bool = String.valueOf(false);
		System.out.println(bool);
	}
}





