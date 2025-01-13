package ex04_map.quiz01;

public class UserMain {
	public static void main(String[] args) {
		UserService us =
				new UserServiceImpl();
		
		while(true) {
			int menu = us.menu();
			
			switch(menu) {
			case 1:
				us.input();
				break;
			case 2:
				us.output();
				break;
			case 3:
				us.delete();
				break;
			case 4:
				us.modify();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴번호가 없습니다.");
			}
		}
	}
}