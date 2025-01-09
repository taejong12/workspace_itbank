package ex05_abstract;

abstract class animal {
	abstract String sound ();
	abstract int legs();
}

class Dog extends animal{
	@Override
	String sound() {
		// TODO Auto-generated method stub
		return "멍멍";
	}

	@Override
	int legs() {
		// TODO Auto-generated method stub
		return 4;
	}
}

class Cat extends animal{
	@Override
	String sound() {
		// TODO Auto-generated method stub
		return "야옹";
	}

	@Override
	int legs() {
		// TODO Auto-generated method stub
		return 4;
	}
}

public class Exam05 {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		System.out.println(d.sound());
		System.out.println(c.sound());
	}
}









