package ex01_interface;

public class Genesis implements Car {

	@Override
	public String getTire() {
		// TODO Auto-generated method stub
		return "타이어는 " + TIRE + " 개 입니다.";
	}

	@Override
	public String engineInfo() {
		// TODO Auto-generated method stub
		return "엔진은 " + ENGINE + " 개 입니다.";
	}

	@Override
	public String doorInfo() {
		// TODO Auto-generated method stub
		return "문은 " + door + " 개 입니다.";
	}

}