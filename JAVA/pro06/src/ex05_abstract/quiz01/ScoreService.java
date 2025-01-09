package ex05_abstract.quiz01;

import java.util.Scanner;

public class ScoreService extends Template{

	Scanner sc = new Scanner(System.in);
	Score[] s = new Score[3];
	int idx = 0;
	
	public int menu() {
		System.out.println("ScoreClass");
		System.out.println("1.입력");
		System.out.println("2.출력");
		System.out.println("3.이전 페이지");
		System.out.println("선택: ");
		
		int menu = sc.nextInt();
		return menu;
	}
	
	@Override
	public void input() {
		s[idx] = new Score();
		System.out.println("이름 입력: ");
		s[idx].setName(sc.next());
		System.out.println("국어 점수 입력: ");
		s[idx].setX1(sc.nextInt());
		System.out.println("영어 점수 입력: ");
		s[idx].setX2(sc.nextInt());
		System.out.println("수학 점수 입력: ");
		s[idx].setX3(sc.nextInt());
		
		s[idx].setTotal();
		s[idx].setAvg();

		idx++;

	}

	@Override
	public void output() {
		for(int i=0;i<idx;i++) {
			System.out.println("이름: "+s[i].getName());
			System.out.println("국어: "+s[i].getX1());
			System.out.println("영어: "+s[i].getX2());
			System.out.println("수학: "+s[i].getX3());
			System.out.println("총점: "+s[i].getTotal());
			System.out.println("평균: "+s[i].getAvg());
		}
		
	}

}
