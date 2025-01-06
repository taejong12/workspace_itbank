package ex02_array;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("저장할 점수의 수 입력 : ");
		int scoreCnt = sc.nextInt();
		
		String[] name = new String[scoreCnt];
		int[] scores = new int[scoreCnt];
		
		for(int i=0;i<scoreCnt;i++) {
			System.out.print("이름 입력 : ");
			name[i] = sc.next();
			
			System.out.print("점수 입력 : ");
			scores[i] = sc.nextInt();
		}
		
		// 같은 데이터 타입만 가능하다.
		for(String n : name) {
			System.out.println(n);
		}
		for(int s : scores) {
			System.out.println(s);
		}
		
		for(int i=0;i<scoreCnt;i++) {
			System.out.println(name[i] + ", " 
					+ scores[i]);
		}
	}
}




