package ex05_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exam02 {
	public static void main(String[] args) 
			throws Exception {
		File dir = new File("C:\\Users\\dbxow\\git\\workspace_itbank\\JAVA\\pro09\\src\\ex05_text");
		File file = new File(dir, "aaa.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			
			// 파일의 데이터가 없으면 null 로 처리 된다.
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
		br.close();
		fr.close();
	}
}




