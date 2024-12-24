package operator;

public class Exam06 {
	public static void main(String[] args) {
		// 비트 연산자 : 2진수를 이용한 방법 
		int num1 = 12; // 1100
		int num2 = 10; // 1010
		
		// 1100 
		// 1010
		// 1000 => 8
		System.out.println(num1 & num2);
		// 1100
		// 1010
		// 1110 => 14
		System.out.println(num1 | num2);
		// 1100
		// 1010
		// 0110 => 6
		System.out.println(num1 ^ num2);
		// 0 000 1100 : 양수 12 
		// 1 111 0011 : 음수 -13
		System.out.println(~num1);
	}
}






