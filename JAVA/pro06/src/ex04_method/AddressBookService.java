package ex04_method;

import java.util.Scanner;

public class AddressBookService {
	Scanner sc = new Scanner(System.in);
	AddressBook[] ab = new AddressBook[3];
	int idx = 0;
	
	public void title() {
		System.out.println("### 주소록 ###");
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 주소록 종료");
		System.out.print("메뉴 선택 : ");
	}
	
	public void main() {		
		while(true) {
			title();
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("### 주소록 입력 ###");
				ab[idx] = new AddressBook();
				System.out.print("이름 입력 : ");
				ab[idx].setName(sc.next());
				System.out.print("주소 입력 : ");
				ab[idx].setAddress(sc.next());
				System.out.print("전화번호 입력 : ");
				ab[idx].setTelnum(sc.next());
				System.out.print("이메일 입력 : ");
				ab[idx].setEmail(sc.next());
				idx++;
				break;
			case 2:
				for(int i=0;i<idx;i++) {
					System.out.println("이름 : " 
							+ ab[i].getName());
					System.out.println("주소 : " 
							+ ab[i].getAddress());
					System.out.println("전화번호 : " 
							+ ab[i].getTelnum());
					System.out.println("이메일 : " 
							+ ab[i].getEmail());
				}
				break;
			case 0:
				System.out.println("주소록 종료");
				return;
			default:
				System.out.println("선택된 메뉴 번호가 없습니다.");
			}
		}
	}
}