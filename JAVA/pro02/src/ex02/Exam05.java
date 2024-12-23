package ex02;

public class Exam05 {
	public static void main(String[] args) {
		// promotion : 
		// 같은 데이터 타입의 저장공간이 큰 곳으로 
		// 이동은 아무 제약없이 이동 가능 (자동으로 형변환)
		byte bt = 1; // byte - 1byte
		short sh; // short - 2byte
		int it; // int - 4byte
		long ln; // long - 8byte
		
		sh = bt;
		it = sh;
		ln = it;
		
		System.out.println(bt);
		System.out.println(sh);
		System.out.println(it);
		System.out.println(ln);
		
		// demotion : 
		// 데이터 크기가 작은 공간으로 형변환후 저장하는 것
		it = (int) ln;
		sh = (short)it;
		bt = (byte) sh;
		
		System.out.println(bt);
		System.out.println(sh);
		System.out.println(it);
		System.out.println(ln);
		
		bt = (byte) 130;
		System.out.println(bt);
	}
}

