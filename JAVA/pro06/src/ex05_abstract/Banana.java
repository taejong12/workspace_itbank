package ex05_abstract;

// 추상 클래스는 객체를 생성할 수 없고 상속만 가능
public class Banana extends Fruit{

	// 상속받은 클래스는 반드시 추상 메서드를 구현해야 함.
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 1000;
	}

}