package quiz03.product;

import java.util.Scanner;

public class ProductServiceImpl implements ProductService {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void main() {
		
		while(true) {
			System.out.println("1.제품정보확인");
			System.out.println("2.제품정보입력");
			System.out.println("3.제품정보수정");
			System.out.println("4.제품정보삭제");
			System.out.println("0.프로그램종료");
			System.out.println("선택: ");
			
			int menu = sc.nextInt();
			
			switch(menu){
				case 1:
					proSelect();
					break;
				case 2:
					proInsert();
					break;
				case 3:
					proUpdate();
					break;
				case 4:
					proDelete();
					break;
				case 0:
					System.out.println("프로그램 종료");
					return;
				default:
						System.out.println("없는 번호");
					
			}
		}
			
			
	}
	

	@Override
	public void proSelect() {
		
		
	}

	@Override
	public void proInsert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void proUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void proDelete() {
		// TODO Auto-generated method stub
		
	}

	
	
}
