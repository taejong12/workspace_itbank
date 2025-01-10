package ex02_list.quiz02;

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScoreService ss = new ScoreServiceImpl();
		
		while(true) {
			ss.menu();
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				ss.input();
				break;
			case 2:
				ss.output();
				break;
			case 3:
				ss.delete();
				break;
			case 4:
				ss.modify();
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