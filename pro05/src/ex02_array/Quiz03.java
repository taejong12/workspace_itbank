package ex02_array;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/**
		 * 호텔 객실 관리 프로그램
		 * 1. 호텔 객실 수는 시작시 입력
		 * 2. 메뉴는 입실, 퇴실, 객실상태, 프로그램종료
		 * 3. 입실 메뉴
		 * - 퇴실되어 있는 방만 입실 가능
		 * - 입실된 방은 다시 입실 할 수 없음
		 * 4. 퇴실 메뉴
		 * - 입실되어 있는 방만 퇴실 가능
		 * - 퇴실된 방은 다시 퇴실 할 수 없음
		 * 5. 객실 상태 : 입실 퇴실 여부 확인
		 */
		// 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 객실 수 입력을 알려주는 출력문
		System.out.print("객실 수 입력 : ");
		// 객실 수 저장하는 변수
		int roomNum = sc.nextInt();
		
		// 객실 수에 해당하는 배열
		// 기본 데이터 타입의 기본값 0, false;
		// false - 퇴실, true - 입실
		// 0 번 인덱스 부터 생성
		boolean[] room = new boolean[roomNum];
		
		System.out.println("객실 수는 총 " + 
		roomNum + " 객실 입니다.");
		
		while(true) {
			System.out.println("### 케이지 호텔 ###");
			System.out.println("1. 입실");
			System.out.println("2. 퇴실");
			System.out.println("3. 객실 정보 확인");
			System.out.println("0. 프로그램 종료");
			System.out.print(">>> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("### 입실 ###");
				int inRoom = 0;
				
				do {
					System.out.print("입실 할 객실 번호 입력 :");
					inRoom = sc.nextInt();
				} while(inRoom < 0 || inRoom > roomNum);
				
				if(room[inRoom-1]) { // 입실되어 있는 상태
					System.out.println("비어 있지 않아 입실이 불가능합니다.");
				} else { // 퇴실 또는 비어있는 상태
					room[inRoom-1] = true;
					System.out.println(inRoom 
							+ "번 객실에 입실처리 되었습니다.");
				}
				break;
			case 2:
				System.out.println("### 퇴실 ###");
				int outRoom = 0;
				
				do {
					System.out.print("퇴실 할 객실 번호 입력 :");
					outRoom = sc.nextInt();
				} while(outRoom < 0 || outRoom > roomNum);
				
				if(room[outRoom-1]) { // 입실되어 있는 상태
					System.out.println(outRoom 
							+ " 번 객실에 퇴실처리 되었습니다.");
					room[outRoom-1] = false;
					
				} else { // 퇴실 또는 비어있는 상태
					System.out.println("비어 있는 상태 입니다. " 
							+ "객실을 확인하세요.");
				}
				break;
			case 3:
				System.out.println("### 객실 상태 확인 ###");
				for(int i=0;i<roomNum;i++) {
					if(room[i]) {
						System.out.println(i+1 
								+ " 객실 : 사용중" );
					} else {
						System.out.println(i+1 
								+ " 객실 : 비어있음");
					}
				}
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("메뉴 선택이 잘못 되었습니다.");
			}
		}
	}
}












