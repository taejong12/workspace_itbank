package ex05_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now);
		
		// y 년도 M 월 d 일 h 시 m 분 s 초
		SimpleDateFormat sdf =
			new SimpleDateFormat("yyyy년 " +
				"MM월 dd일 HH시 mm분 ss초");
		String nowDate = sdf.format(now);
		System.out.println(nowDate);
		
		sdf = new SimpleDateFormat("yyyy년 " +
					"MM월 dd일 a hh시 mm분 ss초");
		nowDate = sdf.format(now);
		System.out.println(nowDate);
	}
}





