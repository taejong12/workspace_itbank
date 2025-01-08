package ex03_constructor;

class Car {
	private int maxSpeed;
	private int minSpeed;
	private String carName;
	
	public Car() {
		minSpeed = 0;
		maxSpeed = 100;
		carName = "포르쉐";
	}
	
	public Car(int maxSpeed) {
		this(); // 디폴트 생성자 호출
		this.maxSpeed = maxSpeed;
		
	}
	
	public Car(int maxSpeed, String carName) {
		this();
		this.maxSpeed = maxSpeed;
		this.carName = carName;
	}
	
	public Car(String carName) {
		this();
		this.carName = carName;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getMinSpeed() {
		return minSpeed;
	}
	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
}

public class Exam03 {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.getMinSpeed());
		System.out.println(c1.getMaxSpeed());
		System.out.println(c1.getCarName());
		
		Car c2 = new Car(250);
		System.out.println(c2.getMinSpeed());
		System.out.println(c2.getMaxSpeed());
		System.out.println(c2.getCarName());
	
		Car c3 = new Car("BMW");
		System.out.println(c3.getMinSpeed());
		System.out.println(c3.getMaxSpeed());
		System.out.println(c3.getCarName());
	}
}









