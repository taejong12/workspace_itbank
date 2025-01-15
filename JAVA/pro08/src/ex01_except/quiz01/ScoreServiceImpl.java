package ex01_except.quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreServiceImpl 
		implements ScoreService{
	Scanner sc;
	List<Score> scoreList; 
			
	public ScoreServiceImpl() {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		scoreList = new ArrayList<Score>();
	}
	
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		int menu = 3;
		try {
			System.out.println("### 학생 성적 ###");
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 학생 성적 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
		}catch(Exception e) {
			System.out.println("정수만 입력 가능합니다.");
			sc.nextLine();
			//sc = new Scanner(System.in);
		}
		return menu;
	}

	public int scoreInput(String sub) {
		int score = -1;
		while(true) {
			try {
				System.out.print(sub + " 점수 입력 : ");
				score = sc.nextInt();
			}catch(Exception e) {
				System.out.println("점수는 정수만 입력 가능 합니다.");
				sc.nextLine();
			}
			if(score < 0 || score > 100) {
				System.out.println("점수는 0 ~ 100 사이의 값 입니다.");
			} else {
				break;
			}
		}
		return score;
	}
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Score s = new Score();
		System.out.print("이름 입력 : ");
		s.setName(sc.next());
		s.setKor(scoreInput("국어"));
		s.setEng(scoreInput("영어"));
		s.setMath(scoreInput("수학"));
		s.setSum();
		s.setAvg();
		scoreList.add(s);
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		for(Score s: scoreList) {
			System.out.println("### " + s.getName() 
				+ " ###");
			System.out.println("총점 : " + s.getSum());
			System.out.println("평균 : " + s.getAvg());
		}
	}

}