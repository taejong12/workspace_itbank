package ex04_string;

import java.util.regex.Pattern;

public class Exam05 {
	public static void main(String[] args) {
		// 정규표현식
		// 문자 : \w
		// + : 1개 이상
		// * : 없거나 1개 이상
		// . : 없거나 1개
		// () : 그룹
		// | : or 개념
		String emailPattern =
				"\\w+@\\w+.(\\w+|\\w+.\\w+)";
		
		String email = "rmadudtjr1@gmail.co.kr";
		
		boolean result = 
				Pattern.matches(emailPattern, email);
		
		if(result) {
			System.out.println("이메일 형식에 맞습니다.");
		} else {
			System.out.println("이메일 형식에 맞게 입력하세요.");
		}
		
		// 000-0000-0000
		// {숫자} : 고정 갯수 
		// \d : 숫자
		String telPattern = "\\w{3}-\\w{4}-\\w{4}";
		String tel = "010-111-2212";
		result = Pattern.matches(telPattern, tel);
	
		if(result) {
			System.out.println("전화번호 형식이 맞습니다.");
		} else {
			System.out.println("전화번호 형식에 맞게 입력하세요.");
		}
		
		
		
	}
}





