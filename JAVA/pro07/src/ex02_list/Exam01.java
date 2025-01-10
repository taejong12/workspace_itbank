package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
		// List - 인터페이스
		// - 배열처럼 인덱스(순서)로 데이터를 저장
		// - 중복값이 가능
		// - 배열처럼 저장공간이 지정되지 않고 무한으로 사용가능
		// - 구현 클래스 : ArrayList, Vector, LinkedList
		// - ArrayList 와 LinkedList 를 많이 사용
		
		// E는 Element 로 데이터 타입을 지정. 
		// 지정하면 그 데이터 타입만 저장 가능
		// <> 에 데이터 타입을 지정하지 않으면 경고는 뜨지만
		// 		여러 데이터 타입을 저장 할 수 있다.
		List list = new ArrayList();
		
		// 비어 있는 지 확인 - 비어 있으면 true
		System.out.println(list.isEmpty());
		
		// 저장 : boolean add() - 마지막 인덱스에 추가 
		System.out.println(list.add("홍길동"));
		
		// 비어 있지 않으면 false
		System.out.println(list.isEmpty());
		
		// 값 가져오기 - get(int index);
		System.out.println(list.get(0));
		
		// Object 이기 때문에 형 변환을 해줘야 한다.
		// 만일 데이터 타입을 지정했다면 안 해도 된다.
		String name = (String) list.get(0);
		System.out.println(name);
		
		list.add(10);
		list.add(1.234);
		list.add("이순신");
		
		// size() : 크기 반환
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("홍");
		list1.add("최");
		list1.add("서");
		
		// 데이터 타입이 정해지면 형반환 없이 값 반환
		String name1 = list1.get(0);
		System.out.println(name1);
		
		for(String s: list1) {
			System.out.println(s);
		}
		
		// 특정 인덱스에 추가 : add(int index, E e)
		list1.add(1, "나");
		for (String s : list1) {
			System.out.println(s);
		}
		
		// 특정 인덱스에 값 교체 : set(int index, E e)
		list1.set(1, "금");
		for (String s : list1) {
			System.out.println(s);
		}
		
		// 같은 객체인지 비교 : contains(Obejct o)
		System.out.println(list1.contains("홍")); 
		System.out.println
			(list1.contains(new String("홍")));
		
		// 삭제 : E remove(int index)
		String n = list1.remove(1);
		System.out.println(n);
		
		// 삭제 : boolean remove(Object o)
		System.out.println(list1.remove("홍"));
		
		// 초기화 : void clear()
		list1.clear();
		System.out.println(list1.isEmpty());
	}
}




