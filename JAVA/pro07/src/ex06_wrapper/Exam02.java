package ex06_wrapper;

public class Exam02 {
	public static void main(String[] args) {
		// Wrapper 형태는 형변환을 할 수 있는 메서드
		// 		- 문자열에서 각자의 자료형으로 변경 가능
		String str1 = "123";
		int num1 = Integer.parseInt(str1);
		System.out.println(num1);
		
		double num2 = Double.parseDouble(str1);
		System.out.println(num2);
		
		String str2 = "true";
		boolean bl1 = Boolean.parseBoolean(str2);
		System.out.println(bl1);
		
		// 자료형과 다른 형태의 값이 있으면 
		// 		number format Exception 이 발생한다.
		String str3 = "1234a";
		// int num3 = Integer.parseInt(str3);
		// System.out.println(num3);
		
		// Integer num3 = Integer.parseInt(str3);
		// System.out.println(num3);
	}
}