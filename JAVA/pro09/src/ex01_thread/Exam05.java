package ex01_thread;

class Washroom {
	public synchronized void openDoor(String who) {
		System.out.println(who + "님이 사용중 입니다.");
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			
		}
		System.out.println(who + "님이 사용을 마쳤습니다.");
	}
}

class Family extends Thread {
	private Washroom wr;
	private String who;
	
	public Family(String name, Washroom wr) {
		who = name;
		this.wr = wr;
	}
	
	public void run  () {
		wr.openDoor(who);
	}
}

public class Exam05 {
	// synchronized 
	//	- 여러 개의 스레드가 한 개의 객체를 공유할 때
	//  - 해당 스레드를 제외하고 나머지는 대기 상태를 만든다.
	//	- 순서는 먼저오는 스레드 부터 실행
	public static void main(String[] args) {
		Washroom wr = new Washroom();
		
		Family daddy = new Family("아빠", wr);
		Family mommy = new Family("엄마", wr);
		Family sister = new Family("누나", wr);
		Family brother = new Family("오빠", wr);
		Family me = new Family("나", wr);
		
		daddy.start();
		mommy.start();
		sister.start();
		brother.start();
		me.start();
		
	}
}







