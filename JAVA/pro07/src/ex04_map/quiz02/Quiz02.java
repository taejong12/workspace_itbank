package ex04_map.quiz02;

public class Quiz02 {

	/*
	 * Navigation 클래스 생성 - 목적지 이름 - 목적지 주소 - 목적지 방문 횟수
	 * 
	 * NavigationService 인터페이스 - 목적지 등록, 목적지 선택, 목적지 수정, 목적지 삭제, - 최근 목적지(5개), 네비게이션
	 * 초기화, 프로그램 종료 - 메서드는 여러분이 어떤게 필요할지 고민하시고 지정
	 * 
	 * NavigationServiceImpl 클래스 - NavigationService 의 구현 클래스 - Map : 목적지 정보 저장,
	 * List : 최근 목적지 이름 저장
	 * 
	 * NavigationMain 클래스 - 실행 클래스
	 * 
	 * 
	 * 
	 * ================================================================================================
	 * 
	 * Map<String,Navigation> - 목적지 정보 저장 List<String> - 최근 목적지 저장 Scanner - 입력 객체
	 * 
	 * int menu() - 메뉴 관련 메서드 1. 목적지 등록 2. 목적지 선택 3. 목적지 수정 4. 목적지 삭제 5. 네비게이션 초기화
	 * 6. 최근목적지 0. 프로그램 종료 메뉴 선택 :
	 * 
	 * void input() - Navigation 객체 생성 - 목적지 이름 저장 - 목적지 주소 저장 - 방문 횟수 : 0 -
	 * Navigation 객체 생성 시 초기값으로 0 : 편하다 - setter 를 이용해서 0 으로 초기화 - 객체 생성시 기본 데이터 타입
	 * 초기값 0 - Map 에 저장 : <목적지 이름, Navigation 객체>
	 * 
	 * void select() - Map 에 저장된 내용을 출력, 선택 - 목적지 이름 입력 관련 주소를 선택 - 유사한 이름 입력 관련 주소를
	 * 선택 - 선택하면 목적지의 방문횟수를 증가 시킴 - List의 목적지 이름 추가 저장
	 * 
	 * void modify() - 목적지 이름 입력 목적지 주소 출력 - 출력된 내용으로 수정 여부 확인하고 Navigation 객체 수정
	 * 
	 * void delete() - 목적지 이름 입력 목적지 주소 출력 - 출력된 내용을 삭제 여부 확인하고 Map 에서 삭제
	 * 
	 * void init() - 초기화 여부를 확인하고 초기화
	 * 
	 * void lastVisit() - List 에서 저장된 마지막 5개 출력
	 */









}
