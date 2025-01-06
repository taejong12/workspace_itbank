package ex01_reference;

public class Exam01 {
	public static void main(String[] args) {
		// 기본 데이터 타입은 메모리에 직접 값을 저장
		int num1 = 100;
		int num2 = 100;
		
		// == : 기본 타입에서는 저장된 값을 비교
		if(num1 == num2) {
			System.out.println("값이 같다");
		}
		
		// 참조 데이터 타입은 메모리의 참조값이 저장
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		
		// == : 참조 타입에서는 참조 위치값을 비교
		if(name1 == name2) {
			System.out.println("참조 값이 같다.");
		} else {
			System.out.println("참조 값이 다르다.");
		}
		
		String name3 = "홍길동";
		if(name1 == name3) {
			System.out.println("참조 값이 같다.");
		} else {
			System.out.println("참조 값이 다르다.");
		}
		
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		System.out.println(System.identityHashCode(name3));
	}
}





