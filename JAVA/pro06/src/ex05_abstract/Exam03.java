package ex05_abstract;

public class Exam03 {
	public static void main(String[] args) {
		// 다형성
		// - 부모 클래스가 자식 클래스의 대한 정보를 저장할 수 있다.
		// - 저장된 정보는 자식 클래스의 cast 통해 정확한 정보를 
		//		사용할 수 있다.
		String str1 = "홍길동";
		System.out.println(str1);
		
		Object obj1 = str1;
		System.out.println(obj1);
		
		int num1 = 100;
		Object obj2 = num1;
		System.out.println(obj2);
		
		Banana b1 = new Banana();
		Object obj3 = b1;
		System.out.println(b1.getPrice());
		System.out.println(((Banana)obj3).getPrice());
		
		String str2 = (String) obj1;
		int num2 = (int) obj2;
		Banana b2 = (Banana) obj3;
	}
}




