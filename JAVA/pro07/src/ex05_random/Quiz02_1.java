package ex05_random;

import java.util.Random;
import java.util.Scanner;

public class Quiz02_1 {
	public static void main(String[] args) {
		String[] game = {"가위", "바위", "보"};
		int[] point = {200,400,600,800,1000,2000};
		int money = 0; // 충전 금액
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) {
			System.out.println("#### 가위 바위 보 ####");
			System.out.println("현재 요금 : " + money + " 원");
			if(money < 100) { 
				System.out.print("요금 투입 (100원당 1게임) : ");
				money += sc.nextInt();
			}
			
			if(money >= 100) {
				money -= 100;
				String computer = 
						game[rand.nextInt(game.length)];
				System.out.print("가위 바위 보 입력 : ");
				String user = sc.next();
				
				int add = point[rand.nextInt(point.length)];
				switch(user) {
				case "가위":
					if(computer.equals("가위")) {
						System.out.println("비겼습니다.");
						System.out.println("재 경기를 진행합니다.");
						money += 100;
					} else if (computer.equals("바위")) {
						System.err.println("컴퓨터가 이겼습니다.");
					} else {
						System.out.println("사용자가 이겼습니다.");
						System.out.println("추가 포인트 증정 : " + 
								add + " 원");
						money += add;
					}
					break;
				case "바위":
					if(computer.equals("가위")) {
						System.out.println("사용자가 이겼습니다.");
						System.out.println("추가 포인트 증정 : " + 
								add + " 원");
						money += add;
					} else if (computer.equals("바위")) {
						System.out.println("비겼습니다.");
						System.out.println("재 경기를 진행합니다.");
						money += 100;
					} else {
						System.err.println("컴퓨터가 이겼습니다.");
					}
					break;
				case "보":
					if(computer.equals("가위")) {
						System.err.println("컴퓨터가 이겼습니다.");
					} else if (computer.equals("바위")) {
						System.out.println("사용자가 이겼습니다.");
						System.out.println("추가 포인트 증정 : " + 
								add + " 원");
						money += add;
					} else {
						System.out.println("비겼습니다.");
						System.out.println("재 경기를 진행합니다.");
						money += 100;
					}
					break;
				default:
					System.out.println("입력이 잘못 되었습니다. 다시 입력 하세요.");
					money += 100;
				}
				System.out.println("\n");
			} else {
				System.out.println("요금이 부족합니다. 추가하세요.");
			}
		}
	}
}