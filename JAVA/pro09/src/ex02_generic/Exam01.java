package ex02_generic;

class Box<T> {
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}

public class Exam01 {
	public static void main(String[] args) {
		Box<String> b1 = new Box<String>();
		b1.set("홍길동");
		System.out.println(b1.get());
		
		Box<Integer> b2 = new Box<Integer>();
		b2.set(100);
		System.out.println(b2.get());
	}
}



