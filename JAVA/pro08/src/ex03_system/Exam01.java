package ex03_system;

public class Exam01 {
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			if(i == 50) {
				// 0 : 정상종료, 나머지는 비정상종료
				System.exit(0);
			}
			System.out.println(i);
		}
		
	}
}