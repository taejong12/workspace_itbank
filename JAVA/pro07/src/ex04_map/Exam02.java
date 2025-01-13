package ex04_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Member{
	String id, pwd;
}

public class Exam02 {
	public static void main(String[] args) {
		Map<String, Member> membersList =
				new HashMap<String, Member>();
		
		Member m = new Member();
		m.id = "hong";
		m.pwd = "1234";
		
		// 아이디는 유일한 값이어야 하기 때문에 
		// 	키로 사용하는 것이 좋다.
		membersList.put(m.id, m);
		
		m = new Member();
		m.id = "lee";
		m.pwd = "1234";
		
		membersList.put(m.id, m);
		
		System.out.println(membersList.size());
		
		
		// 아이디가 있는지 없는지 비교
		Set<String> key = membersList.keySet();
		if(key.contains("yoo")) {
			System.out.println("같은 아이디가 존재합니다.");
		} else {
			System.out.println("같은 아이디가 없습니다.");
		}
		
		m = membersList.get("hong");
		System.out.println(m.id);
		System.out.println(m.pwd);
		
		m = membersList.get("yoo");
		// null 값에 .을 이용하여 메서드나 필드를 사용하면
		// 		null point exception 이 생긴다.
		System.out.println(m);		
	}
}



