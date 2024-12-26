package input;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/**
		 * Scanner 를 이용해서 풀어보세요.
		 * 이름, 국어, 영어, 수학 점수 입력 받기
		 * 입력 받은 점수의 총합과 평균 출력 하기
		 * 평균은 소수점 2자리까지 출력 하기
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		System.out.println("총합 : " 
				+ (kor + eng + math));
		System.out.printf("평균 : %.2f\n",
				((kor + eng + math)/3.0));
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.println("총합 : " + sum);
		System.out.printf("평균 : %.2f", avg);
	}
}





