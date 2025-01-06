package ex02_array;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/**
		 * 1. 점수 입력할 인원을 입력 받기
		 * 2. 이름, 국어, 영어, 수학 점수 입력 받기
		 * 3. 입력 받은 후 이름, 총점, 평균 출력 하기
		 * - 각 배열을 이용하여 처리 할 것 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 인원 수 입력 :");
		int inwon = sc.nextInt();
		
		String name[] = new String[inwon];
		int kor[] = new int[inwon];
		int eng[] = new int[inwon];
		int math[] = new int[inwon];
		int sum[] = new int[inwon];
		double avg[] = new double[inwon];
		
		
		for(int i=0;i<inwon;i++) {
			System.out.println("### " + (i+1) + "번째 ### ");
			System.out.print("이름 입력 : ");
			name[i] = sc.next();
			System.out.print("국어 점수 입력 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어 점수 입력 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학 점수 입력 : ");
			math[i] = sc.nextInt();
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = sum[i] / 3.0;
		}
		
		System.out.println("이름\t총점\t평균");
		for(int i=0;i<inwon;i++) {
			System.out.println(name[i] + "\t" + 
				sum[i] + "\t" + avg[i]);
		}
	}
}





