package ex04_string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz02 {
	/**
	 * 이름, 생년월일 입력 받기
	 * - 이름은 3자 또는 4자 입력 [ㄱ-힣]{3,4}
	 * - 생년월일 8자 받기 19990101
	 * - 만 20대 만 가입 가능(출력만 할것)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// [ㄱ-힣] : 모든 한글 한글자
		String namePattern = "[ㄱ-힣]{2,4}";
		// 년도 : 1000, 2000 (0,1,2)
		// 월 : 01 ~ 12 
		// 일 : 01 ~ 31
		// String birthPattern  = "\\d{8}";
		String birthPattern =
				"[1,2]\\d{3}(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])";
		
		while(true) {
			System.out.print("이름 입력 : ");
			String name = sc.next();
			
			if(Pattern.matches(namePattern, name)) {
				System.out.println("이름 형식에 맞습니다.");
			} else {
				System.out.println("이름을 형식에 맞게 다시 입력 하세요.");
				continue;
			}
			
			String birth = null;
			while(true) {
				System.out.print("생년월일(20000101) 입력 : ");
				birth = sc.next();
				
				if(Pattern.matches(birthPattern, birth)) {
					System.out.println("생년월일 형식에 맞습니다.");
					break;
				} else {
					System.out.println("생년월일 형식에 맞게 다시 입력하세요.");
					continue;
				}
			}
			
			int bir = 2025 - Integer.parseInt
					(String.valueOf(birth.substring(0, 4)));
			
			if(name != null && (bir >= 20 && bir <= 29)) {
				System.out.println("가입 축하드립니다.");
			} else {
				System.out.println("가입 내용 및 20대가 아닙니다.");
			}
			break;
		}
		sc.close();
	}
}









