package ex01_jdbc;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	Scanner sc;
	StudentDAO dao;
	List<Student> scores;
	
	public StudentService() {
		sc = new Scanner(System.in);
		dao = new StudentDAO();
	}
	
	public int menu() {
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 삭제");
		System.out.println("4. 성적 수정");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		return sc.nextInt();
	}
	
	public void input() {
		// TODO Auto-generated method stub
		Student score = new Student();
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
		int result = dao.insert(score);
		if(result >= 1) {
			System.out.println("정보 저장 완료");
		} else {
			System.out.println("오류 입니다. 다시 입력하세요.");
		}
	}

	public void output() {
		// TODO Auto-generated method stub
		scores = dao.selectAll();
		if (scores.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		} else {
			for(Student s : scores) {
				System.out.println(
						"### " + s.getName() + " ###");
				System.out.println("총점 : " + s.getTotal());
				System.out.println("평균 : " + s.getAvg());
				System.out.println("=======================");
			}
		}
	}

	public void delete() {
		// TODO Auto-generated method stub
		scores = dao.selectAll();
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
			int result = 
				dao.delete(scores.get(num-1).getName());
			if(result >= 1) {
				System.out.println("삭제가 완료되었습니다.");
			}  else {
				System.out.println("오류 입니다. 다시 삭제 하세요.");
			}
			
		} 
	}

	public void modify() {
		// TODO Auto-generated method stub
		scores = dao.selectAll();
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
		Student s;
		if(numRange(num)) {
			s = scores.get(num-1);
			String oldName = s.getName();
			
			System.out.print("수정할 이름 입력 : ");
			s.setName(sc.next());
			System.out.print("수정할 국어 점수 입력 : ");
			s.setKor(sc.nextInt());
			System.out.print("수정할 영어 점수 입력 : ");
			s.setEng(sc.nextInt());
			System.out.print("수정할 수학 점수 입력 : ");
			s.setMath(sc.nextInt());
			s.setTotal();
			s.setAvg();
			
			int result = dao.update(oldName, s);
			
			if (result >= 1) {
				System.out.println("수정이 완료되었습니다.");
			}  else {
				System.out.println("오류 입니다. 다시 수정 하세요.");
			}
		} 
	}
	
	public boolean numRange(int num) {
		if (num > 0 && num <= scores.size()) {
			return true;
		}
		System.out.println("없는 번호 입니다.");
		return false;
	}

}


