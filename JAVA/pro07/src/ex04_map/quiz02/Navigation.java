package ex04_map.quiz02;

public class Navigation {
	private String desName;
	private String desAddress;
	private int visit;
	
	public Navigation() {
		// TODO Auto-generated constructor stub
		visit = 0;
	}
	
	public Navigation(int visit) {
		this.visit = visit;
	}
	
	public String getDesName() {
		return desName;
	}
	public void setDesName(String desName) {
		this.desName = desName;
	}
	public String getDesAddress() {
		return desAddress;
	}
	public void setDesAddress(String desAddress) {
		this.desAddress = desAddress;
	}
	public int getVisit() {
		return visit;
	}
	public void setVisit() {
		this.visit += 1;
	}
}