package print;

public class Exam01 {
	public static void main(String[] args) {
		// System.out.println()
		// 출력하고 한칸 내림 실행
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		
		// System.out.print()
		// 출력만 실행
		System.out.print("안녕하세요");
		System.out.print("반갑습니다");
		
		System.out.println();
		System.out.println();
		
		// System.out.printf()
		// 출력 서식을 통해서 실행
		// %d : 정수 데이터 타입
		// %f : 실수 데이터 타입
		// %s : 문자열 데이터 타입
		// %c : 단일 문자 데이터 타입
		System.out.printf("%d %d %d\n", 10, 20, 30);
		System.out.printf("%.2f %.3f\n", 0.123, 12.345);
		
		// 서식 문자
		// \n : 한칸 내림
		// \t : 탭만큼 이동
		
		// 문자열 + 문자열, 정수, 실수 : 문자열 연결
		int num = 10;
		System.out.println("값 : " + num);
		System.out.print("값 : " + num + "\n");
		System.out.printf("값 : %d\n", num);
	}
}






