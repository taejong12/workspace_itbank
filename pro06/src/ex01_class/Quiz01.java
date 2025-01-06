package ex01_class;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/**
		 * Student 클래스 생성
		 * - 이름 
		 * - 국어
		 * - 영어
		 * - 수학
		 * - 총점
		 * - 평균
		 * - getter/setter 를 이용하여 값 입력 및 출력 
		 */
		Student stu = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
//		String name = sc.next();
//		stu.setName(name);
		stu.setName(sc.next());
		
		System.out.print("국어 점수 입력 : ");
		stu.setKor(sc.nextInt());
		System.out.print("영어 점수 입력 : ");
		stu.setEng(sc.nextInt());
		System.out.print("수학 점수 입력 : ");
		stu.setMath(sc.nextInt());
		
		stu.setTotal();
		stu.setAvg();
		
		System.out.println("이름 : " + stu.getName());
		System.out.println("총점 : " + stu.getTotal());
		System.out.println("평균 : " + stu.getAvg());
	}
}






