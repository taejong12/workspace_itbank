package ex02_object;

import java.util.Comparator;
import java.util.Objects;

class Student {
	int stuNo;
	public Student(int stuNo) {
		this.stuNo = stuNo;
	}
}
public class Exam05 {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);
		
		int result = Objects.compare(s1, s2, 
				new StudentComparator());
		System.out.println(result);
		
		result = Objects.compare(s3, s2, 
				new StudentComparator());
		System.out.println(result);
		
		result = Objects.compare(s2, s2, 
				new StudentComparator());
		System.out.println(result);
	}
}

class StudentComparator 
	implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
//		if(o1.stuNo < o2.stuNo) { // 작으면 -1
//			return -1;
//		} else if (o1.stuNo > o2.stuNo) { // 크면 1
//			return 1;
//		} 
//		return 0; // 같은면 0 전달
		return Integer.compare(o1.stuNo, o2.stuNo);
	}
	
}



