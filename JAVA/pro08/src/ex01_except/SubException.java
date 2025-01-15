package ex01_except;

public class SubException extends Exception {
	// Exception 최상위 클래스
	// Exception 을 상속 받아서 사용자 정의 예외 클래스 정의
	
	public SubException() {
		// TODO Auto-generated constructor stub
	}
	
	public SubException(String sub) {
		// TODO Auto-generated constructor stub
		super(sub);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage() + " 점수는 0 ~ 100 사이의 값입니다.";
	}
}