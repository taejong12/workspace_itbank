package ex02;

public class Exam03 {
	public static void main(String[] args) {
		// 실수 데이터 타입 : float, double
		// float 은 오차가 발생할 수 있기 때문에 
		// double 기본 데이터 타입으로 사용한다.
		double db1 = 1.234567891;
		System.out.println(db1);
		
		// float 은 소수점의 자릿수가 늘어 날 수록 오차가 발생한다.
		float fl1 = 1.234567891f;
		System.out.println(fl1);
		
		// 실수형 데이터 타입에 정수를 저장하면 실수형 데이터로 처리함.
		double db2 = 100;
		System.out.println(db2);
	}
}
