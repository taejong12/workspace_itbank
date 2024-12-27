package ex03_for;

public class Quiz01 {
	public static void main(String[] args) {
		/**
		 * 구구단 중 2단 출력 - for문 이용
		 */
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 2 = 4");
		System.out.println("2 * 3 = 6");
		System.out.println("2 * 4 = 8");
		System.out.println("2 * 5 = 10");
		System.out.println("2 * 6 = 12");
		System.out.println("2 * 7 = 14");
		System.out.println("2 * 8 = 16");
		System.out.println("2 * 9 = 18");
		
		for (int i=1;i<10;i++) {
			System.out.println("2 * " + i 
					+ " = " + (2*i));
		}
		
		for (int i=1, j = 2;i<10;i++) {
			System.out.println(j + " * " + i 
					+ " = " + (j*i));
		}
		
		for (int i=1;i<19;i++) {
			if(i%2 ==0) {
				System.out.println(i);	
			}
		}
		
		for (int i=2;i<18;i+=2) {
			System.out.println(i);	
		}
	}
}


