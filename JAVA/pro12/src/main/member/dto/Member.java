package main.member.dto;

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String gender;
	private int age;
	private int hobby;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHobby() {
		return hobby;
	}
	public void setHobby(int hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " : " + this.name;
	}
	
}