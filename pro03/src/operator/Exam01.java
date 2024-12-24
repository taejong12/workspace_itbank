package operator;

public class Exam01 {
	public static void main(String[] args) {
		// 산술 연산자
		// + , - , * , /(정수일때 몫) , %(정수일때 나머지)
		int num1 = 10;
		int num2 = 4;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		// 둘다 정수 일때는 몫
		System.out.println(num1 / num2);
		// 둘다 정수 일때는 나머지
		System.out.println(num1 % num2);
		// 한쪽이라도 실수면 소수점의 값으로 출력
		System.out.println(num1 / (double)num2);
	}
}



