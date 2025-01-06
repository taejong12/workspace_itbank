package ex01_class;

import java.util.Scanner;

// 클래스는 클래스의 내용을 복사한 객체를 만들어서 사용
// 그래서 클래스 설계도라는 표현을 많이 사용함.
// 클래스도 결국에는 데이터 타입이 되는 것이다.
// 기본 데이터 타입 :  int, double, short, boolean
// 배열 : int[], double[], short[], boolean[]
// 클래스 : 데이터타입, 사용되는 기능을 구분 없이 구현 가능
public class Exam04 {
	// 필드
	String name;
	int age;
	double weight;
	Scanner sc = new Scanner(System.in);
	//
	
	// 메서드 
	public void input() {
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("몸무게 입력 : ");
		weight = sc.nextDouble();
	}
	//
}