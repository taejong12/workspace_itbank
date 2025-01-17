package ex05_text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class User {
	private String name;
	private int age;
	public User(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	public String get() {
		return name + "," + age;
	}
}
public class Exam03 {
	public static void main(String[] args) 
			throws Exception {
		Scanner sc = new Scanner(System.in);
		File dir = new File("C:\\Users\\dbxow\\git\\workspace_itbank\\JAVA\\pro09\\src\\ex05_text");
		File file = new File(dir, "bbb.txt");
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		User u = new User(name, age);
		System.out.println(u.get());
		
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println(u.get());
		
		pw.close();
		bw.close();
		fw.close();
	}
}





