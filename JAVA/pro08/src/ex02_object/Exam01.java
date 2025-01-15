package ex02_object;

class User {
	String name;

	public String toString() {
		return name;
	}
}

public class Exam01 {
	public static void main(String[] args) {
		User u1 = new User();
//		객체를 출력하면 toString() 이 출력된다.
//		System.out.println(u1);
//		System.out.println(u1.toString());
		u1.name = "홍길동";
		User u2 = new User();
		u2.name = "이순신";
		
		System.out.println(u1);
		System.out.println(u2);
	}
}