package ex02_switch;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/**
		 * 1 ~ 12 중 하나의 숫자를 입력하면 
		 * 해당하는 월의 일 수를 출력 
		 * 
		 * # 출력 예
		 * 월 입력 : 1
		 * 1월은 31일까지 존재합니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
//		switch(month) {
//		case 1:
//			System.out.println("1월은 31일 까지 있습니다.");
//			break;
//		case 2:
//			System.out.println("2월은 28일 또는 29일 까지 있습니다.");
//			break;
//		case 3:
//			System.out.println("3월은 31일 까지 있습니다.");
//			break;
//		case 4:
//			System.out.println("4월은 30일 까지 있습니다.");
//			break;
//		case 5:
//			System.out.println("5월은 31일 까지 있습니다.");
//			break;
//		case 6:
//			System.out.println("6월은 30일 까지 있습니다.");
//			break;
//		case 7:
//			System.out.println("7월은 31일 까지 있습니다.");
//			break;
//		case 8:
//			System.out.println("8월은 31일 까지 있습니다.");
//			break;
//		case 9:
//			System.out.println("9월은 30일 까지 있습니다.");
//			break;
//		case 10:
//			System.out.println("10월은 31일 까지 있습니다.");
//			break;
//		case 11:
//			System.out.println("11월은 30일 까지 있습니다.");
//			break;
//		case 12:
//			System.out.println("12월은 31일 까지 있습니다.");
//			break;
//		default:
//			System.out.println(month + "월은 존재 하지 않습니다.");
//		}
		
//		switch(month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			System.out.println(month + "월은 31일 까지 있습니다.");
//			break;
//		case 2:
//			System.out.println("2월은 28일 또는 29일 까지 있습니다.");
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			System.out.println(month +"월은 30일 까지 있습니다.");
//			break;
//		default:
//			System.out.println(month + "월은 존재 하지 않습니다.");
//		}

		switch(month) {
		case 1,3,5,7,8,10,12:
			System.out.println(month + "월은 31일 까지 있습니다.");
			break;
		case 2:
			System.out.println("2월은 28일 또는 29일 까지 있습니다.");
			break;
		case 4,6,9,11:
			System.out.println(month +"월은 30일 까지 있습니다.");
			break;
		default:
			System.out.println(month + "월은 존재 하지 않습니다.");
		}
	}
}







