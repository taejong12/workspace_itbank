package ex06_wrapper;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
		// Wrapper : 참조 자료형인 기본데이터 타입
		// 서로 사용이 가능하나 null 일 때는 
		// 		null point Exception 발생
		// 초기값을 넣지 않으면 객체 생성이 안된다.
		Integer num1 = new Integer(100);
		System.out.println(num1);
		Double flt1 = new Double(1.234);
		System.out.println(flt1);
		Boolean bl1 = new Boolean(false);
		System.out.println(bl1);
		
		// List, Set, Map 에서 저장하려는 데이터를
		// 		참조 자료형으로 저장하기 때문에 이 방식을 사용
		List<Integer> list = new ArrayList<Integer>();
		
		// wrapper 타입은 기본 데이터 형식과 병행 가능
		int num2 = num1;
		double flt2 = flt1;
		boolean bl2 = bl1;		
	}
}