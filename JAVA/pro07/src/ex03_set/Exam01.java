package ex03_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex02_list.quiz02.Score;

public class Exam01 {
	public static void main(String[] args) {
		// Set - 인터페이스
		// - 수학에서 집합에 비유
		// - 순서가 없고 순서가 없기 때문에 중복데이터 저장 불가능
		// - 같은 객체를 중복해서 저장하지 못한다.
		// - 구현 클래스 : HashSet, LinkedHashSet, TreeSet
		
		Set<String> set = new HashSet<String>();
		
		// 저장 : add()
		set.add("홍길동");
		set.add("이순신");
		set.add("김유신");
		
		// 출력 
		for(String s : set) {
			System.out.println(s);
		}
		
		// 같은 객체를 저장 하지 못한다.
		set.add("홍길동");
		
		// 출력 
		for(String s : set) {
			System.out.println(s);
		}
		
		// get()으로 객체를 가져올 수 없다. 
		// 순서가 없기 때문이다.
		// Iterator : 반복자
		// - 자기가 가진 객체를 순차적으로 가져온다.
		// - hasNext() : 다음 객체가 있는지 boolean 형으로 반환
		// - next() : 다음 객체를 가져온다.
		// Set.iterator() : Set의 객체를 Iterator 로 반환
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) { // 다음 값이 있으면 true
			String s = iter.next(); // 다음 값 가져오기
			System.out.println(s);
		}
		
		// size() : 크기 반환
		System.out.println(set.size());
		
		Score s1 = new Score();
		Score s2 = new Score();
		Score s3 = s1;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		Set<Score> score = new HashSet<Score>();
		score.add(s1);
		score.add(s2);
		
		for(Score s : score) {
			System.out.println(s.hashCode());
		}
		
		score.add(s3);
		for(Score s : score) {
			System.out.println(s.hashCode());
		}
		
		// contains() : 같은 객체가 있는지 비교
		System.out.println(score.contains(s3));
		System.out.println(score.contains(new Score()));
		
		System.out.println(set.contains("홍길동"));
		System.out.println(set.contains("유재석"));
		System.out.println(set.contains(new String("홍길동")));

		for(String s: set) {
			System.out.println(s.hashCode());
		}
		System.out.println(new String("홍길동").hashCode());
		
		// remove() : 객체 삭제
		score.remove(s1);
		
		for(Score s : score) {
			System.out.println(s.hashCode());
		}
		
		// clear() : 초기화
		score.clear();
		System.out.println(score.size());
		
		// isEmpty() : 비어 있는지 비교
		System.out.println(score.isEmpty());
	}
}




