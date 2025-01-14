package ex05_random;

import java.util.Random;

public class Exam02 {
	public static void main(String[] args) {
		// Random 클래스
		Random rand = new Random();
		
		// 음수 양수 상관없이 난수 값 생성
		System.out.println(rand.nextInt());
		
		// Random.nextInt() : 정수형 난수
		// Random.nextDouble() : 실수형 난수
		// Random.nextBoolean() : 논리형 난수
		
		for(int i=0;i<5;i++) {
			// nextInt(숫자) : 숫자-1 까지의 난수
			// nextInt(10) : 0 ~ 9 까지의 난수
			System.out.println(rand.nextInt(10));
		}
		
		for(int i=0;i<5;i++) {
			// 1 ~ 10 사이의 난수
			System.out.println(rand.nextInt(10) + 1);
		}
		
		int min = 0;
		int max = 10;
		for(int i=0;i<5;i++) {
			// min ~ max 사이의 난수
			System.out.println(rand.nextInt((max-min) + 1) + min);
		}
		
		
	}
}