package ex03_enum;

public class Exam03 {
	public static void main(String[] args) {
		Day1 today = Day1.WENESDAY;
		
		switch(today) {
		case MONDAY:
			System.out.println("월요일");
			break;
		case WENESDAY:
			System.out.println("수요일");
			break;
		default:
			System.out.println("그외 요일");
		}
	}
}