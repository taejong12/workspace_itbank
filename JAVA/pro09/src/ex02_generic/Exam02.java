package ex02_generic;

import java.util.List;
import java.util.Map;

class Gen<T, M> {
	private T t;
	private M m;
	
	public void setT(T t) { 
		this.t = t;
	}
	public void setM(M m) {
		this.m = m;
	}
	public T getT() {
		return t;
	}
	public M getM() {
		return m;
	}
}
public class Exam02 {
	public static void main(String[] args) {
		Gen<String, Integer> gen=
				new Gen<String, Integer>();
		gen.setT("홍길동");
		gen.setM(100);
		System.out.println(gen.getT() + ", " 
				+ gen.getM());
	}
}



