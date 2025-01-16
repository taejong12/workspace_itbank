package ex01_thread;

import java.text.SimpleDateFormat;
import java.util.Date;

class ThreadTest4 extends Thread {
	public void run() {
		while(true) {
			Date date = new Date();
			SimpleDateFormat sdf =
				new SimpleDateFormat("HH:mm:ss");
			System.out.println("현재 시간 : " 
				+ sdf.format(date));
			
			try {
				// Thread.sleep(ms) : 시간동안 멈춤
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
				
		}
	}
}
public class Exam04 {
	public static void main(String[] args) {
		ThreadTest4 tt4 = new ThreadTest4();
		
		// 데몬 관계 : setDaemon(true,false)
		// 데몬 관계는 main 종료되면 같이 종료 - true
		tt4.setDaemon(true);
		tt4.start();
		
		try {
			// join(ms) 시간만큼 스레드 종료 시간을 증가
			tt4.join(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("main 메서드 종료");
	}
}













