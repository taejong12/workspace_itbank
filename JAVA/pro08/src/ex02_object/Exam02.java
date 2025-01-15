package ex02_object;

class User1 {
	String name;
	int age;
	
	public String toString() {
		return this.name + " 님의 나이는 "
				+ this.age + " 살 입니다.";
	}
}

public class Exam02 {
	public static void main(String[] args) {
		User1 u1 = new User1();
		u1.name = "홍길동";
		u1.age = 12;
		
		System.out.println(u1.name + " 님의 나이는 "
				+ u1.age + " 살 입니다.");
		
		User1 u2 = new User1();
		u2.name = "이순신";
		u2.age = 13;
		
		System.out.println(u2.name + " 님의 나이는 "
				+ u2.age + " 살 입니다.");
		
		System.out.println(u1);
		System.out.println(u2);
	}
}