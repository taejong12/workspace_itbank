package ex04_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Quiz01 {
	/**
	 * 야구 게임
	 * - 1 ~ 9 까지 수를 컴퓨터는 3개를 가짐
	 * 	- 3개의 수는 전부 다른 숫자 : List
	 * - 번호와 자리 위치까지 맞추면 스트라이크
	 * - 번호만 맞추면 볼
	 * - 번호가 다 틀리면 파울
	 * - 둘 다 맞으면 아웃
	 * - 사용자가 값을 입력 
	 * 
	 * 컴퓨터 : 258
	 * 사용자 : 127 - 번호만 맞으면 볼 2 하나 맞았으니 1볼
	 * 사용자 : 279 - 번호와 위치까지 맞으면 1스트라이크
	 * 사용자 : 256 - 2 스트라이크
	 * 사용자 : 285 - 1 스트라이크 2볼
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		// 컴퓨터가 3개 수를 저장
		List<Integer> com = new ArrayList<Integer>();
		
		while(com.size() != 3) {
			// 1 ~ 9 까지 수 중 하나 랜덤
			int num = rand.nextInt(9) + 1;
			
			// 같은 수가 없을 때 실행
			if(!com.contains(num)) {
				com.add(num);
			}
		}
		
		// 테스트를 위해서 com 이 가진 숫자 출력
		for(int n : com) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		while(true) {
			System.out.print("숫자 입력 : ");
			String user = sc.next();
			
			int strike = 0;
			int ball = 0;
			
			for(int i=0;i<3;i++) {
				// 위치랑 값이 같을 때 실행
				if(com.get(i) == 
					Integer.parseInt(
						String.valueOf(user.charAt(i)))) {
					strike++;
					continue;
				} 
				
				// 값만 같을 때 실행
				if(com.contains(Integer.parseInt(
						String.valueOf(user.charAt(i))))){
					ball++;
					continue;
				}
			}
			
			if(!(strike == 0 && ball == 0)) {
				System.out.println("스트라이크 : " + strike);
				System.out.println("볼 : " + ball);
			} else {
				System.out.println("파울 입니다.");
			}
			
			if(strike == 3) {
				System.out.println("아웃. 사용자가 이겼습니다.");
				break;
			}
		}
	}
}












