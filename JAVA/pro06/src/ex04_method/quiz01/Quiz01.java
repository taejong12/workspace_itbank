package ex04_method.quiz01;

import java.util.Scanner;

public class Quiz01 {
	/**
	 * Student 클래스 
	 * - 이름, 국어, 영어, 수학, 총점, 평균
	 * - 데이터 타입 형태로 사용되는 클래스 
	 * 
	 * StudentService 클래스
	 * - 입력, 출력을 담당하는 실행 클래스
	 * - 
	 * 
	 * Quiz01
	 * - StudentService 를 실행 하는 메인 클래스
	 * - 배열을 가지는 클래스
	 * - Quiz01 에서 입력/출력을 하는게 아님
	 * - StudentService 가 입력/출력에 대한 메서드를 가짐 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[3];
		StudentService ss = new StudentService();
		int idx = 0;
		
		while(true) {
			
			// 메뉴 실행
			ss.menu();
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				stu[idx] = ss.input();
				idx++;
				break;
			case 2:
				ss.output(stu, idx);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}






