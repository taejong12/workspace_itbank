package quiz01;

public class UserMain {
	public static void main(String[] args) {
		UserService us = 
				new UserService();
		
		while(true) {
			int menu = us.menu();
			
			switch(menu) {
			case 1:
				us.insert();
				break;
			case 2:
				us.delete();
				break;
			case 3:
				us.find();
				break;
			case 4:
				us.update();
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