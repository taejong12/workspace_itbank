package ex02_array;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/**
		 * Quiz01 과 동일한 내용
		 * - 국어 영어 수학 총점 점수를 score 라는 이차원 배열로 생성
		 * - 출력 역시 이름, 총점, 평균 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 인원 수 입력 :");
		int inwon = sc.nextInt();
		
		String name[] = new String[inwon];
		int scores[][] = new int[inwon][4]; // 국어, 영어, 수학, 총점
		double avg[] = new double[inwon];
		String subject[] = {"국어","영어","수학"};
		
		for(int i=0;i<inwon;i++) {
			System.out.println("### " + (i+1) + "번째 ### ");
			System.out.print("이름 입력 : ");
			name[i] = sc.next();
			for(int j=0;j<subject.length;j++) {
				System.out.print(subject[j] + " 점수 입력 : ");
				scores[i][j] = sc.nextInt();
				scores[i][3] += scores[i][j];
			}
			avg[i] = scores[i][3] / 3.0;
		}
		
		System.out.println("이름\t총점\t평균");
		for(int i=0;i<inwon;i++) {
			System.out.println(name[i] + "\t" + 
				scores[i][3] + "\t" + avg[i]);
		}
	}
}