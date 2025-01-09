package ex04_method.quiz04;

public class Student extends Professor{
	private static int autoStuNum = 20250001;
	private int stuNum;
	
	public Student() {
		stuNum = autoStuNum++;
	}
	
	public int getStuNum() {
		return stuNum;
	}
}