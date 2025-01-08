package ex04_method.quiz02;

import java.util.Scanner;

public class Quiz02 {
	/**
	 * User 클래스
	 * - 아이디, 암호, 이름, 이메일 
	 * - getter/setter 생성
	 * 
	 * UserService 클래스 
	 * - User 클래스의 입/출력 기능 구현
	 * 
	 * Quiz02 클래스
	 * - UserService 를 이용하여 실행 기능 구현
	 */
	public static void main(String[] args) {
		UserService us = new UserService();
		
		while(true) {			
			int menu = us.menuSelect();
			
			switch(menu) {
			case 1:
				us.input();
				break;
			case 2:
				us.output();
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












