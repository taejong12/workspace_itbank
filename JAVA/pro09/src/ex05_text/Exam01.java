package ex05_text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Exam01 {
	// Text 입출력
	// - Text 는 버퍼에 데이터를 담아서 입출력 한다.
	// - 한글자씩 전송 하는 것이 아니라 문자열 전송이 가능하다.
	// - 입출력 받을 때 행 단위로 처리 된다.
	
	public static void main(String[] args) 
			throws Exception {
		File dir = new File("C:\\Users\\dbxow\\git\\workspace_itbank\\JAVA\\pro09\\src\\ex05_text");
		File file = new File(dir, "aaa.txt");
		
		// new FileWriter(파일명, true|false);
		// true 이어쓰기, false 덮어쓰기
		// 기본값은 false 로 덮어쓰기다.
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		// print() : 데이터를 출력
		pw.print("안녕하세요");
		pw.print("반갑습니다.");
		pw.print(100);
		pw.print(1.234);
		
		// println() : 데이터를 출력하고 한칸 내림
		pw.println();
		pw.println("안녕하세요");
		pw.println("반갑습니다.");
		pw.println(100);
		pw.println(1.234);
		
		pw.close();
		bw.close();
		fw.close();
	}
}





