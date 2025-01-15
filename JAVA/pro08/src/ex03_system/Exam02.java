package ex03_system;

public class Exam02 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long st = System.nanoTime();
		
		int sum = 0;
		for (int i=0;i<100000000;i++) {
			sum += i;
		}
		
		long endTime = System.currentTimeMillis();
		long et = System.nanoTime();
		System.out.println("1 ~ 100000000 합 : " + sum);
		System.out.println(endTime - startTime + " ms");
		System.out.println(et - st + " ns");
	}
	
}






