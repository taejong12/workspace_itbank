package operator;

public class Exam05 {
	public static void main(String[] args) {
		// 논리 연산자
		// && : and 조합 : 두 개의 조건이 모두 참일때만 참
		// || : or 조합 : 두 개의 조건이 모두 거짓일 때 거짓
		
		// and 조합 : 범위 선택시 많이 사용
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// or 조합 : 범위 제외시 많이 사용
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
	}
}



