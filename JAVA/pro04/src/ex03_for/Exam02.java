package ex03_for;

public class Exam02 {
	public static void main(String[] args) {
		// for (초기값;조건식;증감값)
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		// for 문도 무한 반복이 가능하다. 
//		for(;;) {
//			System.out.println("a");
//		}
		
		// for 문의 증감식을 작성하지 않으면 무한 반복
		// 증감식은 반드시 종료 조건에 도달할 수 있도록 증감
//		for(int i=0;i<10;) {
//			System.out.println(i);
//		}
		
		// 종료식이 없어도 무한반복
//		for (int i=0;;i++) {
//			System.out.println(i);
//		}
		
		// for 문안에 기준이 되는 변수를 초기화하면 안된다.
//		int i = 0;
//		for(;i<3;i++) {
//			i = 0;
//			System.out.println(i);
//		}
		
		for(int i=0; i<3; i++) {
			if(i == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
}






