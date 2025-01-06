package ex01_class;

public class Exam05 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println(t1.stuNo);
		System.out.println(t1.stuName);
		
		// 클래스 객체에 직접 데이터 변경은 잘 사용 하지 않음.
		// 잘못된 데이터 입력을 방지(사용자 부주의)
		// 보안을 위해서 잘 사용하지 않는다.
		t1.stuNo = 20250001;
		t1.stuName = "홍길동";
		System.out.println(t1.stuNo);
		System.out.println(t1.stuName);
	}
}