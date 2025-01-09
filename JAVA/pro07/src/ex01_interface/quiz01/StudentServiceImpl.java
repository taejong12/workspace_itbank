package ex01_interface.quiz01;

import java.util.Scanner;

public class StudentServiceImpl implements StudentService{

	Scanner sc = new Scanner(System.in);
	Student[] s = new Student[3];
	int idx = 0;
	
	@Override
	public int menu() {
		System.out.println("1.입력");
		System.out.println("2.출력");
		System.out.println("3.종료");
		System.out.println("선택: ");
		int menu = sc.nextInt();
		
		return menu;
	
	}

	@Override
	public void input() {
		s[idx] = new Student();
		System.out.println("이름 입력: ");
		s[idx].setName(sc.next());
		System.out.println("학년 입력: ");
		s[idx].setX1(sc.nextInt());
		System.out.println("반 입력: ");
		s[idx].setX2(sc.nextInt());
		idx++;	
	}

	@Override
	public void output() {
		for(int i=0;i<idx;i++) {
			System.out.println("이름: "+s[i].name);
			System.out.println("학년: "+s[i].x1);
			System.out.println("반: "+s[i].x2);
			
		}
		
	}

	@Override
	public void main() {
		
		while(true) {
			
			int menu = menu();
			
			switch(menu) {
				case 1:
					input();
					break;
				case 2:
					output();
					break;
				case 3:
					System.out.println("종료됩니다.");
					return;
				default:
					System.out.println("없는 번호");
			}
			
			
			
		}
		
		
		
		
		
	}

}
