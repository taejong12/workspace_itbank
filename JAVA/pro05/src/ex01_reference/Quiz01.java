package ex01_reference;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/**
		 * 관리자 아이디 : admin
		 * 비밀번호 : 9999
		 * 일반 사용자 아이디 : user01
		 * 비밀번호 : 1234
		 *
		 * 관리자로 로그인 하면 "관리자 페이지 입니다." 출력
		 * 일반 사용자로 로그인 하면 "일반 페이지 입니다." 출력
		 */
		// 관리자 아이디 및 비밀번호
		String adminId = "admin";
		String adminPw = "9999";
		// 일반 사용자 아이디 및 비밀번호
		String userId = "user01";
		String userPw = "1234";
		
		// 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 아이디 및 비밀번호 입력 
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		if(id.equals(adminId)) {
			if(pw.equals(adminPw)) {
				System.out.println("관리자 페이지 입니다.");
			} else {
				System.out.println("로그인에 실패 했습니다.");
			}
		} else if (id.equals(userId)) {
			if(pw.equals(userPw)) {
				System.out.println("일반 페이지 입니다.");
			} else {
				System.out.println("로그인에 실패 했습니다.");
			}
		} else {
			System.out.println("로그인에 실패 했습니다.");
		}
		
		if(id.equals(adminId) && pw.equals(adminPw)) {
			System.out.println("관리자 페이지 입니다.");
		} else if(id.equals(userId) && pw.equals(userPw)) {
			System.out.println("일반 페이지 입니다.");
		} else {
			System.out.println("로그인에 실패 했습니다.");
		}
	}
}


