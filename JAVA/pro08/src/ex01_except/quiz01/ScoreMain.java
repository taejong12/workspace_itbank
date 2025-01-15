package ex01_except.quiz01;

public class ScoreMain {
	public static void main(String[] args) {
		ScoreService ss = new ScoreServiceImpl();
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 1:
				ss.input();
				break;
			case 2:
				ss.output();
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