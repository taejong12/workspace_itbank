package ex03_set.quiz01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserServiceImpl implements UserService{
	List<User> userList;
	Set<User> loginList;
	Scanner sc;
	
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
		userList = new ArrayList<User>();
		loginList = new HashSet<User>();
		sc = new Scanner(System.in);
	}

	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 가입");
		System.out.println("2. 탈퇴");
		System.out.println("3. 로그인");
		System.out.println("4. 로그아웃");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		return sc.nextInt();
	}

	@Override
	public void join() {
		// TODO Auto-generated method stub
		User user = new User();
		System.out.println("### 회원 가입 ###");
		System.out.print("아이디 입력 : ");
		user.setId(sc.next());
		System.out.print("암호 입력 : ");
		user.setPwd(sc.next());
		System.out.print("이름 입력 : ");
		user.setName(sc.next());
		
		userList.add(user);
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("### 회원 탈퇴 ###");
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		
		for(User user : userList) {
			if(id.equals(user.getId())) {
				userList.remove(user);
				loginList.remove(user);
				System.out.println(id 
						+ " 님이 탈퇴 완료 되었습니다.");
				return;
			}
		}
		System.out.println(id + "님의 정보가 없습니다.");
	}

	@Override
	public String login() {
		// TODO Auto-generated method stub
		System.out.println("### 로그인 ###");
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("암호 입력 : ");
		String pwd = sc.next();
		
		for(User user : userList) {
			if(user.getId().equals(id) && 
					user.getPwd().equals(pwd)) {
				System.out.println(id + "님 환영합니다.");
				loginList.add(user);
				return id;
			}
		}
		System.out.println("아이디나 비밀번호가 틀렸습니다."
				+ " 다시 로그인 하세요.");
		return null;
	}

	@Override
	public void logout(String id) {
		// TODO Auto-generated method stub
		System.out.println(id + "님 로그아웃 되었습니다.");
		for(User user:loginList) {
			if(user.getId().equals(id)) {
				loginList.remove(user);
			}
		}
	}
}







