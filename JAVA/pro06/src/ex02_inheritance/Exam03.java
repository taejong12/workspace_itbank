package ex02_inheritance;

class Test1 {
	String name;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}

public class Exam03 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		
		t.name = "홍길동";
		System.out.println(t.name);
		System.out.println(t);
	}
}
