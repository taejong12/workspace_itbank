package ex03_for;

public class Quiz10 {
	public static void main(String[] args) {
		/**
		 *   1  6 11 16 21
		 *   2  7 12 17 22
		 *   3  8 13 18 23
		 *   4  9 14 19 24
		 *   5 10 15 20 25
		 * 
		 * ======================
		 * 
		 *   1  2  3  4  5
		 *  10  9  8  7  6
		 *  11 12 13 14 15
		 *  20 19 18 17 16
		 *  21 22 23 24 25
		 *  
		 */
		
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", i + 1 + (j * 5));
            }
            System.out.println();
        }

        System.out.println("\n ====================== \n");
        
        int num = 1;
        
        for (int i = 0; i < 5; i++) { // 행
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%2d ", num);
                    num++;
                }
            } else {
                int end = num + 5 - 1;
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%2d ", end - j);
                }
                num += 5;
            }
            System.out.println();
        }
 
	}
}