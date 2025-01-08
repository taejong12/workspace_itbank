package ex02_inheritance.quiz02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/**
		 * StudentParent 클래스 생성
		 * - 이름 국어 영어 수학 총점 평균
		 * - 이름, 총점, 평균 출력 메서드 생성 
		 * 
		 * StudentChild 클래스 생성
		 * - StudentParent 클래스 상속
		 * - 음악, 체육 추가
		 * 
		 * Quiz02 실행 클래스 생성
		 * - StudentChild 배열 3개 생성 
		 * - 입력 및 출력
		 */
		Scanner sc = new Scanner(System.in);
		StudentChild[] stu = new StudentChild[3];
		int cnt = 0; // 인덱스 번호 저장
		
		while(true) {
			System.out.println("1. 입력 ");
			System.out.println("2. 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				stu[cnt] = new StudentChild();
				System.out.println("### 입력 ###");
				System.out.print("이름 입력 : ");
				stu[cnt].setName(sc.next());
				System.out.print("국어 점수 입력 : ");
				stu[cnt].setKor(sc.nextInt());
				System.out.print("영어 점수 입력 : ");
				stu[cnt].setEng(sc.nextInt());
				System.out.print("수학 점수 입력 : ");
				stu[cnt].setMath(sc.nextInt());
				System.out.print("음악 점수 입력 : ");
				stu[cnt].setMusic(sc.nextInt());
				System.out.print("체육 점수 입력 : ");
				stu[cnt].setSport(sc.nextInt());
				stu[cnt].setTotal();
				stu[cnt].setAvg();
				cnt++;
				break;
			case 2:
				for(int i=0;i<cnt;i++) {
					stu[i].output();
				}
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










