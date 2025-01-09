package ex01_interface;

public interface Car {
	// 인터페이스에서 사용할 수 있는 기본 메서드 : 추상 메서드
	// 인터페이스에서 사용할 수 있는 변수 : 상수형 변수
	
	// public static final 을 생략 해도 상수형 변수가 됨
	public static final int TIRE = 4;
	int ENGINE = 1;
	int door = 5;
	
	// public abstract 를 생략해도 추상 메서드가 됨.
	public abstract String getTire();
	public abstract String engineInfo();
	public String doorInfo();
}



