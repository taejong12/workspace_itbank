package ex04_method.quiz04;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	Student[] stu = new Student[3];
	int idx = 0;
	
	
	public int menu() {
		System.out.println("### 학생 정보 ###");
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 학생 정보 입출력 종료");
		System.out.print("메뉴 선택 : ");
		return sc.nextInt();
	}
	
	public void input() {
		stu[idx] = new Student();
		System.out.println("### " 
				+ stu[idx].getStuNum() 
				+ " 학생 정보 입력 ###");
		System.out.print("학생 이름 입력 : ");
		stu[idx].setName(sc.next());
		System.out.print("학과 입력 : ");
		stu[idx].setDepart(sc.next());
		idx++;
	}
	
	public void output(Professor[] pf) {
		System.out.println("### 학생 정보 출력 ###");
		for(int i=0;i<idx;i++) {
			System.out.println("학번 : " + stu[i].getStuNum());
			System.out.println("이름 : " + stu[i].getName());
			System.out.println("학과 : " + stu[i].getDepart());
			for(int j=0;j<pf.length;j++) {
				if(pf[j] != null) {
					if(stu[i].getDepart().equals(pf[j].getDepart())) {
						System.out.println("담당교수 : " + pf[j].getName());
					}
				}
			}
		}
	}
	
	public void main(Professor[] pf) {
		while(true) {
			int menu = menu();
			switch(menu) {
			case 1:
				input();
				break;
			case 2:
				output(pf);
				break;
			case 0:
				System.out.println("학생 정보 입출력 종료");
				return;
			default:
				System.out.println("선택된 메뉴 번호가 없습니다.");
			}
		}
	}
}