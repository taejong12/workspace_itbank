package ex02_inheritance.quiz01;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		/**
		 * UserParent 클래스
		 * - 아이디, 비밀번호
		 * 
		 * UserChild 클래스
		 * - UserParent 상속 
		 * - 이름, 이메일 추가
		 * 
		 * Quiz01
		 * - UserChild 객체 배열 3
		 * - 입력
		 * - 출력
		 * - 프로그램 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		UserChild[] uc = new UserChild[3];
		int i = 0;
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				uc[i] = new UserChild();
				System.out.println("### 입력 ###");
				System.out.print("아이디 입력 : ");
				uc[i].setId(sc.next());
				System.out.print("암호 입력 : ");
				uc[i].setPwd(sc.next());
				System.out.print("이름 입력 : ");
				uc[i].setName(sc.next());
				System.out.print("이메일 입력 : ");
				uc[i].setEmail(sc.next());
				i++;
				break;
			case 2:
				if(i == 0) {
					System.out.println("출력할 정보가 없습니다.");
				} else {
					for(int j=0;j<i;j++) {
						System.out.println
							("아이디 : " + uc[j].getId());
						System.out.println
							("암호 : " + uc[j].getPwd());
						System.out.println
							("이름 : " + uc[j].getName());
						System.out.println
							("이메일 : " + uc[j].getEmail());
					}
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