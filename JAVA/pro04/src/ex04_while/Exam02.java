package ex04_while;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		int i = 0;
		while(true) {
			System.out.println("hello");
			i++; // 증감식을 어디에 쓰느냐에 따라 결과값이 달라진다.
			if(i == 10) {
				break;
				// for, while, switch 문 종료
			}
			
		}
		
		boolean fl = true;
		while(fl) {
			System.out.println(i);
			if(i == 20) {
				fl = false;
			}
			i++;
		}
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while(num != 100) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}
	}
}



