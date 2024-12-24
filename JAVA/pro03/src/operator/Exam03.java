package operator;

public class Exam03 {
	public static void main(String[] args) {
		// 증감 연산자
		// ++ : 1씩 증가
		// -- : 1씩 감소
		int num = 10;
		num++; // 1 증가
		System.out.println(num);
		num--; // 1 감소
		System.out.println(num);
		
		// 현재 num 의 값은 10 
		// num의 값을 출력한 후에 1이 증가 - 후치 증감 연산자
		System.out.println(num++); // 10
		// num 의 값은 11
		// num의 값을 1을 증가 시킨 후 출력 - 전치 증감 연산자
		System.out.println(++num); // 12
		
		int num1 = 5;
		int num2 = 6;
		int num3 = 7;
		
		int result1 = num1++ - --num2 + num3++;
		// 5(num1) - 5(num2) + 7(num3) = 7
		// num1 : 6
		// num2 : 5
		// num3 : 8
		int result2 = ++num1 - num2-- + ++num3;
		// 7(num1) - 5(num2) + 9(num3) = 11
		// num1 : 7
		// num2 : 4
		// num3 : 9
		System.out.println(result1);
		System.out.println(result2);
	}
}




