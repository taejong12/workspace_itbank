package ex05_random;

public class Exam01 {
	public static void main(String[] args) {
		// Random : 난수 생성
		// 1 미만의 소수점 값의 난수 
		double n1 = Math.random();
		System.out.println(n1);
		
		for(int i=0;i<5;i++) {
			System.out.println(Math.random());
		}
		
		for(int i=0;i<5;i++) {
			// 0 ~ 9 중 하나
			System.out.println((int)(Math.random() * 10));
		}
		for(int i=0;i<5;i++) {
			// 1 ~ 10 중 하나
			System.out.println((int)(Math.random() * 10) + 1);
		}
	}
}



