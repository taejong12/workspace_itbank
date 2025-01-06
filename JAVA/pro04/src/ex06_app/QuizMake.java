package ex06_app;

import java.util.Scanner;

public class QuizMake {
	public static void main(String[] args) {
		
		//회원가입하기
		//1.회원가입
		//2.로그인
		//3.회원정보확인
		//4.종료
		//5.번호 없으면 "없는 번호입니다." 출력
		//로그인 후 회원정보 확인 만들기
		
		//아이디/비밀번호 변수
		String id = null;
		int pw = 0;
		
		//회원가입 변수
		int pw1=0;
		String name = null;
		String sex = null;
		int brith = 0;
		int phone = 0;
		String address = null;

		//로그인 상태 확인
		boolean login = false;
		
		while(true) {
			
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원정보확인");
			System.out.println("0.종료");
			System.out.println("선택: ");
			
			Scanner sc = new Scanner(System.in);

			int menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					
					System.out.println("#### 회원가입 #####");
					System.out.printf("아이디 입력: ");
					id = sc.next();
					while(true) {
						System.out.println("비밀번호 입력: ");
						pw = sc.nextInt();
						System.out.println("비밀번호 확인: ");
						pw1=sc.nextInt();
						
						if(pw!=pw1) {
							System.out.println("비밀번호를 다시 확인해주세요.");
						}else {
							System.out.println("비밀번호가 일치합니다.");
							break;
						}
					}
					
					
					System.out.println("이름 입력: ");
					name= sc.next();
					
					System.out.println("성별 입력: ");
					sex=sc.next();
					
					System.out.println("생년월일 입력(8자리 숫자만): ");
					brith = sc.nextInt();
					
					System.out.println("전화번호: ");
					phone = sc.nextInt();
					
					System.out.println("주소: ");
					address = sc.next();
					
					System.out.println("회원가입이 완료되었습니다.");
					
					break;
				case 2:
					
					if(login) {
						System.out.println("이미 로그인이 되어있습니다.");
						break;
					}
					
					System.out.println("#### 로그인 ####");
					System.out.println("아이디 입력: ");
					String idCheck = sc.next();
					
					System.out.println("비밀번호 입력: ");
					int pwCheck = sc.nextInt();
					
					System.out.println(idCheck);
					System.out.println(id);
					System.out.println(pw);
					System.out.println(pwCheck);
					
					if(idCheck.equals(id)&& pw==pwCheck) {
						System.out.println("로그인 성공");
						login = true;
					}else {
						System.out.println("로그인 실패");
					}
					
					break;
				case 3:
					
					if(!login) {
						System.out.println("로그인이 되어있지 않습니다.");
						break;
					}
					
					System.out.println("#### 회원정보확인 ####");
					System.out.println("아이디: "+id);
					System.out.println("이름: "+name);
					System.out.println("성별: "+sex);
					System.out.println("생년월일: "+brith);
					System.out.println("전화번호: "+phone);
					System.out.println("주소: "+address);
					break;
				case 0:
					System.out.println("종료");
					return;
				default:
					System.out.println("없는 번호입니다.");
			}
		}
		
	}
}
