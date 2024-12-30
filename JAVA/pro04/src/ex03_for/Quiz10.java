package ex03_for;

public class Quiz10 {
	public static void main(String[] args) {
		/**
		 *   1  6 11 16 21
		 *   2  7 12 17 22
		 *   3  8 13 18 23
		 *   4  9 14 19 24
		 *   5 10 15 20 25
		 */
		for(int i=1;i<6;i++) { // 0 1 2 3 4
			for(int j=0;j<5;j++) { // 1 2 3 4 5
				System.out.printf("%2d ", i + (j * 5));
			}
			System.out.println();
		}
		/**
		 *   1  2  3  4  5
		 *  10  9  8  7  6
		 *  11 12 13 14 15
		 *  20 19 18 17 16
		 *  21 22 23 24 25
		 */
		for(int i=0;i<5;i++) {
			if(i%2 == 0) {
				for(int j=0;j<5;j++) {
					System.out.printf("%2d ", 
							(j+1) + (i*5));
				}
			} else {
				for(int j=4;j>=0;j--) {
					System.out.printf("%2d ", 
							(j+1) + (i*5));
				}
			}
			System.out.println();
		}
		
		for (int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i%2 == 0) {
					System.out.printf("%2d ",
						(j+1) + (i*5));
				} else {
					System.out.printf("%2d ", 
						(i*5) + (5-j));
				}
			}
			System.out.println();
		}
	}
}





