package ex01_class.quiz03;

import java.util.Scanner;

public class Quiz03 {
	private String name;
	private int age;
		
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}



	public static void main(String[] args) {
		/**
		 * Quiz03 클래스
		 * - 이름, 나이 필드(클래스 변수) 생성
		 * - 3개의 객체를 생성 하여 입력 출력 해보세요.
		 */
		Scanner sc = new Scanner(System.in);
		Quiz03[] q = new Quiz03[3];
		
		for(int i=0;i<q.length;i++) {
			// 클래스 배열에서는 반드시 각 인덱스에 
			// 		객체 생성을 해야 한다.
			q[i] = new Quiz03();
			System.out.print("이름 입력 : ");
			q[i].name = sc.next();
			System.out.print("나이 입력 : ");
			q[i].age = sc.nextInt();
		}
		
		for(int i=0;i<q.length;i++) {
			System.out.println("이름 : " + q[i].name);
			System.out.println("나이 : " + q[i].age);
		}
	}
}


