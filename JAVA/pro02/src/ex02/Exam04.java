package ex02;

public class Exam04 {
	public static void main(String[] args) {
		// 변수는 블럭({}) 내에서만 사용이 가능하다. 
		int num1 = 100;
		
		// if문 내부에서 선언된 변수는 외부에서 사용할 수 없다.
		if(num1 == 100) {
			// num2 는 if문 내에서만 사용 가능하다.
			int num2 = num1;
			System.out.println(num2);
		}
		
		System.out.println(num1);
		// System.out.println(num2); 는 사용 불가
	}
}