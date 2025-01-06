package ex02_array;

public class Exam01 {
	public static void main(String[] args) {
		// 배열 : 하나의 변수명에 여러개의 값을 저장하는 변수
		
		// 기본 데이터타입은 변수명 하나에 값 하나만 저장한다.
		int kor = 100;
		int eng = 90;
		int math = 80;
		System.out.println(kor + ", " + eng + 
			", " + math);
		
		// 배열 선언
		// [데이터타입][] [배열변수명] 
		// [데이터타입] [배열변수명][]
		int scores[]; // int[] scores;
		
		// 초기화 또는 배열의 크기를 지정하는 방법
		// [배열 변수명] = new [데이터타입][배열크기]
		scores = new int[3];
		// int scores[] = new int[3];
		
		// 배열의 값을 입출력 하기 위해서는 인덱스 번호를 사용함.
		// 인덱스 번호는 0부터 시작
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		System.out.println(scores[0] + ", " 
				+ scores[1] + ", " + scores[2]);
	}
}






