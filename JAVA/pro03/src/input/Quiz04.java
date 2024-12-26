package input;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/**
		 * Scanner 를 이용해서 구현해 보세요.
		 * - 이름, 태어난 년도 입력
		 * - 이름과 나이를 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("태어난 년도 입력 : ");
		int birthYear = sc.nextInt();
		
		System.out.println(name + "님의 나이(만)는 " + 
		(2024-birthYear) + "살 입니다.");
	}
}




