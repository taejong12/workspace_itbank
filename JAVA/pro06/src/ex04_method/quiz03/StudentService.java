package ex04_method.quiz03;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	StudentChild[] stu = new StudentChild[3];
	int idx = 0;
	
	public int menu() {
		System.out.println("### 학생 정보 ###");
		System.out.println("1. 입력 ");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void input() {
		stu[idx] = new StudentChild();
		System.out.println("### 입력 ###");
		System.out.print("이름 입력 : ");
		stu[idx].setName(sc.next());
		System.out.print("국어 점수 입력 : ");
		stu[idx].setKor(sc.nextInt());
		System.out.print("영어 점수 입력 : ");
		stu[idx].setEng(sc.nextInt());
		System.out.print("수학 점수 입력 : ");
		stu[idx].setMath(sc.nextInt());
		System.out.print("음악 점수 입력 : ");
		stu[idx].setMusic(sc.nextInt());
		System.out.print("체육 점수 입력 : ");
		stu[idx].setSport(sc.nextInt());
		stu[idx].setTotal();
		stu[idx].setAvg();
		idx++;
	}
	
	public void output() {
		for(int i=0;i<idx;i++) {
			System.out.println("이름 : " + stu[i].getName());
			System.out.println("총점 : " + stu[i].getTotal());
			System.out.println("평균 : " + stu[i].getAvg());
			
		}
	}

}