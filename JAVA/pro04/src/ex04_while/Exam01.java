package ex04_while;

public class Exam01 {
	public static void main(String[] args) {
		// for문 : 유한반복 - 횟수가 정해진 반복
		// while문 : 무한반복 - 횟수가 정해지지 않은 반복
		// for 문은 수치에 의한 반복
		// while 문은 조건에 의한 반복
		// while(조건식[true, false]) { 실행할 문장 }
		// true 면 실행, false 종료
		
		// while 밖에 시작값
		int i = 0;
		
		while(i < 10) { // 조건식에 종료조건 
			System.out.println(i); // 실행문
			i++; // 조건에 도달하기 위한 증감식
		}
	}
}





