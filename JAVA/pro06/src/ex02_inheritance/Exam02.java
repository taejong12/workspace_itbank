package ex02_inheritance;

class Parent2 {
	void output() {
		System.out.println("부모 클래스 입니다.");
	}
}
class Child2 extends Parent2{
	// 오버라이드 : 부모의 메서드를 수정 하는 것
	void output() {
		System.out.println("자식 클래스 입니다.");
	}
	// 오버로딩 : 이름이 같은 메서드를 사용
	// - 매개변수의 데이터 타입과 수가 달라야 한다.
	void output(String str) {
		System.out.println(str + " 클래스 입니다.");
	}
	void output(int num) {
		System.out.println(num + " 클래스 입니다.");
	}
	void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	void add(int num1, double num2) {
		System.out.println(num1 + num2);
	}
	void add(double num1, int num2) {
		System.out.println(num1 + num2);
	}
}

public class Exam02 {
	public static void main(String[] args) {
		// 상속을 받은 메서드나 필드는 추가 할 수 있다.
		// 오버라이딩(override)
		//  - 부모클래스의 메서드를 수정하여 사용 
		// 오버로딩 (overloading)
		//  - 같은 이름의 메서드를 사용
		//  - 매개변수의 데이터 타입 또는 수가 달라야 함
		
		Parent2 p = new Parent2();
		p.output();
		
		Child2 c = new Child2();
		c.output();
		c.output("자식2");
		c.output(123);
		c.add(12, 20);
		c.add(12, 2.2);
		c.add(1.2, 10);
	}
}


