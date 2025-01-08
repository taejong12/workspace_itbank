package ex04_method.quiz02;

import java.util.Scanner;

public class UserService {
	Scanner sc = new Scanner(System.in);
	User[] user = new User[3];
	int idx = 0;
	
	public int menuSelect() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		return sc.nextInt();
	}
	
	public void input() {
		user[idx] = new User();
		System.out.print("아이디 입력 : ");
		user[idx].setId(sc.next());
		System.out.print("암호 입력 : ");
		user[idx].setPwd(sc.next());
		System.out.print("이름 입력 : ");
		user[idx].setName(sc.next());
		System.out.print("이메일 입력 : ");
		user[idx].setEmail(sc.next());
		idx++;
	}
	
	public void output() {
		for(int i=0;i<idx;i++) {
			System.out.println("### " 
					+ user[i].getId() + " ###");
			System.out.println("암호 : " 
					+ user[i].getPwd());
			System.out.println("이름 : " 
					+ user[i].getName());
			System.out.println("이메일 : " 
					+ user[i].getEmail());
		}
	}
	
}









