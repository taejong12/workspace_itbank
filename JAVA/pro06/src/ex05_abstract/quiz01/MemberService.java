package ex05_abstract.quiz01;

import java.util.Scanner;

public class MemberService extends Template{

	Scanner sc = new Scanner(System.in);
	Member[] m = new Member[3];
	int idx = 0;
	
	@Override
	public int menu() {
		System.out.println("MemberClass");
		System.out.println("1.입력");
		System.out.println("2.출력");
		System.out.println("3.이전페이지");
		System.out.println("선텍: ");
		
		int menu = sc.nextInt();
		return menu;
	}

	@Override
	public void input() {
		m[idx] = new Member();
		System.out.println("아이디 입력: ");
		m[idx].setId(sc.next());
		System.out.println("암호 입력: ");
		m[idx].setPw(sc.nextInt());
		System.out.println("이름 입력: ");
		m[idx].setName(sc.next());
		System.out.println("이메일 입력: ");
		m[idx].setEmail(sc.next());
		idx++;
	}

	@Override
	public void output() {
		for(int i=0;i<idx;i++) {
			System.out.println("아이디: "+m[i].getId());
			System.out.println("암호: "+m[i].getPw());
			System.out.println("이름: "+m[i].getName());
			System.out.println("이메일: "+m[i].getEmail());
		}
	}
	
}
