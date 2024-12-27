package ex03_for;

public class Quiz07 {
	public static void main(String[] args) {
		/**
		 * 2 ~ 9 단까지 구구단 출력
		 * - 다중 for 문 작성
		 * hint : 처음 for문 값이 고정 된다
		 */
		for(int dan=2;dan<10;dan++) {
			System.out.println("### "+ dan 
				+ "단 ###");
			for(int i=1;i<10;i++) {
				System.out.println(dan + " * " 
					+ i + " = " + (dan*i));
			}
			System.out.println();
		}
	}
}