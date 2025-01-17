package ex05_text.quiz01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreServiceImpl 
		implements ScoreService {
	Scanner sc;
	List<Score> scoreList;
	File dir;
	File file;
	
	public ScoreServiceImpl() {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		scoreList = new ArrayList<Score>();
		dir = new File("C:\\Users\\dbxow\\git\\workspace_itbank\\JAVA\\pro09\\src\\ex05_text\\quiz01");
		file = new File(dir, "score.txt");
	}
	
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		try {
			System.out.println("### 성적 프로그램 ###");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			return sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			sc.nextLine();
		}
		return 999;
		
	}
	
	public String numInput(String sub) {
		int score = 0;
		do {
			try {
				System.out.println
						("0 ~ 100 사이의 값만 유효 합니다.");
				System.out.print(sub + " 점수 입력 : ");
				score = sc.nextInt();
			} catch(Exception e) {
				score = -1;
				sc.nextLine();
				System.out.println("문자는 사용할 수 없습니다.");
			}
		} while(score < 0 || score > 100);
		return String.valueOf(score);
			
	}
	@Override
	public void input() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("=== 성적 입력 ===");
		System.out.print("이름 입력 : ");
		String result = sc.next() + ",";
		result += numInput("국어") + ",";
		result += numInput("영어") + ",";
		result += numInput("수학");
		
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println(result);
		pw.close();
		bw.close();
		fw.close();
	}

	public List<Score> dataInput() throws Exception{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String result = br.readLine();
			
			if(result == null) {
				break;
			}
			
			String[] arr = result.split(",");
			Score s = new Score();
			s.setName(arr[0]);
			s.setKor(Integer.parseInt(arr[1]));
			s.setEng(Integer.parseInt(arr[2]));
			s.setMath(Integer.parseInt(arr[3]));
			s.setTotal();
			s.setAvg();
			scoreList.add(s);
		}
		
		br.close();
		fr.close();
		
		return scoreList;
	}
	
	@Override
	public void output() throws Exception {
		// TODO Auto-generated method stub
		scoreList = dataInput();
		
		if(scoreList.isEmpty()) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			for (Score s: scoreList) {
				System.out.println("--- " 
						+ s.getName() + " ---");
				System.out.println("총점 : " 
						+ s.getTotal() + "점");
				System.out.println("평균 : " 
						+ s.getAvg() + "점");
				System.out.println();
			}
		}
		scoreList.clear();
	}

	@Override
	public void delete() throws Exception {
		// TODO Auto-generated method stub
		scoreList = dataInput();
		
		if(scoreList.isEmpty()) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			for (int i=0;i<scoreList.size();i++) {
				System.out.println((i+1) + ". "	
						+ scoreList.get(i).getName());
			}
		}
		
		int num = 0;
		try {
			System.out.print("삭제할 번호 입력 : ");
			num = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자만 입력 가능합니다.");
			scoreList.clear();
			return;
		}
		
		if(num > 0 && num <= scoreList.size()) {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for(int i=0;i<scoreList.size();i++) {
				if(i != (num-1)) {
					pw.println(scoreList.get(i).toString());	
				}
			}
			
			pw.close();
			bw.close();
			fw.close();
		} else {
			System.out.println("선택한 번호는 없습니다.");
		}
		scoreList.clear();
		
	}

	@Override
	public void modify() throws Exception {
		// TODO Auto-generated method stub
				
		if(scoreList.isEmpty()) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			for (int i=0;i<scoreList.size();i++) {
				System.out.println((i+1) + ". "	
						+ scoreList.get(i).getName());
			}
		}
		int num = 0;
		try {
			System.out.print("수정할 번호 입력 : ");
			num = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자만 입력 가능합니다.");
			scoreList.clear();
			return;
		}
		
		if(num > 0 && num <= scoreList.size()) {
			Score s = scoreList.get(num-1);
			
			System.out.print("수정할 이름 입력 : ");
			s.setName(sc.next());
			s.setKor(Integer.parseInt(numInput("국어")));
			s.setEng(Integer.parseInt(numInput("영어")));
			s.setMath(Integer.parseInt(numInput("수학")));
		
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for(int i=0;i<scoreList.size();i++) {
				pw.println(scoreList.get(i).toString());	
			}
			
			pw.close();
			bw.close();
			fw.close();
		} else {
			System.out.println("선택한 번호는 없습니다.");
		}
		scoreList.clear();
	}

}
 