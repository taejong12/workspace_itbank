package ex04_method.quiz03;

import java.util.Scanner;

public class Quiz03 {
	/**
	 * ex02_inheritance 의 quiz02 패키지
	 * - 그 안에 포함된 클래스를 복사 붙여 넣기 
	 * 
	 * Quiz03 실행 클래스 
	 * - StudentService 를 실행 하는 클래스 
	 * 
	 * StudentService 클래스 
	 * - StudentChild에 대한 입/출력을 구현해 보세요.
	 */
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		StudentService ss = new StudentService();
		
		
		while(true) {
			
			ss.menu();
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				return;
				default:
					System.out.println("없는 번호");
			}
	
		}
		
	}
	
	
}