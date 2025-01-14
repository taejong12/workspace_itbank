package ex05_random;

import java.util.Random;

public class Exam04 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		double n = rand.nextDouble();
		System.out.println(n);
		int[] point = 
			{ 200, 400, 600, 800, 1000, 2000 };
		int idx = 0;
		if(n < 0.1) {
			idx = 5;
		} else if (n < 0.2) {
			idx = 4;
		} else if (n < 0.3) {
			idx = 3;
		} else if (n < 0.4) {
			idx = 2;
		} else if (n < 0.5) {
			idx =1;
		} else {
			idx = 0;
		}
		System.out.println(point[idx]);
		 
	}
}