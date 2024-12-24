package print;

public class Exam02 {
	public static void main(String[] args) {
		// println() : 제일 많이 사용하고 문자열 연결로 출력문 작성
		int num = 100;
		System.out.println("점수는 " + num + "점 입니다.");
		
		// print() : 입력 받기 전에 많이 사용함
		System.out.print("점수 입력 : ");
		System.out.println();
		
		// printf() : 출력할 소수점 자릿수를 지정할 때 사용
		double avg = 0.987654321;
		System.out.printf("%f \n", avg);
		System.out.printf("%.2f \n", avg);
		System.out.printf("%.3f \n", avg);
		System.out.printf("%.4f \n", avg);
		System.out.printf("%.5f \n", avg);
	}
}