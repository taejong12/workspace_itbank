package ex02_array;

public class Exam04 {
	public static void main(String[] args) {
		// 다차원 배열 - 행렬이 존재하는 배열
		// [데이터타입] [변수명][][] = new [데이터타입][행][열] 
		// 배열은 같은 데이터타입의 데이터를 가능함
		int arr[][] = new int[2][3];
		
		// [2] : 2행
		// [3] : 3열 
		// ------------------
		// |0행0열|0행1열|0행2열|
		// ------------------
		// |1행0열|1행1열|1행2열|
		// ------------------
		
		int cnt = 1;
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		// 인덱스를 이용한 값 입력
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
	}
}





