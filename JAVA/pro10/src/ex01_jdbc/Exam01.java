package ex01_jdbc;

public class Exam01 {
	// 오라클 DB 사용하려면 ojdbc17.jar 파일이 필요함
	// - 프로젝트 우클릭 -> Build Path 
	//   -> Configure Build Path 
	// - Libraries 탭 -> class path 클릭 
	//	 -> add External Jars.. 
	//		-> ojdbc17.jar 파일 선택 
	//		   -> apply and close
	public static void main(String[] args) {
		StudentService ss = new StudentService();
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 1:
				ss.input();
				break;
			case 2:
				ss.output();
				break;
			case 3:
				ss.delete();
				break;
			case 4:
				ss.modify();
				break;
			case 0:
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("선택된 메뉴 번호가 없습니다.");
			}
		}
	}
}