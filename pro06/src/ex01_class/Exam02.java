package ex01_class;

public class Exam02 {
	// Exam02 의 필드(클래스 변수)
	int num1 = 100;
	
	// Exam02 의 필드 지만 공용으로 사용되는 static 필드
	static int num2 = 200;
	
	public static void main(String[] args) {
		// static 키워드가 붙어 있으면 
		// 	   키워드 없는 것은 사용이 불가능...
		
		// 직접 사용이 불가능
		// System.out.println(num1);
		// new : 객체 생성 키워드
		Exam02 e1 = new Exam02();
		
		System.out.println(e1.num1);
		e1.num1 = 200;
		System.out.println(e1.num1);
		
		// e1과 e2는 같은 클래스로 만들어진 다른 객체다.
		Exam02 e2 = new Exam02();
		System.out.println(e2.num1);
		
		// static 키워드 끼리는 직접 사용이 가능하다.
		System.out.println(num2);
		System.out.println(Exam02.num2);
		
	}
}