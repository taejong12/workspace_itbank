package ex05_abstract.quiz01;

public class Score {
	String name;
	int x1;
	int x2;
	int x3;
	int total;
	int avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getX3() {
		return x3;
	}
	public void setX3(int x3) {
		this.x3 = x3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = this.x1+this.x2+this.x3;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = (this.x1+this.x2+this.x3)/3;
	}
	
	
}
