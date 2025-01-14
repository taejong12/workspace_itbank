package ex04_map.quiz02;

public class NavigationMain {
	public static void main(String[] args) {
		NavigationService ns =
				new NavigationServiceImpl();
		
		while(true) {
			int menu = ns.menu();
			
			switch(menu) {
			case 1:
				ns.input();
				break;
			case 2:
				ns.select();
				break;
			case 3:
				ns.modify();
				break;
			case 4:
				ns.delete();
				break;
			case 5:
				ns.init();
				break;
			case 6:
				ns.lastVisit();
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