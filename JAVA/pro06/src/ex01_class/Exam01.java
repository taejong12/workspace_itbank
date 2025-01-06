package ex01_class;

// [접근제한자] class [클래스이름] {};
// class 접근제한자 : public, default
public class Exam01 {
	
	// [접근제한자] [속성키워드] [리턴타입] [메서드명](매개변수) {};
	// 필드, 메서드, 생성자 접근제한자 :
	// 	- public, protected, private, default
	// 속성키워드 : static, final, static final
	// 리턴타입 : 값을 넘겨줘야하는 데이터 타입 (없으면 void)
	// 매개변수 : 값을 받아야하는 데이터 타입과 변수명
	// public static void main(String[] args){} 
	//		: 프로젝트 실행 메서드 
	public static void main(String[] args) {
		// Run -> Run Configurations
		for(String a : args) {
			System.out.println(a);
		}
	}
}


