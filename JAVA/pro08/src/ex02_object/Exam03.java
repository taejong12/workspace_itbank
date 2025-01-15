package ex02_object;

class Test {
	int num;
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸");
	}
}
public class Exam03 {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = t1;
		
		t1.num = 10;
		System.out.println(t1.num);
		System.out.println(t2.num);
		t2.num = 20;
		System.out.println(t1.num);
		System.out.println(t2.num);
		
		System.out.println(t1.equals(t2));
	}
}