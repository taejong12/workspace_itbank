package ex04_string;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Exam03 {
	public static void main(String[] args) {
		// StringBuffer 
		// - 임시 메모리에 저장해서 수정 변경이 가능한 문자열
		
		// 초기값이 없으면 크기 16인 빈 문자열
		StringBuffer sb1 = new StringBuffer();
		// capacity() : 문자열의 크기 반환
		System.out.println(sb1.capacity());
		
		// 초기값으로 배열의 크기를 지정할 수 있음
		StringBuffer sb2 = new StringBuffer(30);
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = 
			new StringBuffer("Hello Hi Java!");
		System.out.println(sb3.capacity());
		
		// append("문자열") : 문자열 추가
		sb1.append("홍길동");
		System.out.println(sb1); // 출력은 동일
		
		sb1.append(sb3);
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		
		// delete(시작, 끝-1) : 시작 ~ 끝-1 까지 삭제
		sb1.delete(0, 3);
		System.out.println(sb1);
		
		// insert(시작위치, 문자열) : 시작위치에 문자열 삽입
		sb1.insert(5, " Happy");
		System.out.println(sb1);
		
		// replace(시작, 끝-1, 문자열)
		//	- 시작 ~ 끝-1 위치의 문자를 문자열로 대체
		sb1.replace(6, 11, "Join");
		System.out.println(sb1);
		
		// reverse() : 문자열의 역순으로 반환하고 저장
		System.out.println(sb1.reverse());
		System.out.println(sb1); 		
		System.out.println(sb1.reverse());
		System.out.println(sb1);
	}
}









