package ex06_app;

import java.util.Scanner;

public class BeautyShop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//립스틱 가격
		int l1 = 2000; // 틴트
		int l2 = 3000; // 립클로즈
		int l3 = 2500; // 립밤

		//아이쉐도우 가격
		int i1 = 3500; //팔레트
		int i2 = 4000; //단색아이쉐도우
		int i3 = 4500; //아이쉐도우블러쉬
		
		//파운데이션 가격
		int p1 = 5000; //쿠션
		int p2 = 5500; //리퀴드
		
		//립스틱 선택 갯수
		int lCnt1 = 0;
		int lCnt2 = 0;
		int lCnt3 = 0;
		
		//아이쉐도우 선택 갯수
		int iCnt1 = 0;
		int iCnt2 = 0;
		int iCnt3 = 0;
		
		//파운데이션 선택 갯수
		int pCnt1 = 0;
		int pCnt2 = 0;
		
		//립스틱 결제 가격 
		int lSum1 = 0;
		int lSum2 = 0;
		int lSum3 = 0;
		
		//아이쉐도우 결제 가격 
		int iSum1 = 0;
		int iSum2 = 0;
		int iSum3 = 0;
		
		//파운데이션 결제 가격 
		int pSum1 = 0;
		int pSum2 = 0;

		while(true) {
			System.out.println("1.립스틱");
			System.out.println("2.아이쉐도우");
			System.out.println("3.파운데이션");
			System.out.println("4.결제");
			System.out.println("5.종료");
			System.out.println("선택: ");
			int menu = sc.nextInt();
			
			switch (menu) {
				case 1: 
					System.out.println("1.틴트: " + l1);
					System.out.println("2.립클로즈: " + l2);
					System.out.println("3.립밤: " + l3);
					System.out.println("0.처음 메뉴로 이동");
					System.out.println("선택: ");
					int ch1 = sc.nextInt();
					switch (ch1) {
						case 1:
							System.out.print("틴트 수량 입력 : ");
							lCnt1 += sc.nextInt();
							if(lCnt1 <= 0 ) {
								lCnt1 = 0;
							}
							lSum1 = lCnt1 * l1;
							break;
							
						case 2:
							System.out.print("립클로즈 수량 입력 : ");
							lCnt2 += sc.nextInt();
							if(lCnt2 <= 0 ) {
								lCnt2 = 0;
							}
							lSum2 = lCnt2 * l2;
							break;
							
						case 3:
							System.out.print("립밤 수량 입력 : ");
							lCnt3 += sc.nextInt();
							if(lCnt3 <= 0 ) {
								lCnt3 = 0;
							}
							lSum3 = lCnt3 * l3;
							break;
						case 0:
							System.out.println("처음 메뉴로 이동합니다.");
							break;
						default:
							System.out.println("없는 메뉴입니다.");
					}
					break;
				case 2:
					System.out.println("1.팔레트: " + i1);
					System.out.println("2.단색아이쉐도우: " +i2);
					System.out.println("3.아이쉐도우블러쉬: "+i3);
					System.out.println("0.처음 메뉴로 이동");
					System.out.println("선택: ");
					int ch2 = sc.nextInt();
					switch (ch2) {
						case 1:
							System.out.print("팔레트 수량 입력 : ");
							iCnt1 += sc.nextInt();
							if(iCnt1 <= 0 ) {
								iCnt1 = 0;
							}
							iSum1 = iCnt1 * i1;
							break;
						case 2:
							System.out.print("단색아이쉐도우 수량 입력 : ");
							iCnt2 += sc.nextInt();
							if(iCnt2 <= 0 ) {
								iCnt2 = 0;
							}
							iSum2 = iCnt2 * i2;
							break;
						case 3:
							System.out.print("아이쉐도우블러쉬 수량 입력 : ");
							iCnt3 += sc.nextInt();
							if(iCnt3 <= 0 ) {
								iCnt3 = 0;
							}
							iSum3 = iCnt3 * i3;
							break;
						case 0:
							System.out.println("처음 메뉴로 이동합니다.");
							break;
						default:
							System.out.println("없는 메뉴입니다.");
						
					}
					
					break;
					
				case 3:
					System.out.println("1.쿠션: "+p1);
					System.out.println("2.리퀴드: "+p2);
					System.out.println("0.처음 메뉴로 이동");
					System.out.println("선택: ");
					int ch3 = sc.nextInt();
					
					switch(ch3) {
						case 1:
							System.out.print("쿠션 수량 입력 : ");
							pCnt1 += sc.nextInt();
							if(pCnt1 <= 0 ) {
								pCnt1 = 0;
							}
							pSum1 = pCnt1 * p1;
							break;
							
						case 2:
							System.out.print("리퀴드 수량 입력 : ");
							pCnt2 += sc.nextInt();
							if(pCnt2 <= 0 ) {
								pCnt2 = 0;
							}
							pSum2 = pCnt2 * p2;
							break;
							
						case 0:
							System.out.println("처음 메뉴로 이동합니다.");
							break;
						default:
							System.out.println("없는 메뉴입니다.");
					}
					
					
					break;
				case 4:
					System.out.println("결제");
					if(lCnt1 > 0) {
						System.out.println("틴트 "+lCnt1+"개 "+lSum1+"원");
					}
					if(lCnt2 > 0) {
						System.out.println("립클로즈 "+lCnt2+"개 "+lSum2+"원");
					}
					if(lCnt3 > 0) {
						System.out.println("립밤 "+lCnt3+"개 "+lSum3+"원");
					}
					if(iCnt1 > 0) {
						System.out.println("팔레트 "+iCnt1+"개 "+iSum1+"원");
					}
					if(iCnt2 > 0) {
						System.out.println("단색아이쉐도우 "+iCnt2+"개 "+iSum2+"원");
					}
					if(lCnt3 > 0) {
						System.out.println("아이쉐도우블러쉬 "+iCnt3+"개 "+iSum3+"원");
					}
					if(lCnt1 > 0) {
						System.out.println("쿠션 "+pCnt1+"개 "+pSum1+"원");
					}
					if(lCnt2 > 0) {
						System.out.println("리퀴드 "+pCnt2+"개 "+pSum2+"원");
					}
					
					int sumAll = lSum1+lSum2+lSum3+iSum1+iSum2+iSum3+pSum1+pSum2;
				
					System.out.println("총 결제금액: "+sumAll+"원");
					
					System.out.println("결제완료");
					break;
				case 5:
					System.out.println("종료합니다.");
					return;

				default:
					System.out.println("없는 번호입니다.");
			}

		}

	}
}
