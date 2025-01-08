package ex03_constructor;
class Parent {
	protected int minSpeed;
	protected int maxSpeed;
	protected String carName;
	
	public Parent() {
		minSpeed= 0;
		maxSpeed= 200;
		carName = "포르쉐";
	}
}
class Child extends Parent {
	private String engine;
	private String fuel;
	public Child() {
		engine = "하이브리드";
		fuel = "가솔린";
	}
	
	public Child(int maxSpeed) {
		this();
		this.maxSpeed = maxSpeed;
	}
	
	public Child(String carName) {
		this();
		this.carName = carName;
	}
	
	public Child(String engine, String fuel) {
		// this(); // 자신의 디폴트 생성자 호출
		super(); // 상위 클래스 디폴드 생성자 호출
		this.engine = engine;
		this.fuel = fuel;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return minSpeed + ", " + maxSpeed + ", " +
				carName + ", " + engine + ", " +
				fuel;
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		/**
		 * Child 클래스
		 * - 생성자를 이용하여 각각의 필드를 초기화 해보세요.
		 */
		Child c1 = new Child();
		System.out.println(c1);
		
		Child c2 = new Child(300);
		System.out.println(c2);
		
		Child c3 = new Child("벤츠");
		System.out.println(c3);
		
		Child c4 = new Child("세타", "디젤");
		System.out.println(c4);
	}
}





