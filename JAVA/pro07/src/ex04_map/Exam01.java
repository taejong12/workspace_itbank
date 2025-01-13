package ex04_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exam01 {
	public static void main(String[] args) {
		// Map - 키와 값으로 쌍으로 이루어진 데이터 구조
		// key 는 Map에서 유일한 값으로 호출하는 키워드
		// value 는 키로 호출하는 값을 의미하며 중복이 가능하다.
		// 구현 클래스 : HashMap, HashTable, 
		// 	LinkedHashMap, TreeMap 등이 있다.
		// Map 의 키는 대체적으로 문자열데이터로 사용한다.
		// value 의 값은 모든 데이터 형태가 가능하다.
		// 	- 기본 데이터 타입, 참조 데이터 타입, List, Map 도 가능
		
		// Map 사용되는 데이터는 참조 타입 형태로 지정해야 한다.
		// Wrapper : Integer, Double
		Map<String, Integer> map =
				new HashMap<String, Integer>();
		
		// Map.put(K, V) : 입력
		map.put("hong", 1234);
		map.put("lee", 1234);
		map.put("kim", 1234);
		
		// Map.size() : Map 의 크기 반환
		System.out.println(map.size());
		
		// Map.get(K) : 키값으로 값 호출
		System.out.println(map.get("hong"));
		// 키 값이 없으면 null 을 반환
		System.out.println(map.get("seo"));
		
		// Map.containsKey(K) : 같은 값의 키가 있는지
		// 있으면 true, 없으면 false
		System.out.println(map.containsKey("hong"));
		System.out.println(map.containsKey("seo"));
		
		// Map.containsValue(V) : 같은 값이 있는지
		// 있으면 true, 없으면 false
		System.out.println(map.containsValue(1234));
		System.out.println(map.containsValue(1111));
		
		// Map.keySet() : 모든 키를 Set으로 반환
		Set<String> key = map.keySet();
		for(String k : key) {
			System.out.println(k);
		}
		
		// Map.values() : 모든 값을 Collection 로 반환
		Collection<Integer> values = map.values();
		for(int n: values) {
			System.out.println(n);
		}
		
		// Map.remove(k) : 키값으로 삭제 후 값을 반환
		int num = map.remove("hong");
		System.out.println(num);
		System.out.println(map.size());
		
		// Map.clear() : 모든 값 초기화 
		map.clear();
		System.out.println(map.size());
		
		// Map.isEmpty() : 비어 있는지 확인
		System.out.println(map.isEmpty());
	}
}






