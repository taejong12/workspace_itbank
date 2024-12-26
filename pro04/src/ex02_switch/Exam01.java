package ex02_switch;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("입력");
		} else if (menu == 2) {
			System.out.println("출력");
		} else if (menu == 3) {
			System.out.println("수정");
		} else if (menu == 4) {
			System.out.println("삭제");
		} else {
			System.out.println("잘못된 메뉴 번호");
		}
		
		switch(menu) {
		case 1:
			System.out.println("입력");
			break;
		case 2:
			System.out.println("출력");
			break;
		case 3:
			System.out.println("수정");
			break;
		case 4:
			System.out.println("삭제");
			break;
		default:
			System.out.println("잘못된 메뉴 번호");
		}
	}
}

