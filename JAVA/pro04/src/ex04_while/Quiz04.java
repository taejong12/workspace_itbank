package ex04_while;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/**
		 * pw = 1234
		 * 
		 * 1. 로그인 
		 * - pw 맞으면 로그인 성공
		 * - pw 틀리면 로그인 실패
		 * 2. 정보확인
		 * - 로그인이 성공 되어 있으면 "이름 : 홍길동" 출력
		 * - 로그인이 안되어 있으면 로그인하세요 출력
		 * 0. 프로그램 종료
		 */
		Scanner sc = new Scanner(System.in);
		int pw = 1234;
		boolean logon = false;
		
		while(true) {
			
			if(logon) {
				System.out.println("로그인된 id : hong");
			}
			
			System.out.println("1. 로그인");
			System.out.println("2. 정보확인");
			System.out.println("3. 로그아웃");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("로그인 암호 입력 : ");
				int in_pw = sc.nextInt();
				
				if(pw == in_pw) {
					System.out.println("로그인에 성공했습니다.");
					logon = true;
				} else {
					System.out.println("로그인에 실패했습니다.");
				}
				break;
			case 2:
				if(logon) {
					System.out.println("이름 : 홍길동");
				} else {
					System.out.println("로그인 하세요.");
				}
				break;
			case 3:
				if (logon) {
					System.out.println("로그아웃 합니다.");
					logon=false;	
				} else {
					System.out.println("로그인 먼저 하세요.");
				}
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못된 선택");
			}
		}
	}
}












