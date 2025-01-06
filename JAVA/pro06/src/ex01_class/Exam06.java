package ex01_class;

public class Exam06 {
	public static void main(String[] args) {
		Test2 t1 = new Test2();
		
		// setter 를 이용하여 값 전달
		t1.setStuNo(20250001);
		t1.setStuName("홍길동");
		
		// getter 를 이용하여 값 출력
		System.out.println(t1.getStuNo());
		System.out.println(t1.getStuName());
	}
}