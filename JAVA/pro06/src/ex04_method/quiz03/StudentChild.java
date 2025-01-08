package ex04_method.quiz03;

public class StudentChild extends StudentParent {
	private int music;
	private int sport;
	
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getSport() {
		return sport;
	}
	public void setSport(int sport) {
		this.sport = sport;
	}
	
	// this : 객체 자신
	// super : 부모클래스의 필드나 메서드
	public void setTotal() {
		super.total =kor+eng+math+music+sport;
	}
	public void setAvg() {
		avg = total / 5.0;
	}
}