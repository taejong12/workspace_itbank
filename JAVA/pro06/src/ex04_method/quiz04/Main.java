package ex04_method.quiz04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProfessorService ps = new ProfessorService();
		StudentService ss = new StudentService();
		
		Professor[] pf = null;
		
		while(true) {
			System.out.println("1. 교수 정보 입출력");
			System.out.println("2. 학생 정보 입출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				pf = ps.main();
				break;
			case 2:
				ss.main(pf);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴 번호가 없습니다.");
			}
		}
	}
}