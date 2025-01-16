package ex05_date;

import java.util.Calendar;

public class Exam02 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		// Calendar 에서 월 0 ~ 11 표현
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "년 " + month +
				"월 " + day + "일");
		
		// 1 일 2 월 3 화 4 수 5 목 6 금 7 토  
		int date = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(date);
		
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.THURSDAY);
		System.out.println(Calendar.SATURDAY);
		
		switch(date) {
		case 1 -> System.out.println("일요일");
		case 2 -> System.out.println("월요일");
		case 3 -> System.out.println("화요일");
		case 4 -> System.out.println("수요일");
		case 5 -> System.out.println("목요일");
		case 6 -> System.out.println("금요일");
		case 7 -> System.out.println("토요일");
		}
		
		//  오전 0 오후 1
		int amPm = now.get(Calendar.AM_PM);
		System.out.println(amPm);
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int seconds = now.get(Calendar.SECOND);
		
		System.out.println(year + " 년");
		System.out.println(month + " 월");
		System.out.println(day + " 일");
		System.out.println(hour + " 시");
		System.out.println(minute + " 분");
		System.out.println(seconds + " 초");
	}
}




