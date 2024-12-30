package ex04_while;

public class Quiz01 {
	public static void main(String[] args) {
		/**
		 * 1 ~ 100 사이의 정수 중에서 
		 * 4의 배수는 값을 출력
		 * 6의 배수는 총합을 출력
		 * - while 과 for문 둘다 해 보세요.
		 */

		int num = 1; 
		int sum = 0; 
		
		System.out.println("while문");
		System.out.println("4의 배수:");
		
		while (num <= 100) {
		    if (num % 4 == 0) {
		        System.out.print(num + " "); 
		    }
		    if (num % 6 == 0) {
		        sum += num; 
		    }
		    num++;
		}
		
		System.out.println("\n6의 배수 총합: " + sum + "\n"); 
		
		int sum2 = 0; 
		
		System.out.println("for문");
		System.out.println("4의 배수:");
		
		for (int num1 = 1; num1 <= 100; num1++) {
		    if (num1 % 4 == 0) {
		        System.out.print(num1 + " "); 
		    }
		    if (num1 % 6 == 0) {
		        sum2 += num1; 
		    }
		}
		
		System.out.println("\n6의 배수 총합: " + sum2); 
		
	}
}