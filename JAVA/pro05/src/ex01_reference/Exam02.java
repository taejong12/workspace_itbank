package ex01_reference;

public class Exam02 {
	public static void main(String[] args) {
		// String 에서 값이 같은지 확인
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		
		if(name1 == name2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// String.equals() : 참조하는 값이 같은지 비교
		if(name1.equals(name2)) {
			System.out.println("값이 같다.");
		} else {
			System.out.println("같이 다르다.");
		}
		
	}
}

