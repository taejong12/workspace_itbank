package ex03_enum;

public class Exam02 {
	public static void main(String[] args) {
		// Enum.values() : 값 가져오기
		for(Day1 day : Day1.values()) {
			// Enum.ordinal() : 값의 순서
			System.out.println(day);
			System.out.println(day.ordinal());
		}
		
		// Enum.valueOf("문자열") : 문자열과 같은 값 가져오기
		Day1 dayFromString = Day1.valueOf("MONDAY");
		System.out.println(dayFromString);
	}
}