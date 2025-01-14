package ex05_random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/**
		 * 가위 바위 보 게임 진행
		 * 5승 또는 5패 까지 진행
		 * 최종적으로 5승인 사람이 승리
		 * 
		 * 추가
		 * - 요금 투입 부터 진행 되어야 합니다.
		 * - 100원에 한게임
		 * - 사용자가 이기면 아래 금액 중 하나를 선택 후 코인 충전 
		 * - 200원,400원,600원,800원,1000원,2000원
		 * - 0원이 되면 게임 종료  
		 */
		// 승무패 저장
		int win=0,lose=0,draw=0;
		// 입력 객체 
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		//		List<String> game = new ArrayList<String>();
		//		game.add("가위");
		//		game.add("바위");
		//		game.add("보");

		String[] game = {"가위","바위","보"};

		while(true) {
			System.out.println("승 : " + win);
			System.out.println("무 : " + draw);
			System.out.println("패 : " + lose);
			System.out.println("#################");
			System.out.print("가위 바위 보 입력 : ");
			String user = sc.next();

			String computer 
			= game[rand.nextInt(game.length)];

			switch(user) {
			case "가위":
				if(computer.equals("가위")) {
					System.out.println("비겼습니다.");
					draw++;
				} else if (computer.equals("바위")) {
					System.out.println("컴퓨터가 이겼습니다.");
					lose++;
				} else {
					System.out.println("사용자가 이겼습니다.");
					win++;
				}
				break;
			case "바위":
				if(computer.equals("가위")) {
					System.out.println("사용자가 이겼습니다.");
					win++;
				} else if (computer.equals("바위")) {
					System.out.println("비겼습니다.");
					draw++;
				} else {
					System.out.println("컴퓨터가 이겼습니다.");
					lose++;
				}
				break;
			case "보":
				if(computer.equals("가위")) {
					System.out.println("컴퓨터가 이겼습니다.");
					lose++;
				} else if (computer.equals("바위")) {
					System.out.println("사용자가 이겼습니다.");
					win++;				
				} else {
					System.out.println("비겼습니다.");
					draw++;
				}
				break;
			default:
				System.out.println("잘못 입력되었습니다.");
			}
			
			if(win == 5){
				System.out.println("사용자의 최종 우승 입니다.");
				return;
			} else if (lose == 5) {
				System.out.println("컴퓨터가 최종 우승 입니다.");
				return;
			}
		}
	}
}







