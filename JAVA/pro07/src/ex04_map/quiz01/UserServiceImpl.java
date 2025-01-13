package ex04_map.quiz01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserServiceImpl 
	implements UserService{
	Scanner sc;
	Map<String, User> userList;
	
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		userList = new HashMap<String, User>();
	}
	
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 회원가입");
		System.out.println("2. 회원출력");
		System.out.println("3. 회원삭제");
		System.out.println("4. 회원수정");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		return sc.nextInt();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		User user = new User();
		System.out.print("아이디 입력 : ");
		user.setId(sc.next());
		
		Set<String> key = userList.keySet();
		if(key.contains(user.getId())) {
			System.out.println("같은 아이디가 존재합니다. "
					+ "아이디를 다시 입력 하세요.");
		} else {
			System.out.println("회원 가입이 가능합니다.");
			System.out.print("암호 입력 : ");
			user.setPwd(sc.next());
			System.out.print("이름 입력 : ");
			user.setName(sc.next());
			
			userList.put(user.getId(), user);
		}
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		Set<String> key = userList.keySet();
		
		if(key.isEmpty()) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			for(String k : key) {
				User user = userList.get(k);
				System.out.println("아이디 : " 
						+ user.getId());
				System.out.println("암호 : " 
						+ user.getPwd());
				System.out.println("이름 : " 
						+ user.getName());
			}
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.print("삭제할 아이디 입력 : ");
		String id = sc.next();
		System.out.print("암호 입력 : ");
		String pwd = sc.next();
		
//		if(userList.containsKey(id)) {
//			User user = userList.get(id);
//			if(user.getPwd().equals(pwd)) {
//				userList.remove(id);
//				System.out.println(id + 
//						" 회원 정보가 삭제되었습니다.");
//			} else {
//				System.out.println("암호가 틀려 삭제할 수 없습니다.");
//			}
//			
//		} else {
//			System.out.println(id + 
//					" 회원 정보가 없습니다. 다시 확인 하세요.");
//		}
		User user = userList.get(id);
		if(user == null) {
			System.out.println("해당 하는 "
					+ "아이디가 존재하지 않습니다.");
		} else {
			if(user.getPwd().equals(pwd)) {
				userList.remove(id);
				System.out.println(id + " 정보가 "
						+ "삭제 되었습니다.");
			} else {
				System.out.println("암호가 틀립니다. 다시 확인하세요.");
			}
		}
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		// 아이디까지 수정하려면 ...
		System.out.print("수정할 아이디 입력 : ");
		String id = sc.next();
		
		if(userList.containsKey(id)) {
			input();
			userList.remove(id);
		} else {
			System.out.println(id + " 회원 정보가 없습니다.");
		}	
	}
}






