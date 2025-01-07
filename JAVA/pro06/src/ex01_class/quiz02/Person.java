package ex01_class.quiz02;

import java.util.Scanner;

public class Person {
	private String name;
	private String address;
	private int age;
	Scanner sc = new Scanner(System.in);
	
	public void getName() {
		System.out.println("이름 : " + name);
	}
	public void setName() {
		System.out.print("이름 입력 : ");
		this.name = sc.next();
	}
	public void getAddress() {
		System.out.println("주소 : " + address);
	}
	public void setAddress() {
		System.out.print("주소 입력 : ");
		this.address = sc.next();
	}
	public void getAge() {
		System.out.println("나이 : " + age);
	}
	public void setAge() {
		System.out.print("나이 입력 : ");
		this.age = sc.nextInt();
	}
}