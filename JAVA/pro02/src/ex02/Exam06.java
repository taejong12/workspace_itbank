package ex02;

public class Exam06 {
	public static void main(String[] args) {
		// 정수형과 정수형 데이터 타입의 연산 결과는
		// 정수형으로 반환 된다.
		int num1 = 10;
		int num2 = 5;
		int num3 = 3;
		
		System.out.println(num1 + num2);
		System.out.println(num1 + num3);
		
		
		System.out.println(num1 / num2);
		System.out.println(num1 / num3);
		
		// 정수형과 정수형 연산에서 실수의 결과값을 원하면 
		// 한쪽은 실수형 데이터 타입으로 변환 해야 한다.
		System.out.println(num1 / (double)num3);
		System.out.println((double)num1 / num3);
		System.out.println((double)num1 / (double)num3);
		
		// 상수 : 일반적으로 사용되는 고정된 데이터의 값
		System.out.println(num1 / 3);
		System.out.println((double)num1 / 3);
		System.out.println(num1 / 3.0);
		
	}
}

