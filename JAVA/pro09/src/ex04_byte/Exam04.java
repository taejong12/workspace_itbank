package ex04_byte;

import java.io.BufferedInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Exam04 {
	public static void main(String[] args) 
		throws Exception {
		File dir = new File("C:\\Users\\dbxow\\git\\workspace_itbank\\JAVA\\pro09\\src\\ex04_byte");
		File file = new File(dir, "aaa.txt");
		
		// 1. FileInputStream 객체생성
		FileInputStream fis =
			new FileInputStream(file);
		
		// 2. BufferedInputStream 객체 생성
		// - FileInputStream 객체 넣기
		BufferedInputStream bis =
			new BufferedInputStream(fis);
		
		// 3. DataInputStream 객체 생성
		// - BufferedInputSteam 객체 넣기
		DataInputStream dis =
			new DataInputStream(bis);
		
		// 데이터의 순서가 중요하다.
		// 데이터의 위치에 따라 가져오는 값을 처리 해야 한다.
		int num = dis.readInt();
		double db = dis.readDouble();
		char ch = dis.readChar();
		String str = dis.readUTF();
		
		System.out.println(num);
		System.out.println(db);
		System.out.println(ch);
		System.out.println(str);
		
		dis.close();
		bis.close();
		fis.close();
	}
}





