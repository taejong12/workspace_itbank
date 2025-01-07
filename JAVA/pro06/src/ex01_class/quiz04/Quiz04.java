package ex01_class.quiz04;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/**
		 * Student 클래스 생성
		 * - 학번, 이름, 학과 필드 생성
		 * - 학번은 20250001 부터 시작 이후에는 1씩 증가
		 * - getter/setter 를 이용하여 입력 및 출력
		 * 
		 * Quiz04
		 * - Student 객체를 3개 가지는 배열 생성
		 * - 메뉴 입력에 따라 실행
		 * - 1. 입력 2. 출력 0. 프로그램 종료
		 */
		// 학생 정보 3개 저장 배열
		Student[] stu = new Student[3];
		// 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 최신 학번을 저장하는 변수
		int stuNum = 20250001;
		
		while(true) {
			// 사용자 메뉴 출력 및 입력
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: // 입력
				for(int i=0;i<stu.length;i++) {
					stu[i] = new Student(); // 객체 생성
					stu[i].setStuNum(stuNum++);
					System.out.print("이름 입력 : ");
					stu[i].setName(sc.next());
					System.out.print("학과 입력 : ");
					stu[i].setDepart(sc.next());
				}
				break;
			case 2: // 출력
				for(int i=0;i<stu.length;i++) {
					System.out.println("### " 
						+ stu[i].getStuNum() + " ###");
					System.out.println("이름 : " 
						+ stu[i].getName());
					System.out.println("학과 : " 
						+ stu[i].getDepart());
				}
				break;
			case 0: // 프로그램 종료
				System.out.println("프로그램 종료");
				return;
			default: // 그외 번호 입력
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}


