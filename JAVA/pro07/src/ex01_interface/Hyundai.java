package ex01_interface;

public class Hyundai implements Car{
	
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
	
	public void getBrand() {
		System.out.println("현대 자동차 입니다.");
	}
}