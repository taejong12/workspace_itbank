package ex05_text.quiz01;

public class ScoreMain {
	public static void main(String[] args) throws Exception {
		ScoreService ss = 
				new ScoreServiceImpl();
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 1:
				ss.input();
				break;
			case 2:
				ss.output();
				break;
			case 3:
				ss.modify();
				break;
			case 4:
				ss.delete();
				break;
			case 0:
				System.out.println("프로그램 종료");
				System.exit(0);
			case 999:
				System.out.println("숫자 입력만 유효 합니다.");
				break;
			default:
				System.out.println("선택된 메뉴 번호가 없습니다.");
			}
		}
	}
}