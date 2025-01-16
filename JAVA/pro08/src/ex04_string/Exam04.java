package ex04_string;

public class Exam04 {
	// StringBuilder
	// - 임시 메모리에 저장하고 문자열의 수정 삭제 가능

	// 차이점은 동기화 문제 때문 발생
	// - StringBuffer : 멀티 스레드 일때 - 동기화 때문에 느림 
	// - StringBuilder : 싱글 스레드 일때 - 동기화가 없음
	
	// 같은점은 기능은 비슷하다.
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java");
		sb.append(" Program Enjoy");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.insert(4, " Good");
		System.out.println(sb);
		
		sb.delete(4, 9);
		System.out.println(sb);
		
		sb.replace(0, 4, "Python");
		System.out.println(sb);
		
		System.out.println(sb.length());
	}
}








