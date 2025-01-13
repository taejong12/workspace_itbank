package ex03_set.quiz01;

public class UserMain {
	public static void main(String[] args) {
		UserService us = new UserServiceImpl();
		String loginId = null;
		
		while(true) {
			int menu = us.menu();
			
			switch(menu) {
			case 1:
				if(loginId == null) {
					us.join();	
				} else {
					System.out.println("로그아웃 후에 사용 가능합니다.");
				}
				
				break;
			case 2:
				if(loginId != null) {
					us.withdrawal();
					loginId = null;
				}else {
					System.out.println("로그인 후에 사용 가능합니다.");
				}
				break;
			case 3:
				if (loginId == null) {
					loginId = us.login();	
				} else {
					System.out.println("로그아웃 후에 사용 가능합니다.");
				}
				
				break;
			case 4:
				if(loginId != null) {
					us.logout(loginId);
					loginId = null;
				} else {
					System.out.println("로그인 후에 사용 가능합니다.");
				}
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