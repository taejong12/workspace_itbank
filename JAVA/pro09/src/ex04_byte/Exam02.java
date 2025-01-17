package ex04_byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exam02 {
	public static void main(String[] args) throws Exception {
		File dir = new File("D:\\20241216\\2_JAVA\\workspace\\pro09\\src\\ex04_byte");
		File file = new File(dir, "aaa.txt");
		
		// 파일 입력은 FileInputStream 클래스를 사용
		FileInputStream fis =
				new FileInputStream(file);
		
		while(true) {
			// read() 사용하면 한글자씩 가져온다.
			int result = fis.read();
			
			// 파일의 마지막은 -1 로 끝남
			if(result == -1) {
				break;
			}
			System.out.print((char)result);
		}
		fis.close();
	}
}




