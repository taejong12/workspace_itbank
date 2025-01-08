package ex02_inheritance.quiz02;

public class StudentParent {
	protected String name;
	protected int kor;
	protected int eng;
	protected int math;
	protected int total;
	protected double avg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = kor + eng + math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = total / 3.0;
	}
	
	public void output() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
}