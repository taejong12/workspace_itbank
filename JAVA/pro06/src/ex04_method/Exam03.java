package ex04_method;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		// main 메서드는 프로그램 시작 메서드
		// - 여러 클래스들의 실행을 위한 메서드
		// - main 메서드는 많은 소스를 넣지 않고 
		//		다른 클래스 객체를 사용할 수 있게 만들어준다.
		
		Scanner sc = new Scanner(System.in);
		AddressBookService abs 
			= new AddressBookService();
		Calculator cc = new Calculator();
		
		while(true) {
			System.out.println("1. 계산기");
			System.out.println("2. 주소록");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: // 계산기 클래스
				cc.main();
				break;
			case 2: // 주소록 클래스
				abs.main();
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






