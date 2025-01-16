package ex01_thread;

class ThreadTest1 extends Thread{	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("멀티스레드 실행");
		System.out.println(Thread.currentThread());
	}
}

public class Exam01 {
	// 프로세스 : 실행 중인 독립적인 프로그램
	// 멀티태스킹 : 컴퓨터에서 동시에 여러 가지 작업을 실행
	// 멀티스레드 : 두 개 이상의 메서드가 동시에 실행 
	
	// Thread 클래스
	// - 멀티 스레드를 구현하기 위해서는 Thread를 상속
	// - 상속 받은 후에는 run() 메서드를 override 해야 함
	// - start() 메서드를 호출해서 실행하면 멀티스레드
	// - run() 메서드를 호출해서 실행하면 단일스레드
	
	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1();
		
		tt1.start(); // 멀티스레드 실행
		tt1.run(); // 단일스레드 실행
	}
}







