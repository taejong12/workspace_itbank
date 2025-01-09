package ex05_abstract;

class Parent {
	public void a() {
		System.out.println("Parent a() 메서드");
	}
}
class Child extends Parent {
	public void b() {
		System.out.println("Child b() 메서드");
	}
}

public class Exam04 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		p1.a();
		
		c1.a();
		c1.b();
		
		Parent p2 = new Child();
		p2.a();
		
		Child c2 = (Child) p2;
		c2.a();
		c2.b();
		
		Object obj1 = new Parent();
		Object obj2 = new Child();
		Object obj3 = new Exam04();
		
		Parent p3 = (Parent)obj1;
		Child c3 = (Child)obj2;
		Exam04 ee = (Exam04)obj3;
	}
}










