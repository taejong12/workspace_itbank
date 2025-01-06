package ex01_class;

public class Test2 {
	private int stuNo;
	private String stuName;
	
	// Getter : 외부에 데이터 값을 전달하는 메서드
	// Setter : 외부에서 데이터 값을 입력하는 메서드
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		// this : 객체 자신을 의미
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	



	
}



