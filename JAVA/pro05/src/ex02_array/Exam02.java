package ex02_array;

public class Exam02 {
	public static void main(String[] args) {
		// 배열의 값 초기화 
		// 기본 타입은 0으로 초기화 되어 있음 (정수, 실수)
		// 참조 타입은 null 로 초기화 되어 있음
		// boolean 타입은 false 초기화 되어 있음
		
		// 정수형 0 으로 초기화
		int num1[] = new int[3];
		System.out.println(num1[0]);
		
		// 실수형 0.0 으로 초기화
		double num2[] = new double[3];
		System.out.println(num2[0]);
		
		// 논리형 false 로 초기화
		boolean bl[] = new boolean[3];
		System.out.println(bl[0]);
		
		// 참조 자료형 null 로 초기화
		String str[] = new String[3];
		System.out.println(str[0]);
		
		int[] num3 = {10,20,30};
		double[] num4 = new double[] {1.2,2.3,3.3};
		boolean[] bl2 = {false, true, false};
		String[] str2 = 
				new String[] {"hong", "lee", "kim"};
		
		// 배열의 크기는 동적 할당이 가능하다.
		int size = 3;
		int[] arr = new int[size];
		System.out.println(arr.length);
		size = 5;
		arr = new int[size];
		System.out.println(arr.length);
		
	}
}