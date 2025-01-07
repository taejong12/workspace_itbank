package ex01_class;

public class Exam07 {
	// static : 정적, 고정, 공용 이라는 의미를 가진다.
	// static 키워드가 있는 것들은 프로그램 시작과 동시에 
	// 	메모리에 탑재 된다.
	static int num1;
	
	public void test1() {
		System.out.println(num1++);
	}
	
	public static void main(String[] args) {
		Exam07 e1 = new Exam07();
		
		e1.test1();
		e1.test1();
		e1.test1();
		
		Exam07 e2 = new Exam07();
		
		e2.test1();
		e2.test1();
		e2.test1();
		
		// static 이 붙으면 num1은 객체 단위이던
		// 클래스 단위이던 같은 변수다.
		System.out.println(Exam07.num1);
		System.out.println(e1.num1);
		System.out.println(e2.num1);
	}
}


