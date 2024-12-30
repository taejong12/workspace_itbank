package ex05_doWhile;

public class Exam01 {
	public static void main(String[] args) {
		// for(시작값; 종료조건; 증감식) {}
		// 반복되는 횟수가 정해진 반복문
		// while(종료조건) {}
		// 반복되는 횟수가 정해지지 않는 반복문
		
		// do ~ while 문
		// 오류 검출시 많이 사용되는 반복문
		// 무조건 한번은 실행 후
		// 종료 조건에 따라 반복 또는 종료 한다.
		// 우리가 원하는 조건은 false 가 되어 종료 
		// 그렇지 않은 경우 true 로 반복 
		
		int i = 10;
		
		while(i < 10) { // 조건이 거짓이기 때문에 실행 안됨.
			System.out.println("while 문 실행");
		}
		
		for (i= 10; i<10; i++) { 
			// 조건이 거짓이기 때문에 실행 안됨.
			System.out.println("for 문 실행");
		}
		
		do { // 한번은 반드시 실행 됨.
			System.out.println("do ~ while 문 실행");
		} while(i < 10); // 조건이 거짓 
		
		
	}
}





