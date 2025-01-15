package ex02_object;

import java.util.Objects;

public class Exam06 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		// 비어 있으면 true 값이 있으면 false
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.isNull(str2));
		
		// 비어 있으면 false 값이 있으면 true
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.nonNull(str2));
		
		// 값이 있으면 toString 출력 없으면 null point Exception
		System.out.println(Objects.requireNonNull(str1));
		// System.out.println(Objects.requireNonNull(str2));
		
		try {
			String name = Objects.requireNonNull(str2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}




