package ex05_random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Quiz01 {
	public static void main(String[] args) {
		/**
		 * 로또 번호 추출기
		 * - 1 ~ 45 의 숫자 중 6개 번호 출력
		 * - 중복된 숫자는 사용 불가능
		 */
		List<Integer> lotto1 = 
				new ArrayList<Integer>();
		
		Random rand = new Random();
		while(lotto1.size() < 6) {
			int n = rand.nextInt(45) + 1;
			
			if(lotto1.contains(n) == false) {
				lotto1.add(n);
			} 
		}
		
		System.out.println(lotto1);
		// 오름차순
		Collections.sort(lotto1);
		System.out.println(lotto1);
		// 내림차순
		Collections.reverse(lotto1);
		System.out.println(lotto1);
		
		// TreeSet 을 이용하면 값이 정렬이 된다.
		Set<Integer> lotto2 
			= new TreeSet<Integer>();
		while(lotto2.size() < 6) {
			lotto2.add(rand.nextInt(45) + 1);
		}
		
		System.out.println(lotto2);
	}
}





