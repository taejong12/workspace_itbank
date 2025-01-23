package quiz01;

import java.util.List;
import java.util.Scanner;

public class UserService {
	Scanner sc;
	UserDAO dao;
	
	public UserService() {
		sc = new Scanner(System.in);
		dao = new UserDAO();
	}

	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 회원가입");
		System.out.println("2. 회원삭제");
		System.out.println("3. 회원검색");
		System.out.println("4. 회원정보수정");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		return sc.nextInt();
	}

	public void insert() {
		// TODO Auto-generated method stub
		User u = new User();
		System.out.print("아이디 입력 : ");
		u.setId(sc.next());
		System.out.print("암호 입력 : ");
		u.setPwd(sc.next());
		System.out.print("이름 입력 : ");
		u.setName(sc.next());
		System.out.print("이메일 입력 : ");
		u.setEmail(sc.next());
		
		int result = dao.insert(u);
		if(result >= 1) {
			System.out.println("회원정보가 저장되었습니다.");
		} else {
			System.out.println("에러가 발생했습니다. 다시 입력하세요.");
		}
	}

	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("### 회원 삭제 ###");
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("암호 입력 : ");
		String pwd = sc.next();
		
		int result = dao.delete(id, pwd);
		if(result >= 1) {
			System.out.println(id 
				+ "님의 정보가 삭제 되었습니다.");
		} else {
			System.out.println("아이디나 "
			    + "암호가 틀립니다. 다시 확인 후 삭제하세요.");
		}
		
	}

	public void find() {
		// TODO Auto-generated method stub
		System.out.println("### 회원 검색 ###");
		System.out.println("1. 아이디 검색");
		System.out.println("2. 이름 검색");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		
		String sub = null;
		switch(menu) {
		case 1:
			sub = "아이디";
			break;
		case 2:
			sub = "이름";
			break;
		default:
			System.out.println("선택된 메뉴 번호가 없어 "
					+ "메인메뉴로 이동합니다.");
			return;
		}
		System.out.print(sub + " 입력 : ");
		String id = sc.next();
		List<User> userList = dao.find(sub, id);
		
		for(User u : userList) {
			System.out.println("아이디 : " + u.getId());
			System.out.println("암호 : " + u.getPwd());
			System.out.println("이름 : " + u.getName());
			System.out.println("이메일 : " + u.getEmail());
			System.out.println("가입일 : " + u.getJoinDate());			
		}
		
	}

	public void update() {
		// TODO Auto-generated method stub
		User u = new User();
		System.out.print("### 회원 정보 수정 ###");
		System.out.print("아이디 입력 : ");
		u.setId(sc.next());
		System.out.print("수정할 암호 입력 : ");
		u.setPwd(sc.next());
		System.out.print("수정할 이름 입력 : ");
		u.setName(sc.next());
		System.out.print("수정할 이메일 입력 : ");
		u.setEmail(sc.next());
		
		int result = dao.update(u);
		if(result >= 1) {
			System.out.println("수정을 정상적으로 완료 했습니다.");
		} else {
			System.out.println("오류가 발생했습니다. 다시 확인하세요.");
		}
	}
	
}


