package ex04_byte;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam01 {
	// byte 를 사용해서 파일에 입출력 방식을 제일 많이 사용한다.
	
	// byte 출력
	// - 파일에 저장하는 것
	// - FileOutputStream 클래스를 이용하여 출력
	// - write() 메서드를 이용해서 저장
	
	// byte 입력
	// - 파일에 내용을 가지고 오는 것
	// - FileInputStream 클래스를 이용하여 입력
	// - read() 메서드를 이용해서 파일의 내용을 가져옴
	// - 파일의 끝은 -1 로 끝이 난다.
	public static void main(String[] args) throws Exception {
		File dir = new File("D:\\20241216\\2_JAVA\\workspace\\pro09\\src\\ex04_byte");
		File file = new File(dir, "aaa.txt");
		
		if(file.createNewFile()) {
			System.out.println("파일이 생성되었습니다.");
		}
		
		// 파일을 저장하기 위해서 FileOutputStream 클래스 사용
		// 기본값 : 덮어쓰기 - false
		// new FileOutputStream(파일명, true|false);
		// false 가 덮어쓰기, true 이어쓰기
		FileOutputStream fos = 
				new FileOutputStream(file, true);
		
		// write() : 내보내기 위한 메서드(저장)
		fos.write('A'); // 단일 문자
		fos.write(66); // 숫자로 보내면 문자 변환
		fos.write(97);
		
		// 문자열 보내기
		String msg = "Hello JAVA!";
		byte[] b = msg.getBytes();
		fos.write(b);
		
		// 한칸 내리기
		fos.write('\n');
		
		// 한칸 내리기 - \n 의 ASCII 코드 값
		fos.write(10);
		
		msg = "abcdefghijk";
		b = msg.getBytes();
		
		// write(byte배열, 시작인덱스, 글자수);
		fos.write(b, 3, 3);
		
		// resource 를 사용할 경우 반드시 close() 로 끝내기
		fos.close();
	}
}







