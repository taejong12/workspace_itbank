package ex01_class;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/**
		 * Person 클래스 생성
		 * - 이름, 나이, 주소를 가진 클래스
		 * - getter/setter 로 입출력
		 * 
		 * Quiz02 클래스
		 * - 이름, 나이, 주소를 입력 및 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		Person ps = new Person();
		
		System.out.print("이름 입력 : ");
		ps.setName(sc.next());
		System.out.print("주소 입력 : ");
		ps.setAddress(sc.next());
		System.out.print("나이 입력 : ");
		ps.setAge(sc.nextInt());
		
		System.out.println(ps.getName());
		System.out.println(ps.getAddress());
		System.out.println(ps.getAge());
	}
}




