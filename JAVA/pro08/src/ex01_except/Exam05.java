package ex01_except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sub[] = {"국어","영어","수학"};
		
		for (int i=0;i<3;i++) {
			try {
				System.out.print(sub[i] + " 점수 입력 : ");
				int score = sc.nextInt();
				System.out.println(sub[i] + 
						" 점수 : " + score);
				
				// 예외 상황으로 만들기
				if(score < 0 || score > 100) {
					throw new SubException(sub[i]);
				}
			} catch(InputMismatchException e) {
				System.out.println("정수만 입력 가능 합니다.");
				sc = new Scanner(System.in);
			} catch(SubException se) {
				System.out.println(se.getMessage());
				i--;
			}
		}
	}
}
