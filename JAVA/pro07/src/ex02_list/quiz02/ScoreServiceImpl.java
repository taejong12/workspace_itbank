package ex02_list.quiz02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreServiceImpl 
		implements ScoreService{

	List<Score> scores;
	Scanner sc;
	
	public ScoreServiceImpl() {
		// TODO Auto-generated constructor stub
		scores = new ArrayList<Score>();
		sc = new Scanner(System.in);
	}
	
	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 점수 입력");
		System.out.println("2. 점수 출력");
		System.out.println("3. 점수 삭제");
		System.out.println("4. 점수 수정");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		Score score = new Score();
		System.out.print("이름 입력 : ");
		score.setName(sc.next());
		System.out.print("국어 점수 입력 : ");
		score.setKor(sc.nextInt());
		System.out.print("영어 점수 입력 : ");
		score.setEng(sc.nextInt());
		System.out.print("수학 점수 입력 : ");
		score.setMath(sc.nextInt());
		score.setTotal();
		score.setAvg();
		if(scores.add(score)) {
			System.out.println(score.getName() 
					+ " 님의 정보가 저장되었습니다.");
		} else {
			System.out.println("에러가 발생했습니다. "
					+ "다시 저장하세요.");
		}
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		if (scores.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		} else {
			for(Score s : scores) {
				System.out.println(
						"### " + s.getName() + " ###");
				System.out.println("총점 : " + s.getTotal());
				System.out.println("평균 : " + s.getAvg());
				System.out.println("=======================");
			}
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if (scores.isEmpty()) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		for(int i=0;i<scores.size();i++) {
			System.out.println((i+1) + ". " 
					+ scores.get(i).getName());
		}
		System.out.print("번호 입력 : ");
		int num = sc.nextInt();
		if(numRange(num)) {
			scores.remove(num-1);
		} 
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		if (scores.isEmpty()) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		for(int i=0;i<scores.size();i++) {
			System.out.println((i+1) + ". " 
					+ scores.get(i).getName());
		}
		System.out.print("번호 입력 : ");
		int num = sc.nextInt();
		
		if(numRange(num)) {
			System.out.print("수정할 이름 입력 : ");
			scores.get(num-1).setName(sc.next());
			System.out.print("수정할 국어 점수 입력 : ");
			scores.get(num-1).setKor(sc.nextInt());
			System.out.print("수정할 영어 점수 입력 : ");
			scores.get(num-1).setEng(sc.nextInt());
			System.out.print("수정할 수학 점수 입력 : ");
			scores.get(num-1).setMath(sc.nextInt());
		} 
	}
	
	public boolean numRange(int num) {
		if (num > 0 && num < scores.size()) {
			return true;
		}
		System.out.println("없는 번호 입니다.");
		return false;
	}
	
}