package ex05_random;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		/**
		 * Up & Down 게임
		 * - 1 ~ 100 사이의 값 중 하나를 컴퓨터가 지정
		 * - 숫자를 입력해서 컴퓨터가 가진 숫자를 맞추는 게임
		 * - 컴퓨터가 가진 숫자보다 작은 숫자를 입력하면 Up
		 * - 컴퓨터가 가진 숫자보다 큰 숫자를 입력하면 Down
		 * - 10회 입력 후 틀리면 게임아웃
		 * - 10회 입력 전 맞추면 게임승리
		 * 
		 * -- 5번의 게임을 진행 후 평균 맞춘 입력횟수를 출력
		 * -- 컴퓨터가 가진 수를 자동으로 맞추는 소스 구현  
		 */
		
		Random rand = new Random();
		
		int round = 1;
		
		int sum=0;
		
		while(true) {
			
			if(round>5) {
				double avg = sum/5.0;
				System.out.println("평균 입력 횟수: "+avg);
				return;
			}
			
			int com = rand.nextInt(100)+1;
			
			int count =0;
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				
				if(count > 9) {
					System.out.println("게임아웃");
					sum += count;
					break;
					
				}
				
				System.out.println("숫자 입력: ");
				int user = sc.nextInt();
				
				if(user>com) {
					System.out.println("DOWN");
				}else if(user<com) {
					System.out.println("UP");
				}else if(user==com) {
					System.out.println("게임 승리");
					sum += count;
					break;
				}
				
				count++;
				
				
			}
			
			round++;
		}
		
		
		
	}
}