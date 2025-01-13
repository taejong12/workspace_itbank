package ex04_map.quiz02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NavigationServiceImpl implements NavigationService{

	Scanner sc = new Scanner(System.in);
	
	//목적지 등록
	Map<String, Navigation> naviList = new HashMap<String, Navigation>();
	
	//최근 목적지
	List<Navigation> recentNavi = new ArrayList<Navigation>();
	
	@Override
	public void main() {
		while(true) {
			menu();
			
			int menu = sc.nextInt();

			switch(menu) {
				case 1:
					input();
					break;
				case 2:
					output();
					break;
				case 3:
					modify();
					break;
				case 4:
					delete();
					break;
				case 5:
					clean();
					break;
				case 6:
					recentNavi();
					break;
				case 7:
					System.out.println("프로그램 종료 완료");
					return;
				default:
					System.out.println("없는 번호");
			}
			
		}
		
	}
	
	@Override
	public void menu() {
		System.out.println("1.목적지 등록");
		System.out.println("2.목적지 선택");
		System.out.println("3.목적지 수정");
		System.out.println("4.목적지 삭제");
		System.out.println("5.네비게이션 초기화");
		System.out.println("6.최근 목적지 5개");
		System.out.println("7.프로그램 종료");
		System.out.println("선택: ");

	}
	

	@Override
	public void input() {
	
		Set<String> key = naviList.keySet();

		Navigation n = new Navigation();
		
		System.out.println("목적지 이름 입력: ");
		n.setName(sc.next());
		
		if(key.contains(n.getName())) {
			System.out.println("이미 존재하는 목적지 이름입니다.");
			
		}else {
			System.out.println("목적지 주소 입력: ");
			n.setAddress(sc.next());
			
			naviList.put(n.getName(), n);
			
			recentNavi.add(n);
			
		}
		
		
	}

	@Override
	public void output() {
		
		if(naviList.isEmpty()) {
			System.out.println("등록된 목적지가 없습니다.");
		}else {
			
			Set<String> key = naviList.keySet();
			
			
			for(String k:key) {
				Navigation n = new Navigation();
				n = naviList.get(k);
				System.out.println("목적지: "+n.getName()+", 조회 횟수: "+n.getCount());
				
			}
			
			System.out.println("목적지 입력: ");
			String ch = sc.next();
			
			if(key.contains(ch)) {
				Navigation n = new Navigation();
				n = naviList.get(ch);
				
				int count = n.getCount();
				String address = n.getAddress();
				count++;

				n.setCount(count);
				n.setName(ch);
				n.setAddress(address);
	
				naviList.remove(ch);
				
				naviList.put(ch, n);
				
				System.out.println("선택완료");
				
			}else {
				
				System.out.println("없는 목적지입니다.");
			}
			
		}
		

		
	}

	@Override
	public void modify() {
		
		if(naviList.isEmpty()) {
			System.out.println("등록된 목적지가 없습니다.");
		}else {
			
			Set<String> key = naviList.keySet();
			
			Navigation n = new Navigation();
			
			for(String k:key) {
				n = naviList.get(k);
				System.out.println("목적지: "+n.getName());
			}
			
			System.out.println("수정할 목적지 입력: ");
			String name = sc.next();
			
			if(key.contains(name)) {
				
				n = naviList.get(name);
				
				int count = n.getCount();
				
				n.setCount(count);
				
				naviList.remove(name);
				
				System.out.println("#### 수정 작성 ####");
				System.out.println("목적지 입력: ");
				String navi = sc.next();
				System.out.println("주소 입력: ");
				String address = sc.next();
				
				n.setName(navi);
				n.setAddress(address);
				
				naviList.put(navi, n);
				
				for(int i=0;i<recentNavi.size();i++) {
					if(recentNavi.get(i).getName().equals(name)) {
						recentNavi.set(i, n);
						System.out.println("수정한 이름: "+recentNavi.get(i).getName());
						System.out.println("수정한 주소: "+recentNavi.get(i).getAddress());
						System.out.println("횟수: "+recentNavi.get(i).getCount());
						
						
					}
				}
				
				System.out.println("수정완료");
				
			}else {
				System.out.println("없는 목적지입니다.");
			}
		}
		
		
	}

	@Override
	public void delete() {
		
		if(naviList.isEmpty()) {
			System.out.println("등록된 목적지가 없습니다.");
		}else {
			
			Set<String> key = naviList.keySet();
			
			Navigation n = new Navigation();
			
			for(String k:key) {
				n = naviList.get(k);
				System.out.println("목적지: "+n.getName());
			}
			
			System.out.println("삭제할 목적지 입력: ");
			String name = sc.next();
			
			
			if(key.contains(name)) {
				naviList.remove(name);
				
				for(int i=0;i<recentNavi.size();i++) {
					
					if(recentNavi.get(i).getName().equals(name)) {
						recentNavi.remove(i);
					}
					
				}
				System.out.println("삭제완료");
				
			}else {
				System.out.println("없는 목적지입니다.");
			}
		}
		
		
	}

	@Override
	public void recentNavi() {
		
		if(naviList.isEmpty()) {
			System.out.println("등록된 목적지가 없습니다.");
		}else {
			
			
			int j = recentNavi.size() - 1;
			
			for(int i=0;i<recentNavi.size();i++) {
				if(i>=5) {
					break;
				}
				System.out.println((i+1)+"번: "+recentNavi.get(j).getName());
				j--;
			}
		}
		
		
	}

	@Override
	public void clean() {
		
		if(naviList.isEmpty()) {
			System.out.println("등록된 목적지가 없습니다.");
		}else {
			
			naviList.clear();
			recentNavi.clear();
			
			System.out.println("초기화 완료");
		}
		
		
	}





	

}
