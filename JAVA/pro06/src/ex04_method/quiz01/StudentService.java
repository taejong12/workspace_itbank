package ex04_method.quiz01;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}
	
	public Student input() {
		Student stu = new Student();
		System.out.print("이름 입력 : ");
		stu.setName(sc.next());
		System.out.print("국어 점수 입력 : ");
		stu.setKor(sc.nextInt());
		System.out.print("영어 점수 입력 : ");
		stu.setEng(sc.nextInt());
		System.out.print("수학 점수 입력 : ");
		stu.setMath(sc.nextInt());
		stu.setTotal();
		stu.setAvg();
		// return 에서 넘길 수 있는 값은 한가지만 가능
		return stu;
	}
	
	public void output(Student[] stu, int idx) {
		for(int i=0;i<idx;i++) {
			System.out.println("이름 : " 
					+ stu[i].getName());
			System.out.println("총점 : " 
					+ stu[i].getTotal());
			System.out.println("평균 : " 
					+ stu[i].getAvg());
		}
	}
}