package ex05_random;

import java.util.Random;
import java.util.Scanner;

public class Quiz03_1 {
	public static void main(String[] args) {
		/**
		 * 컴퓨터가 가진 수를 자동으로 맞추는 소스 구현  
		 */
		Random rand = new Random();
		int sum =0;
		
		for(int j=0;j<10000;j++) {
			int computer = rand.nextInt(100) + 1;
			int user = 50;
			int range = 50;
			System.out.println("### Up & Down ###");
			for(int i=0;i<10;i++) {
				System.out.print((i+1) + "번째 입력 : ");
				System.out.println(user);
				
				range /= 2;
				if(user < computer) {
					System.out.println("Up");
					if(range == 0) {
						user++;
					} else {
						user = user + range;
					}
				} else if (user > computer) {
					System.out.println("Down");
					if(range == 0) {
						user--;
					} else {
						user -= range;
					}
				} else {
					System.out.println("게임 승리");
					sum += (i+1);
					break;
				}
				if(i == 9) {
					System.out.println("게임 아웃");
					sum += (i+1);
				}
			}
			
		}
		System.out.println("평균 맞춘 횟수 : " + (sum / 10000.0));
	}
}