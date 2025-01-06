package ex03_enum;

enum Day {
	// 이 안의 변수는 다 대문자
	MONDAY, TUESDAY, WENESDAY, THURSDAY, FRIDAY, 
	SATURDAY, SUNDAY
}

public class Exam01 {
	public static void main(String[] args) {
		// enum 은 클래스 작동
		// enum 은 상수형 변수를 처리 하기 위해서 사용
		// 상수형 변수의 이름은 모두 대문자로 처리한다.
		Day today = Day.MONDAY;
		
		if(today == Day.MONDAY) {
			System.out.println("오늘은 힘든 월요일 입니다.");
		} else {
			System.out.println("월요병은 아니시겠네요.");
		}
		
		for(Day day:Day.values()) {
			System.out.println(day);
		}
	}
}






