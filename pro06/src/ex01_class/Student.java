package ex01_class;

public class Student {
	// 이름, 국어, 영어, 수학, 총점, 평균
	private String name;
	private int kor,eng,math,total;
	private double avg;
	
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
		this.total = this.kor + this.eng 
				+ this.math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = this.total / 3.0;
	}
}