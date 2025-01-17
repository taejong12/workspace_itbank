package ex04_byte;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Exam03 {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\Users\\dbxow\\git\\workspace_itbank\\JAVA\\pro09\\src\\ex04_byte");
		File file = new File(dir, "aaa.txt");
		
		// FileOutPutStream 객체 생성
		// - 단일 문자 또는 byte 로 처리
		// - 여러 데이터 타입을 byte 로 처리해서 저장
		
		// 1. FileOutputStream 객체 생성
		FileOutputStream fos =
			new FileOutputStream(file);
		
		// 2. BufferedOutputStream 객체 생성
		// - FileOutputStream 객체를 넣어 준다.
		BufferedOutputStream bos = 
			new BufferedOutputStream(fos);
		
		// 3. DataOutputStream 객체 생성
		// - BufferedOutputStream 객체를 넣어준다.
		DataOutputStream dos =
			new DataOutputStream(bos);
		
		int num = 100;
		double fl = 1.234;
		char ch = 'A';
		String str = "안녕하세요";
		
		dos.writeInt(num);
		dos.writeDouble(fl);
		dos.writeChar(ch);
		dos.writeUTF(str);
		
		dos.close();
		bos.close();
		fos.close();
	}
}





