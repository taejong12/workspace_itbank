package ex02_list.quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl 
	implements StudentService{
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 정보 입력");
		System.out.println("2. 정보 출력");
		System.out.println("3. 정보 삭제");
		System.out.println("4. 정보 수정");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public Student input() {
		// TODO Auto-generated method stub
		Student stu = new Student();
		System.out.print("이름 입력 : ");
		stu.setName(sc.next());
		System.out.print("학년 입력 : ");
		stu.setYear(sc.nextInt());
		System.out.print("반 입력 : ");
		stu.setClassNum(sc.nextInt());
		return stu;
	}

	@Override
	public void output(List<Student> student) {
		// TODO Auto-generated method stub
		for(Student s : student) {
				System.out.println("이름 : " + s.getName());
				System.out.println("학년 : " + s.getYear());
				System.out.println("반 : " + s.getClassNum());
				System.out.println("===============");
		}
	}

	@Override
	public void delete(List<Student> student) {
		// TODO Auto-generated method stub
		System.out.print("삭제 할 이름 입력 : ");
		String name = sc.next();
		for(int i=0;i<student.size();i++) {
			if(name.equals(student.get(i).getName())) {
				student.remove(i);
				System.out.println(name + 
						"님의 정보가 삭제되었습니다.");
				return;
			} 
		}
		System.out.println(name + "님의 정보가 없습니다.");
// 마지막 객체를 remove(Object o) 를 하면 에러 
//		for(Student s: student) {
//			if(name.equals(s.getName())) {
//				student.remove(s);
//			}
//		}
	}

	@Override
	public void modify(List<Student> student) {
		// TODO Auto-generated method stub
		System.out.print("수정 할 이름 입력 : ");
		String name = sc.next();
		
		for(Student s : student) {
			if(name.equals(s.getName())) {
				System.out.print("수정할 이름 입력 : ");
				s.setName(sc.next());
				System.out.print("수정할 학년 입력 : ");
				s.setYear(sc.nextInt());
				System.out.print("수정할 반 입력 : ");
				s.setClassNum(sc.nextInt());
				return;
			}
		}
		System.out.println(name + "님의 정보가 없습니다.");
	}

	public void emptyMsg(String sub) {
		System.out.println(sub + " 정보가 없습니다.");
		System.out.println("===================");
	}
}