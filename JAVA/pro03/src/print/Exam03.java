package print;

public class Exam03 {
	public static void main(String[] args) {
		System.out.printf("%d \n", 10);
		
		// printf() 에서 출력할 포맷의 수와 입력한 수가 동일해야 함
		// System.out.printf("%d %d \n", 10);
		
		// printf() 에서 입력된 수가 많아도 포맷의 수에 맞춰서 출력
		System.out.printf("%d %d \n", 10, 20, 30);
		
		// 정수 포맷은 실수를 출력하지 못한다. 예외
		// System.out.printf("%d \n", 1.234);
		// 실수 포맷에서 정수를 출력하지 못한다. 예외
		// System.out.printf("%f \n", 100);
		
		// %숫자[d,f] : 출력 공간의 수 (오른쪽 출력)
		System.out.printf("%5d \n", 12);
		// 출력 공간이 데이터 자리수보다 작으면 원래 상태로 출력
		System.out.printf("%5d \n", 12345678);
		
		// %-숫자[d,f] : 출력 공간의 수 (왼쪽 출력)
		System.out.printf("%-5d \n", 12);
		
		// %0숫자[d,f] : 비어있는 공간을 0을 채우기
		System.out.printf("%05d \n", 12);
		
		// %.숫자f : 소수점 자리수 지정
		System.out.printf("%.2f \n", 1.23456);
		
		System.out.printf("%010.2f \n", 1.2345);
	}
}




