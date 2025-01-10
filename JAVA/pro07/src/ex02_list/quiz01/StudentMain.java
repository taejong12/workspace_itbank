package ex02_list.quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> student = 
				new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		StudentService ss = 
				new StudentServiceImpl();
		
		while(true) {
			ss.menu();
			int menu = sc.nextInt();
			String name = null;
			
			switch(menu) {
			case 1:
				if(student.add(ss.input())) {
					System.out.println("추가되었습니다.");
					System.out.println("================");
				} else {
					System.out.println("추가에 실패 했습니다.");
				}
				break;
			case 2:
				if(student.isEmpty()) {
					ss.emptyMsg("출력할");
				} else {
					ss.output(student);	
				}
				break;
			case 3:
				if(student.isEmpty()) {
					ss.emptyMsg("삭제할");
				} else {
					ss.delete(student);	
				}
				break;
			case 4:
				if(student.isEmpty()) {
					ss.emptyMsg("수정할");
				} else {
					ss.modify(student);
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





