package ex03_for;

public class Quiz09 {
	public static void main(String[] args) {
		/**
		 *  1  2  3  4  5
		 *  6  7  8  9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25 
		 * 
		 * - 다중 for문으로 구현해보세요
		 */
		for(int i=0;i<5;i++) { // 0 1 2 3 4
			for(int j=1;j<6;j++) { // 1 2 3 4 5
				System.out.printf("%2d ", j + (i * 5));
			}
			System.out.println();
		}
	}
}







