package ex02_inheritance;

class Parent {
	int num1;
	int num2;
	
	void output() {
		System.out.println(this.num1);
	}
}

class Child {
	
}

// extends [클래스명] : 상속
class Child1 extends Parent{
	
}

public class Exam01 {
	public static void main(String[] args) {
		// 상속 : 부모클래스(상위)에서 구현된 필드와 메서드를
		// 		자식클래스(하위)에서 사용할 수 있도록 해주는 것
		
		// 상속 사용하는 이유
		// 1. 개발 속도가 빨라진다.
		// 2. 중복된 코드를 줄일 수 있다.
		// 3. 유지 보수의 편리성
		// 4. 객체의 다형성 구현
		
		// 자바에서는 단일 상속만 가능하다.
		
		// 상속 키워드는 extends [부모 클래스명] 을 사용
		
		// 상속하기 전에는 Parent 변수가 있음
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println(p.num1);
		System.out.println(p.num2);
		p.num1 = 100;
		p.output();
		
		// Child1 은 상속을 받아서 객체 생성하면 
		// 		Parent 의 필드를 사용할 수 있음
		Child1 c1 = new Child1();
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		c1.num1 = 200;
		c1.output();
	}
}





