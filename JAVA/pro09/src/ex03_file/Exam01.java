package ex03_file;

import java.io.File;
import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) throws IOException {
		// File 클래스
		// - 파일 및 폴더에 대한 메서드
		File dir = new File("D:\\20241216\\2_JAVA\\workspace\\pro09\\src\\ex03_file\\");
		// 파일 지정 방법 : File 파일변수 = new File("경로", "파일명")
		File f1 = new File(dir, "aaa.txt");
		
		// createNewFile() : boolean 반환
		// 파일이 없으면 true, 있으면 false
		// true 면 파일을 생성하고 false 생성하지 않는다.
		if(f1.createNewFile()) {
			System.out.println("파일이 생성 되었습니다.");
		} else {
			System.out.println("기존에 파일명이 존재합니다.");
		}
		
		// length() : 파일의 크기
		System.out.println(f1.length());
		
		// 임시 파일 만들기 
		// createTempFile("앞에 붙는 이름", "확장자", "경로");
		File imsi = File.createTempFile
				("test", ".dat", dir);
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			
		}
		
		// deleteOnExit() : 프로그램이 종료되면 삭제
		imsi.deleteOnExit();
		
		// exists() : 파일 존재 여부 확인
		if(f1.exists()) {
			// 있으면 true
			System.out.println("파일이 있습니다.");
		} else {
			// 없으면 false
			System.out.println("파일이 없습니다.");
		}
		
		// delete() : 파일 삭제
		// f1.delete();
		
		if(f1.exists()) {
			System.out.println("파일이 있습니다.");
		} else {
			System.out.println("파일이 없습니다.");
		}		
		
		// list() 
		// 경로안에 있는 파일 목록을 문자열배열로 반환
		String files[] = dir.list();
		for(String f : files) {
			System.out.println(f);
		}
		
		// isFile() : 파일인지 구분
		if(f1.isFile()) {
			System.out.println("파일 입니다.");
		} else {
			System.out.println("파일이 아닙니다.");
		}
		
		// idDirectory() : 폴더인지 구분
		if(dir.isDirectory()) {
			System.out.println("폴더 입니다.");
		} else {
			System.out.println("폴더가 아닙니다.");
		}
		
		// mkdir() : 폴더 생성
		File dir1 = new File(dir + "\\zzz");
		
		if(dir1.mkdir()) {
			System.out.println("폴더를 생성합니다.");
		} else {
			System.out.println("기존에 폴더가 있습니다.");
		}
		
		// mkdirs() : 폴더 생성
		// - 상위 폴더가 없어도 생성
		File dir2 = new File(dir + "\\aaa" + "\\bbb");
		if(dir2.mkdir()) {
			System.out.println("폴더를 생성합니다.");
		} else {
			System.out.println("기존에 폴더가 있습니다.");
		}
		
		if(dir2.mkdirs()) {
			System.out.println("폴더를 생성합니다.");
		} else {
			System.out.println("기존에 폴더가 있습니다.");
		}
	}
}










