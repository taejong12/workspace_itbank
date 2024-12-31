package ex06_app;

import java.util.Scanner;

public class Kiosk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 각 햄버거의 수량을 저장하는 변수
		int chickenCnt = 0; // 치킨버거 수량
		int shrimpCnt = 0; // 새우버거 수량
		int bulgogiCnt = 0; // 불고기버거 수량

		// 각 햄버거의 가격을 저장하는 변수
		int chicken = 4500; // 치킨 버거 금액
		int shrimp = 4000; // 새우 버거 금액
		int bulgogi = 3500; // 불고기 버거 금액

		// 각 햄버거의 결제 금액 저장하는 변수
		int chickenSum = 0; // 치킨 버거 결제 금액
		int shrimpSum = 0; // 새우 버거 결제 금액
		int bulgogiSum = 0; // 불고기 버거 결제 금액

		// 각 음료의 수량을 저장하는 변수
		int colaCnt = 0; // 콜라 수량 저장
		int sidarCnt = 0; // 사이다 수량 저장
		int coffeeCnt = 0; // 커피 수량 저장

		// 각 음료의 금액을 저장하는 변수
		int colaSum = 0; // 콜라 금액 저장
		int sidarSum = 0; // 사이다 금액 저장
		int coffeeSum = 0; // 커피 금액 저장

		// 각 음료의 가격
		int cola = 1500; // 콜라 금액
		int sidar = 1600; // 사이다 금액
		int coffee = 2000; // 커피 금액

		// 관리자 비밀번호 저장 
		int admin = 1234; 

		// 각 햄버거 음료 별 총 판매 수량 저장
		int chickenAllCnt = 0;
		int shrimpAllCnt = 0;
		int bulgogiAllCnt = 0;
		int colaAllCnt = 0;
		int sidarAllCnt = 0;
		int coffeeAllCnt = 0;

		// 각 햄버거 음료 별 총 판매 금액 저장
		int chickenAllSum = 0;
		int shrimpAllSum = 0;
		int bulgogiAllSum = 0;
		int colaAllSum = 0;
		int sidarAllSum = 0;
		int coffeeAllSum = 0;
		
		// 총 매출 저장
		int total = 0;
		
		while(true) {
			System.out.println("##########################");
			System.out.println("######## 케이지 버거 ########");
			System.out.println("##########################\n");

			if(chickenCnt > 0) {
				System.out.println("치킨버거 : " + chickenCnt);
			}
			if(shrimpCnt > 0) {
				System.out.println("새우버거 : " + shrimpCnt);
			}
			if(bulgogiCnt > 0) {
				System.out.println("불고기버거 : " + bulgogiCnt);
			}
			if(colaCnt > 0) {
				System.out.println("콜라 : " + colaCnt);
			}
			if(sidarCnt > 0) {
				System.out.println("사이다 : " + sidarCnt);
			}
			if(coffeeCnt > 0) {
				System.out.println("커피 : " + coffeeCnt);
			}
			System.out.println();
			System.out.println("1. 햄버거 선택");
			System.out.println("2. 음료 선택");
			System.out.println("3. 결제");
			System.out.print("선택 : ");

			int menu = sc.nextInt();

			switch(menu) {
			case 1:				
				System.out.println("#### 햄버거 선택 ####");
				System.out.println("1. 치킨버거");
				System.out.println("2. 새우버거");
				System.out.println("3. 불고기 버거");
				System.out.println("0. 처음 메뉴로 이동");
				System.out.print("선택 : ");

				menu = sc.nextInt();

				switch(menu) {
				case 1:
					System.out.print("치킨 버거 수량 입력 : ");
					chickenCnt += sc.nextInt();
					if (chickenCnt <= 0) {
						chickenCnt = 0;
					}
					chickenSum = chickenCnt * chicken;
					break;
				case 2:
					System.out.print("새우 버거 수량 입력 : ");
					shrimpCnt += sc.nextInt();
					if (shrimpCnt <= 0) {
						shrimpCnt = 0;
					}
					shrimpSum = shrimpCnt * shrimp;
					break;
				case 3:
					System.out.print("불고기 버거 수량 입력 : ");
					bulgogiCnt += sc.nextInt();
					if (bulgogiCnt <= 0) {
						bulgogiCnt = 0;
					}
					bulgogiSum = bulgogiCnt * bulgogi;
					break;
				case 0:
					System.out.println("처음 메뉴로 이동합니다.");
					break;
				default:
					System.out.println("잘못된 메뉴 선택 입니다.");
				}
				break;
			case 2:
				System.out.println("#### 음료 선택 ####");
				System.out.println("1. 콜라");
				System.out.println("2. 사이다");
				System.out.println("3. 커피");
				System.out.println("0. 처음 메뉴로 이동");
				System.out.print("선택 : ");

				menu = sc.nextInt();

				switch(menu) {
				case 1:
					System.out.print("콜라 수량 입력 : ");
					colaCnt += sc.nextInt();
					if(colaCnt <= 0) {
						colaCnt = 0;
					}
					colaSum = colaCnt * cola;
					break;
				case 2:
					System.out.print("사이다 수량 입력 : ");
					sidarCnt += sc.nextInt();
					if(sidarCnt <= 0) {
						sidarCnt = 0;
					}
					sidarSum = sidarCnt * sidar;
					break;
				case 3:
					System.out.print("커피 수량 입력 : ");
					coffeeCnt += sc.nextInt();
					if(coffeeCnt <= 0) {
						coffeeCnt = 0;
					}
					coffeeSum = coffeeCnt * coffee;
					break;
				case 0:
					System.out.println("처음 메뉴로 이동합니다.");
					break;
				default:
					System.out.println("잘못된 메뉴 선택입니다.");
				}
				break;
			case 3:
				System.out.println("########## 결제 ###########");
				if(chickenCnt > 0) {
					System.out.println("치킨버거\t"+ chickenCnt 
							+ "개\t" + chickenSum + "원");
					chickenAllCnt += chickenCnt;
					chickenAllSum += chickenSum;
				}
				if(shrimpCnt > 0) {
					System.out.println("새우버거\t"+ shrimpCnt 
							+ "개\t" + shrimpSum + "원");
					shrimpAllCnt += shrimpCnt;
					shrimpAllSum += shrimpSum;
				}
				if(bulgogiCnt > 0) {
					System.out.println("불고기버거\t"+ bulgogiCnt 
							+ "개\t" + bulgogiSum + "원");
					bulgogiAllCnt += bulgogiCnt;
					bulgogiAllSum += bulgogiSum;
				}
				if(colaCnt > 0) {
					System.out.println("콜라\t"+ colaCnt 
							+ "개\t" + colaSum + "원");
					colaAllCnt += colaCnt;
					colaAllSum += colaSum;
				}
				if(sidarCnt > 0) {
					System.out.println("사이다\t"+ sidarCnt 
							+ "개\t" + sidarSum + "원");
					sidarAllCnt += sidarCnt;
					sidarAllSum += sidarSum;
				}
				if(coffeeCnt > 0) {
					System.out.println("커피\t"+ coffeeCnt 
							+ "개\t" + coffeeSum + "원");
					coffeeAllCnt += coffeeCnt;
					coffeeAllSum += coffeeSum;
				}
				int sumAll = chickenSum + shrimpSum + 
						bulgogiSum + colaSum + sidarSum
						+ coffeeSum;
				total += sumAll;
				System.out.println("총합\t\t"+sumAll+"원");

				System.out.println("\n$$$$ 결제완료 $$$$\n");
				chickenCnt = shrimpCnt = bulgogiCnt = colaCnt
						= sidarCnt = coffeeCnt = 0;
				break;
			case 9999:
				boolean logon = false;
				for(int i=2;i>=0;i--) {
					System.out.print("관리자 비밀번호 입력 : ");
					int pw = sc.nextInt();

					if(pw == admin) {
						System.out.println("로그인 성공");
						logon = true;
						break;
					} else {
						System.out.println("로그인 실패 : " + i + "번 남음");
					}
				}
				if (logon) {
					adminMenu:while(true) {
						System.out.println("1. 가격 변경");
						System.out.println("2. 판매 수량 보기");
						System.out.println("3. 판매 금액 보기");
						System.out.println("4. 전체 매출 보기");
						System.out.println("5. 매출 초기화");
						System.out.println("6. 비밀번호 변경");
						System.out.println("7. 메인메뉴로 이동");
						System.out.println("0. 키오스크 종료");
						System.out.print("선택 : ");
						menu = sc.nextInt();
						
						switch(menu) {
						case 1:
							System.out.println("#### 가격 변경 ####");
							System.out.println("1. 치킨버거");
							System.out.println("2. 새우버거");
							System.out.println("3. 불고기버거");
							System.out.println("4. 콜라");
							System.out.println("5. 사이다");
							System.out.println("6. 커피");
							System.out.print("선택 : ");
							menu = sc.nextInt();
							
							switch(menu) {
							case 1:
								System.out.print("치킨버거 가격 변경 입력 : ");
								chicken = sc.nextInt();
								System.out.println("요금이 변경 되었습니다.");
								break;
							case 2:
								System.out.print("새우버거 가격 변경 입력 : ");
								shrimp = sc.nextInt();
								System.out.println("요금이 변경 되었습니다.");
								break;
							case 3:
								System.out.print("불고기버거 가격 변경 입력 : ");
								bulgogi = sc.nextInt();
								System.out.println("요금이 변경 되었습니다.");
								break;
							case 4:
								System.out.print("콜라 가격 변경 입력 : ");
								cola = sc.nextInt();
								System.out.println("요금이 변경 되었습니다.");
								break;
							case 5:
								System.out.print("사이다 가격 변경 입력 : ");
								sidar = sc.nextInt();
								System.out.println("요금이 변경 되었습니다.");
								break;
							case 6:
								System.out.print("커피 가격 변경 입력 : ");
								coffee = sc.nextInt();
								System.out.println("요금이 변경 되었습니다.");
								break;
							default:
								System.out.println("잘못된 메뉴 번호 입니다.");
							}
							break;
						case 2:
							System.out.println("#### 판매 수량 ####");
							System.out.println("치킨버거 : " + chickenAllCnt);
							System.out.println("새우버거 : " + shrimpAllCnt);
							System.out.println("불고기버거 : " + bulgogiAllCnt);
							System.out.println("콜라 : " + colaAllCnt);
							System.out.println("사이다 : " + sidarAllCnt);
							System.out.println("커피 : " + coffeeAllCnt);
							break;
						case 3:
							System.out.println("#### 판매 금액 ####");
							System.out.println("치킨버거 : " + chickenAllSum);
							System.out.println("새우버거 : " + shrimpAllSum);
							System.out.println("불고기버거 : " + bulgogiAllSum);
							System.out.println("콜라 : " + colaAllSum);
							System.out.println("사이다 : " + sidarAllSum);
							System.out.println("커피 : " + coffeeAllSum);
							break;
						case 4:
							System.out.println("#### 총 판매 금액 ####");
							System.out.println("총 금액 : " + total + "원");
							break;
						case 5:
							System.out.println("#### 매출 초기화 ####");
							System.out.println("1. 초기화");
							System.out.println("그외. 돌아가기");
							System.out.print("선택 : ");
							menu = sc.nextInt();
							
							if(menu == 1) {
								System.out.println("매출을 초기화 합니다.");
								chickenAllCnt = chickenAllSum = 0;
								shrimpAllCnt = shrimpAllSum = 0;
								bulgogiAllCnt = bulgogiAllSum = 0;
								colaAllCnt = colaAllSum = 0;
								sidarAllCnt = sidarAllSum = 0;
								coffeeAllCnt = coffeeAllSum =0;
								total = 0;
							} else {
								System.out.println("초기화에 실패했습니다.");
							}
							break;
						case 6:
							System.out.println("#### 비밀번호 변경 ####");
							System.out.print("기존 비밀번호 입력 : ");
							int pw = sc.nextInt();
							if (pw == admin) {
								System.out.print("새로운 비밀번호 입력 : ");
								int newPw = sc.nextInt();
								System.out.print("비밀번호 확인 입력 : ");
								int pwChk = sc.nextInt();
								if(newPw == pwChk) {
									admin = newPw;
									System.out.println("비밀번호가 변경 되었습니다.");
								} else {
									System.out.println("비밀번호 변경에 실패했습니다.");
								}
							} else {
								System.out.println("다시 확인 후 변경 하세요.");
							}
							break;
						case 7:
							System.out.println("메인 메뉴로 이동합니다.");
							break adminMenu;
						case 0:
							System.out.println("키오스크를 종료합니다.");
							return;
						default:
							System.out.println("잘못 선택된 메뉴 입니다.");
						}
					}
				}
				break;
			default:
				System.out.println("잘못 선택한 메뉴 번호 입니다.");
			}
		}
	}
}