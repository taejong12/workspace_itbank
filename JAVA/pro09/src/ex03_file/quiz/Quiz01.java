package ex03_file.quiz;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws IOException {
		/**
		 * 미리 생성
		 * - 현재 디렉터리에서 test 폴더 생성
		 * - test 폴더안에 aaa.txt, bbb.txt, ccc.txt 생성
		 * 
		 * 1. 파일생성
		 * 2. 파일삭제
		 * 3. 파일목록보기
		 * 0. 프로그램 종료
		 * 
		 * - 파일 생성시 같은 이름 존재하면 같은 이름의 파일이 있다고 출력
		 * - 파일 삭제시 파일이름이 존재하지 않으면 파일이 없다고 출력
		 * - 파일 목록 보기 : 전체 목록
		 */
		Scanner sc = new Scanner(System.in);
		File dir = new File("C:\\Users\\dbxow\\git\\workspace_itbank\\JAVA\\pro09\\src\\ex03_file\\quiz\\test");
		
		if(dir.mkdir()) {
			System.out.println("폴더를 생성했습니다.");
		} else {
			System.out.println("폴더가 있습니다.");
		}
		
		String[] files = {"aaa.txt", "bbb.txt", "ccc.txt"};
		
		for(String f: files) {
			File file = new File(dir, f);
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("파일이 생성 되었습니다.");
			}
		}
		
		while(true) {
			System.out.println("1. 파일생성");
			System.out.println("2. 파일삭제");
			System.out.println("3. 목록보기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴선택 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("생성할 파일명 입력 : ");
				String fileName = sc.next();
				File file = new File(dir, fileName);
				
				if(file.createNewFile()) {
					System.out.println(fileName + " 파일이 생성되었습니다.");
				} else {
					System.out.println("기존의 파일명이 존재합니다.");
				}
				break;
			case 2:
				String[] fileList = dir.list();
				for(int i=0;i<fileList.length;i++) {
					System.out.println((i+1) + ". " + fileList[i]);
				}
				System.out.print("삭제할 파일 번호 입력 : ");
				int fileNum = sc.nextInt();
				
				file = new  File(dir, fileList[fileNum-1]);
				
				if(file.delete()) {
					System.out.println(fileList[fileNum-1] + " 파일이 삭제되었습니다.");
				} else {
					System.out.println(fileList[fileNum-1] + " 파일이 존재하지 않습니다.");
				}
				
//				System.out.print("삭제할 파일 입력 : ");
//				fileName = sc.next();
//				
//				file = new File(dir,fileName);
//				if(file.delete()) {
//				System.out.println(fileName + " 파일이 삭제되었습니다.");
//			} else {
//				System.out.println(fileName + " 파일이 존재하지 않습니다.");
//			}
				

				break;
			case 3:
				System.out.println("### test 목록 ###");
				fileList = dir.list();
				
				if(fileList.length == 0) {
					System.out.println("폴더에 파일이 존재하지 않습니다.");
				} else {
//					for(String f: fileList) {
//						System.out.println(f);
//					}
					for(int i=0;i<fileList.length;i++) {
						System.out.println((i+1) + ". " + fileList[i]);
					}
					System.out.println("==================");
				}
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴 번호가 없습니다.");
			}
		}
	}
}