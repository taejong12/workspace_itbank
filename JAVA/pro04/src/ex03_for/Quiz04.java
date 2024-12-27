package ex03_for;

public class Quiz04 {
	public static void main(String[] args) {
		/**
		 * 1 ~ 25 까지의 수를 출력
		 * 
		 *  1  2  3  4  5
		 *  6  7  8  9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 */
		for(int i=1; i<26; i++) {
			System.out.printf("%2d ", i);
			if(i%5 == 0) {
				System.out.println();
			}
		}
	}
}



