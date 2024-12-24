package print;

public class Exam04 {
	public static void main(String[] args) {
		System.out.printf("%d * %d = %d\n", 2, 2, 4);
		System.out.printf("%d * %d = %d\n", 8, 8, 64);
		
		System.out.printf("%2d * %2d = %2d\n", 2, 2, 4);
		System.out.printf("%2d * %2d = %2d\n", 8, 8, 64);
		
		
		// 이스케이프 문자
		// \n : 한칸 내림
		// \t : 탭만큼 이동 (TAB)
		// \b : 한칸 뒤로 이동
		// \r : 행의 제일 앞으로 이동
		
		// \t : 탭의 빈공간일 경우 8 칸 기본적으로 이동
		System.out.println("123\t9");
		System.out.println("12345\t9");
		System.out.println("12345678\t9");
	}
}







