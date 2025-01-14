package ex05_random;

import java.util.Random;

public class Exam03 {
	public static void main(String[] args) {
		// seed : 난수의 고정값 지정
		Random rand1 = new Random();
		System.out.println(rand1.nextInt());
		
		Random rand2 = new Random(10);
		System.out.println(rand2.nextInt());
		System.out.println(rand2.nextInt());
		System.out.println(rand2.nextInt());
	}
}