package ex04_string;

import java.util.StringTokenizer;

public class Exam02 {
	public static void main(String[] args) {
		String nameList =  
				"홍길동,이순신&김유신/유관순";
		// 정규표현식 
		String[] name = nameList.split(",|&|/");
		
		for(String n : name) {
			System.out.println(n);
		}
		
		String nameList1 = 
				"홍길동/이순신/김유신/유관순";
		StringTokenizer st = 
				new StringTokenizer(nameList1, "/");
		System.out.println("배열의 크기 : " 
				+ st.countTokens());
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
	}
}










