package ex04_while;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		main:while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("입력 기능");break;
			case 2:
				System.out.println("출력 기능");break;
			case 3:
				System.out.println("수정 기능");break;
			case 4:
				System.out.println("삭제 기능");break;
			case 0:
				System.out.println("프로그램 종료");
				// return; // 메서드를 종료 하는 키워드
				break main;
			default:
				System.out.println("잘못된 메뉴 선택");
			}
		}
	}
}



