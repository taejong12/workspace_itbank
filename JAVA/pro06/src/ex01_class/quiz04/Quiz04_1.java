package ex01_class.quiz04;
import java.util.Scanner;

public class Quiz04_1 {
	public static void main(String[] args) {
		// 학생 정보 3개 저장 배열
		Student[] stu = new Student[3];
		// 입력 객체 생성
		Scanner sc = new Scanner(System.in);

		// 최신 학번을 저장하는 변수
		int stuNum = 20250001;
		
		// 인덱스 번호를 저장하는 변수
		int i = 0;
		
		while(true) {
			// 사용자 메뉴 출력 및 입력
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();

			switch(menu) {
			case 1: // 입력
				stu[i] = new Student(); // 객체 생성
				stu[i].setStuNum(stuNum++);
				System.out.print("이름 입력 : ");
				stu[i].setName(sc.next());
				System.out.print("학과 입력 : ");
				stu[i].setDepart(sc.next());
				i++;
				break;
			case 2: // 출력
				if(i == 0) {
					System.out.println("입력된 정보가 없습니다.");
				} else {
					for(int j=0;j<i;j++) {
						System.out.println("### " 
								+ stu[j].getStuNum() + " ###");
						System.out.println("이름 : " 
								+ stu[j].getName());
						System.out.println("학과 : " 
								+ stu[j].getDepart());
					}
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
