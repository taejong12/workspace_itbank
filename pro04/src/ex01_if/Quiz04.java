package ex01_if;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/**
		 * 이름 입력 : 문자열 입력 받기
		 * 출생지 선택
		 * 1. 서울
		 * 2. 경기도권
		 * 3. 강원도권
		 * 4. 충청도권
		 * 5. 경상도권
		 * 6. 전라도권
		 * 7. 제주도
		 * 출생지역 선택 : 정수 입력 받기
		 * 000님의 출생지는 000권 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("출생지 선택");
		System.out.println("1. 서울권");
		System.out.println("2. 경기권");
		System.out.println("3. 강원권");
		System.out.println("4. 충청권");
		System.out.println("5. 경상권");
		System.out.println("6. 전라권");
		System.out.println("7. 제주권");
		System.out.print("선택 : ");
		int region = sc.nextInt();

		String local = "";
		if (region == 1) {
			local = "서울권";
		} else if (region == 2) {
			local = "경기권";
		} else if (region == 3) {
			local = "강원권";
		} else if (region == 4) {
			local = "충청권";
		} else if (region == 5) {
			local = "경상권";
		} else if (region == 6) {
			local = "전라권";
		} else if (region == 7) {
			local = "제주권";
		} else {
			local = "모름";
		}
		
		System.out.println(name + "님의 출생지는 " 
				+ local + "입니다.");
	}
}





