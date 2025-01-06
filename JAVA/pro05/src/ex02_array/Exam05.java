package ex02_array;

public class Exam05 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// 배열의 크기를 확인 하는 메서드 : arr.length 
		System.out.println("배열의 크기 : " 
				+ arr.length);
		
		// 일반적인 형식으로 for 문 사용
		// 인덱스 번호를 이용, 다른 데이터 타입이 섞여 있을 때
		for(int i=0;i<arr.length;i++) {
			// i : 인덱스 번호로 사용
			System.out.println(arr[i]);
		}
		
		// 같은 데이터형식으로 for 문 사용
		for(int i : arr) {
			// i : 각 인덱스의 값으로 사용
			System.out.println(i);
		}
		
		// 이차원 배열일 때
		// 행은 arr2 의 크기 확인할 때 출력
		// 열은 arr2 각 행의 크기를 확인할 때 출력
		int[][] arr2 = new int[3][4];
		System.out.println(arr2.length);
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		for(int[] i : arr2) {
			for(int j : i) {
				System.out.println(j);
			}
		}
	}
}






