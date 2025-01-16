package ex01_thread;

class ThreadTest3 extends Thread {
	public void run() {
		System.out.println("현재 실행 되고 있는 스레드의 수 : " 
				+ Thread.activeCount());
		System.out.println("현재 실행 되고 있는 스레드의 상태 : "
				+ Thread.currentThread());
	}
}

public class Exam03 {
	// 실행 우선 순위 : 기본값 5
	// 1 ~ 10 : 값이 클수록 우선 순위가 높다.
	public static void main(String[] args) {
		System.out.println("main 에 속한 스레드 시작");
		
		ThreadTest3 tt3 = new ThreadTest3();
		
		// setName() : 스레드 이름 변경
		tt3.setName("tt3 스레드");
		tt3.setPriority(1);
		tt3.start();
		tt3.run();
		
		System.out.println("main 에 속한 스레드 끝");
	}
}








