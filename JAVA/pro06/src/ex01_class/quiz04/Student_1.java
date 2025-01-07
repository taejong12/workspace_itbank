package ex01_class.quiz04;

public class Student_1 {
	private static int staticStuNum = 20250001;
	private int stuNum;
	private String name;
	private String depart;
	
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum() {
		this.stuNum = staticStuNum++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
}