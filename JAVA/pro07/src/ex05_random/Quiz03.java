package ex05_random;

import java.util.ArrayList;
import java.util.List;
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
		Scanner sc = new Scanner(System.in);
		int sum =0;
		
		for(int j=0;j<5;j++) {
			int computer = rand.nextInt(100) + 1;
			int user = 0;
			
			System.out.println("### Up & Down ###");
			for(int i=0;i<10;i++) {
				System.out.print((i+1) + "번째 입력 : ");
				user = sc.nextInt();
				
				if(user < computer) {
					System.out.println("Up");
				} else if (user > computer) {
					System.out.println("Down");
				} else {
					System.out.println("게임 승리");
					sum += (i+1);
					break;
				}
			}
			
		}
		System.out.println("평균 맞춘 횟수 : " + (sum / 5.0));
	}
}










