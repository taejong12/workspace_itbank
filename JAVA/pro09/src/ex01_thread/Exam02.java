package ex01_thread;

class ThreadTest2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Test2 멀티 스레드 실행");
		System.out.println(Thread.currentThread());
	}
}

public class Exam02 {
	// Runnable 인터페이스
	// - 멀티쓰레드를 사용하기 위해서 인터페이스를 상속 받아 구현
	// - public void run() 메서드를 오버라이드 한다.
	// - start 메서드가 없기 때문에 Thread 객체로 만들어서 사용
	public static void main(String[] args) {
		ThreadTest2 tt2 = new ThreadTest2();
		tt2.run(); // 단일 스레드 실행
		
		// 멀티 스레드로 실행하기 위해서는 Thread 객체로 
		//		생성해서 사용한다.
		Thread tr = new Thread(tt2);
		tr.start(); // 멀티 스레드 실행
	}
}






