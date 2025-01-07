package ex01_class;

public class Exam08 {
	int num;
	
	public static void main(String[] args) {
		// 기본 자료형 : int, double, boolean
		// 참고 자료형 : String, 클래스, 인터페이스
		// 참고 자료형도 배열을 만들 수 있다.
		String[] str = new String[3];
		
		str[0] = new String("홍길동");
		str[1] = "이순신";
		str[2] = "김유신";
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		// 참조 자료형의 초기값은 null 값이다.
		// 클래스의 배열은 new 연산자를 통해 객체를 각각 생성
		// 생성된 주소값을 각 인덱스에 저장해야 한다.
		Exam08[] e = new Exam08[3];
		e[0] = new Exam08();
		e[0].num = 100;
		e[1] = new Exam08();
		e[1].num = 200;
		e[2] = new Exam08();
		e[2].num = 300;
		System.out.println(e[0].num);
		System.out.println(e[1].num);
		System.out.println(e[2].num);
		
	}
}

