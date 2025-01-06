package ex02_array;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		// 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 호텔의 층수 입력 
		System.out.print("호텔의 층 수 입력 : ");
		int floor = sc.nextInt();
		
		// 객실 수 입력을 알려주는 출력문
		System.out.print("객실 수 입력 : ");
		// 객실 수 저장하는 변수
		int roomNum = sc.nextInt();
		
		// 객실 수에 해당하는 배열
		// 기본 데이터 타입의 기본값 0, false;
		// false - 퇴실, true - 입실
		// 0 번 인덱스 부터 생성
		boolean[][] room = new boolean[floor][roomNum];
		
		System.out.println("호텔의 총 층은 " + floor 
				+ "층 이고, " +	"각 층의 객실 수는 " + 
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
				int inFloor = 0;
				
				do {
					System.out.print("입실 할 층 입력 : ");
					inFloor = sc.nextInt();
					System.out.print("객실 번호 입력 :");
					inRoom = sc.nextInt();
				} while(inRoom < 0 || inRoom > roomNum ||
						inFloor < 0 || inFloor > floor);				
				if(room[inFloor-1][inRoom-1]) { // 입실되어 있는 상태
					System.out.println("비어 있지 않아 " +
							"입실이 불가능합니다.");
				} else { // 퇴실 또는 비어있는 상태
					room[inFloor-1][inRoom-1] = true;
					System.out.println(
							inFloor + " 층 " + inRoom 
							+ "번 객실에 입실처리 되었습니다.");
				}
				break;
			case 2:
				System.out.println("### 퇴실 ###");
				int outRoom = 0;
				int outFloor = 0;
				
				do {
					System.out.print("퇴실 할 층 입력 : ");
					outFloor = sc.nextInt();
					System.out.print("퇴실 할 객실 번호 입력 :");
					outRoom = sc.nextInt();
				} while(outRoom < 0 || outRoom > roomNum ||
						outFloor < 0 || outFloor > floor);
				
				if(room[outFloor-1][outRoom-1]) { // 입실되어 있는 상태
					System.out.println(outFloor + "층 " +
						outRoom + " 번 객실에 퇴실처리 되었습니다.");
					room[outFloor-1][outRoom-1] = false;
					
				} else { // 퇴실 또는 비어있는 상태
					System.out.println("비어 있는 상태 입니다. " 
							+ "객실을 확인하세요.");
				}
				break;
			case 3:
				System.out.println("### 객실 상태 확인 ###");
				for(int i=0;i<floor;i++) {
					System.out.println(i+1 + "층 정보");
					System.out.println("---------------------");
					for(int j=0;j<roomNum;j++) {
						if(room[i][j]) {
							System.out.println(j+1 
									+ " 객실 : 사용중" );
						} else {
							System.out.println(j+1 
									+ " 객실 : 비어있음");
						}
					}
					System.out.println("=====================");
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