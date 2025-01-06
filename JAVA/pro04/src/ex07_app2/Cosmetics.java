package ex07_app2;

import java.util.Scanner;

public class Cosmetics {
	public static void main(String[] args) {
		// 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 틴트 수량 저장 
		int tint = 0;
		// 립클로즈 수량 저장
		int lipclose = 0;
		// 립밤 수량 저장
		int lipbalm = 0;
		// 팔레트 수량 저장
		int palette = 0;
		// 단색아이쉐도우 수량 저장
		int eyeShadow = 0;
		// 아이쉐도우블러쉬 수량 저장
		int blush = 0;
		// 쿠션 수량 저장
		int cushion = 0;
		// 리퀴드 수량 저장
		int liquid = 0;
		
		while(true) {
			// 메인 메뉴 출력
			System.out.println("1. 색조화장품");
			System.out.println("2. 아이쉐도우");
			System.out.println("3. 파운데이션");
			System.out.println("4. 결제");
			System.out.println("0. 프로그램 종료");
			System.out.print(">>> ");
			
			// 메뉴 선택 저장 변수 및 입력
			int menu = sc.nextInt();
			
			// 각 메뉴별 실행 내용 작성
			switch(menu) {
			case 1: // 색조 화장품 메뉴 구성
				System.out.println("1. 틴트\t\t15000원");
				System.out.println("2. 립클로즈\t13000원");
				System.out.println("3. 립밤\t\t6000원");
				System.out.print(">>> ");
				
				menu = sc.nextInt();
				
				switch(menu) {
				case 1: // 립스틱 선택 시
					System.out.print("틴트 수량 입력 : ");
					tint += sc.nextInt();
					break;
				case 2: // 립크로즈 선택 시
					System.out.print("립클로즈 수량 입력 : ");
					lipclose += sc.nextInt();
					break;
				case 3: // 립밤 선택 시
					System.out.print("립밤 수량 입력 : ");
					lipbalm += sc.nextInt();
					break;
				default:
					System.out.println("선택된 색조 화장품이 없습니다.");
				}
				break;
			case 2: // 아이쉐도우 메뉴 구성
				System.out.println("1. 팔레트\t\t23000원");
				System.out.println("2. 단색아이쉐도우\t7000원");
				System.out.println("3. 아이쉐도우블러쉬\t4000원");
				System.out.print(">>> ");
				
				menu = sc.nextInt();
				
				switch(menu) {
				case 1: // 팔레트 선택 시
					System.out.print("팔레트 수량 입력 : ");
					palette += sc.nextInt();
					break;
				case 2: // 단색 아이쉐도우 선택시
					System.out.print("단색 아이쉐도우 수량 입력 : ");
					eyeShadow += sc.nextInt();
					break;
				case 3: // 아이쉐도우블러쉬 선택시
					System.out.print("아이쉐도우블러쉬 수량 입력 : ");
					blush += sc.nextInt();
					break;
				default:
					System.out.println("잘못된 메뉴 입니다.");
				}
				
				break;
			case 3: // 파운데이션 메뉴 구성
				System.out.println("1. 쿠션\t\t28000원");
				System.out.println("2. 리퀴드\t\t25000원");
				System.out.print(">>> ");
				
				menu = sc.nextInt();
				
				switch(menu) {
				case 1:
					System.out.print("쿠션 수량 입력 : ");
					cushion += sc.nextInt();
					break;
				case 2:
					System.out.print("리퀴드 수량 입력 : ");
					liquid += sc.nextInt();
					break;
				default:
					System.out.println("잘못 선택된 메뉴 입니다.");
				}
				break;
			case 4: // 결제
				System.out.println("########## 결제 ##########");

				// 구입한 제품만 출력
				if(tint > 0) {
					System.out.println("틴트\t\t: " + tint + " - " + (tint * 15000) + "원");
				}
				if(lipclose > 0) {
					System.out.println("립클로즈\t: " + lipclose + " - " + (lipclose * 13000) + "원");
				}
				if(lipbalm > 0) {
					System.out.println("립밤\t\t: " + lipbalm + " - " + (lipbalm * 6000) + "원");
				}
				if(palette > 0) {
					System.out.println("팔레트\t\t: " + palette + " - " + (palette * 23000) + "원");
				}
				if(eyeShadow > 0) {
					System.out.println("단색아이쉐도우\t: " + eyeShadow + " - " + (eyeShadow * 7000) + "원");
				}
				if(blush > 0) {
					System.out.println("아이쉐도우블러쉬\t: " + blush + " - " + (blush * 4000) + "원");
				}
				if(cushion > 0) {
					System.out.println("쿠션\t\t: " + cushion + " - " + (cushion * 28000) + "원");
				}
				if(liquid > 0) {
					System.out.println("리퀴드\t\t: " + liquid + " - " + (liquid * 25000) + "원");
				}
				
				// 총 합계 금액 
				int sum = (tint * 15000) + (lipclose * 13000) +
						(lipbalm * 6000)+ (palette * 23000) + 
						(eyeShadow * 7000) + (blush * 4000) + 
						(cushion * 28000) + (liquid * 25000);
				
				// 수량 초기화 
				tint = lipclose = lipbalm = palette = eyeShadow = blush = cushion = liquid = 0; 
						 
				System.out.println("총합\t\t: " + sum + "원");
				break;
			case 0: // 프로그램 종료
				System.out.println("프로그램 종료");
				return;
			
			default: // 잘못 메뉴 번호를 선택 했을 때
				System.out.println("잘못된 선택 번호 입니다.");
			}
		}
	}
}