package operator;

public class Exam02 {
	public static void main(String[] args) {
		// 대입 연산자
		// = : 오른쪽의 식이나 값을 왼쪽 변수에 저장
		int num1 = 10; // 10을 정수형 변수 num1에 대입
		int num2 = 3 + 2; // 3+2 한 결과값을 num2에 대입
		
		// 복합 대입 연산자(배정 대입)
		// += : a += b : a = a + b
		// -= : a -= b : a = a - b
		// *= : a *= b : a = a * b
		// /= : a /= b : a = a / b
		// %= : a %= b : a = a % b
		
		// num1은 10인 상태
		num1 += num2; 
		// num1 = 10(기존 num1 값) + 5(num2 값)
		System.out.println(num1);
		
		// num1은 15인 상태
		num1 -= num2;
		// num1 = 15(기존 num1 값) - 5(num2 값)
		System.out.println(num1);
		
		// num1은 10인 상태
		num1 *= num2;
		// num1 = 10(기존 num1 값) * 5
		System.out.println(num1);
		
		// num1은 50인 상태
		num1 /= num2;
		// num1 = 50(기존 num1 값) / 5
		System.out.println(num1);
		
		// num1은 10인 상태
		num1 %= num2;
		// num1 = 10(기존 num1 값) % 5 : 나머지
		System.out.println(num1);
		
		int num3 = 5;
		num3 += 3 * 3;
		// num3 = 5 + (3 * 3);
		System.out.println(num3);
		
		num3 = 5;
		num3 *= 3 + 3;
		// num3 = 5 * (3 + 3);
		System.out.println(num3);
		
		num3 = 5;
		num3 = num3 * 3 + 3;
		System.out.println(num3);
	}
}




