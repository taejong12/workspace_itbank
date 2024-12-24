package operator;

public class Quiz01 {

	public static void main(String[] args) {
		int num1 = 1;
		
		String result1 = "";
		
		result1 = (num1 % 2 == 0) ? "짝수" : "홀수";
		
		int num2 = 2;
		
		String result2 = "";
		
		result2 = (num2 % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
	}

}
