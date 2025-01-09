package ex05_abstract.quiz01;

import java.util.Scanner;

public class SameMain {

	ScoreService ss = new ScoreService();
	MemberService ms = new MemberService();
	
	Scanner sc = new Scanner(System.in);
	
	int exit=0;
	
	public void sameMain() {
		
		while(true) {

			System.out.println("1.점수 정보");
			System.out.println("2.유저 정보");
			System.out.println("3.종료");
			System.out.println("선택: ");
			
			int menu = sc.nextInt();
			
			while(true) {
				
				switch(menu) {
					case 1:
						exit = ss.main();
						break;
					case 2:
						exit = ms.main();
						break;
					case 3:
						System.out.println("종료됩니다.");
						return;
					default:
						System.out.println("없는 번호");
				}
				
				if(exit == 1) {
					break;
				}
				
			}
			
		
		}
	}
	
	
	
}
