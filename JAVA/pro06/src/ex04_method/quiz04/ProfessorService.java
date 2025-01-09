package ex04_method.quiz04;

import java.util.Scanner;

public class ProfessorService {
	Scanner sc = new Scanner(System.in);
	Professor[] pf = new Professor[3];
	int idx = 0;
	
	
	public int menu() {
		System.out.println("### 교수 정보 ###");
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 교수 정보 입출력 종료");
		System.out.print("메뉴 선택 : ");
		return sc.nextInt();
	}
	
	public void input() {
		pf[idx] = new Professor();
		System.out.println("### 교수 정보 입력 ###");
		System.out.print("교수 이름 입력 : ");
		pf[idx].setName(sc.next());
		System.out.print("학과 입력 : ");
		pf[idx].setDepart(sc.next());
		idx++;
	}
	
	public void output() {
		System.out.println("### 교수 정보 출력 ###");
		for(int i=0;i<idx;i++) {
			System.out.println("이름 : " + pf[i].getName());
			System.out.println("학과 : " + pf[i].getDepart());
		}
	}
	
	public Professor[] main() {
		while(true) {
			int menu = menu();
			switch(menu) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 0:
				System.out.println("교수 정보 입출력 종료");
				return pf;
			default:
				System.out.println("선택된 메뉴 번호가 없습니다.");
			}
		}
	}
}