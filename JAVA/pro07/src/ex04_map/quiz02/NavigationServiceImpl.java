package ex04_map.quiz02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NavigationServiceImpl 
		implements NavigationService{
	Map<String, Navigation> destination;	
	Scanner sc; 
	List<String> visit;
	
	public NavigationServiceImpl() {
		// TODO Auto-generated constructor stub
		destination = new HashMap<String, Navigation>();
		sc = new Scanner(System.in);
		visit = new ArrayList<String>();
	}
	
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 목적지 등록");
		System.out.println("2. 목적지 선택");
		System.out.println("3. 목적지 수정");
		System.out.println("4. 목적지 삭제");
		System.out.println("5. 네비게이션 초기화");
		System.out.println("6. 최근목적지"); 
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		return sc.nextInt();
	}

	public String desInput(String sub) {
		System.out.print("목적지 "+ sub + " 입력 : ");
		return sc.next();
	}

	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Navigation nav = new Navigation();
		nav.setDesName(desInput("이름"));
		
		if(destination.get(nav.getDesName()) != null) {
			System.out.println("같은 이름의 목적지가 존재합니다. "
					+ "다시 등록하세요.");
			return;
		} 
		nav.setDesAddress(desInput("주소"));
		
		destination.put(nav.getDesName(), nav);
	}

	public void selectNum(List<String> desList) {
		System.out.print("목적지 번호 선택 : ");
		int select = sc.nextInt();
		
		Navigation nav = 
			destination.get(desList.get(select-1));
		System.out.println("#### " + nav.getDesName() + " ####");
		System.out.println("주소 : " + nav.getDesAddress());
		nav.setVisit();
		visit.add(nav.getDesName());
	}
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1. 목적지 검색");
			System.out.println("2. 모든 목적지 검색");
			System.out.println("0. 메인 메뉴로 이동");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			List<String> desList = new ArrayList<String>();
			
			switch(menu) {
			case 1:
				String desName = desInput("이름");
				
				Set<String> desKey = destination.keySet();
				int cnt = 1;
				
				for(String k : desKey) {
					if(k.contains(desName)) {
						System.out.println(cnt + ". " + k);
						desList.add(k);
						cnt++;
					}
				}
				
				if(desList.isEmpty()) {
					System.out.println("검색된 목적지 이름이 없습니다.");
				} else {
					selectNum(desList);
				}
				break;
			case 2:
				if(destination.isEmpty()) {
					System.out.println("출력할 목적지 이름이 없습니다.");
				} else {
					//Set<String> key = destination.keySet();
					int i = 1;
					for(String k : destination.keySet()) {
						System.out.println(i + ". " + k);
						desList.add(k);
						i++;
					}
					selectNum(desList);
				}
				break;
			case 0:
				System.out.println("메인 메뉴로 이동합니다.");
				return;
			default:
				System.out.println("선택된 메뉴 번호가 없습니다.");
			}
		}
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		String desName = desInput("이름");
		
		Navigation nav = destination.get(desName);
		
		if(nav == null) {
			System.out.println("검색한 목적지 이름이 없습니다.");
		} else {
			Navigation chgNav = new Navigation(nav.getVisit());
			chgNav.setDesName(desInput("이름"));
			chgNav.setDesAddress(desInput("주소"));
			destination.remove(nav.getDesName());
			destination.put(chgNav.getDesName(), chgNav);
			System.out.println(chgNav.getDesName() + "이 수정 되었습니다.");
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		String desName = desInput("이름");
		
		Navigation nav = destination.get(desName);
		
		if(nav == null) {
			System.out.println("검색한 목적지 이름이 없습니다.");
		} else {
			System.out.println("목적지 주소 : " + nav.getDesAddress());
			
			System.out.print("삭제를 하시겠습니까? (y/n) ");
			String check = sc.next();
			
			if(check.equals("y") || check.equals("Y")){
				System.out.println(nav.getDesName() + "을 삭제했습니다.");
				destination.remove(desName);
			} else {
				System.out.println("삭제가 취소되었습니다.");
			}
		}
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.print("초기화를 진행하시겠습니까 ? (y/n) ");
		String check =  sc.next();
		
		if(check.equals("y") || check.equals("Y")) {
			System.out.println("초기화를 진행합니다.");
			destination.clear();
			visit.clear();
		} else {
			System.out.println("초기화를 취소합니다.");
		}
		
	}

	@Override
	public void lastVisit() {
		// TODO Auto-generated method stub
		int i = visit.size() - 6;
		
		if(i < 0) {
			i = 0;
		}
		
		for(int cnt=visit.size()-1;cnt>i;cnt--) {
			System.out.println(visit.get(cnt));
		}
	}
	
}