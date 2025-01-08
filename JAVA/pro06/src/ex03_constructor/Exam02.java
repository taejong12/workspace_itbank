package ex03_constructor;

import java.util.Scanner;

class Test1 {
	private int num;
	private String str;
	

	
	// 생성자에 매개변수를 사용할 경우 
	// - 객체 생성 시 매개변수가 없으면 예외가 발생
	// - 그냥 객체를 생성할 때 예외를 없애기 위해 
    //		반드시 디폴트 생성자를 만들어야 한다.
	public Test1(int num, String str) {
		this.num = num;
		this.str = str;
	}
	public Test1() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNum() {
		return num;
	}
	public String getStr() {
		return str;
	}
}

public class Exam02 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1(10, "홍길동");
		
		System.out.println(t1.getNum());
		System.out.println(t1.getStr());
		
		System.out.println(t2.getNum());
		System.out.println(t2.getStr());
		
		String name = new String("이순신");
		System.out.println(name);
		
		Scanner sc = new Scanner(System.in);
	}
}





