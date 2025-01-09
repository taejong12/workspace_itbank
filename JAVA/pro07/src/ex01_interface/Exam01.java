package ex01_interface;

public class Exam01 {
	public static void main(String[] args) {
		// 인터페이스 - 추상 클래스의 일종
		// - 실제 구현된 것이 없는 클래스 
		// - 추상 메서드와 상수 또는 상수 변수 가질 수 있다.
		// - 객체를 생성해서 사용할 수는 없다.
		// - 표준화 작업에 사용된다. (규칙 정의)
		// - 다중 상속이 가능하다.
		// - 사용되는 키워드 implements 를 사용
		
		// 인터페이스는 자신을 상속한 구현클래스의 
		// 		정보를 저장할 수 있다.
		Genesis g1 = new Genesis();
		Hyundai h1 = new Hyundai();
		
		System.out.println(g1.getTire());
		System.out.println(g1.engineInfo());
		System.out.println(g1.doorInfo());
		
		System.out.println(h1.getTire());
		System.out.println(h1.engineInfo());
		System.out.println(h1.doorInfo());
		h1.getBrand();
		
		// 인터페이스는 객체를 생성 할 수 없다.
		// Car c1 = new Car(); // 불가능
		
		// 인터페이스는 구현 클래스의 객체를 저장할 수 있다.
		Car c2 = new Genesis();
		
		System.out.println(c2.getTire());
		System.out.println(c2.engineInfo());
		System.out.println(c2.doorInfo());
		
		c2 = new Hyundai();
		
		System.out.println(c2.getTire());
		System.out.println(c2.engineInfo());
		System.out.println(c2.doorInfo());
		((Hyundai)c2).getBrand();
	}
}





