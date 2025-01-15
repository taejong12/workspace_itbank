package ex02_object;

class Counter {
	private int no;
	public Counter(int no) {
		// TODO Auto-generated constructor stub
		this.no = no;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(no + 
				"번 객체 finalize() 실행");
	}
}
public class Exam04 {
	public static void main(String[] args) {
		Counter cnt = null;
		
		for(int i=0;i<50;i++) {
			cnt = new Counter(i);
			cnt = null;
			System.gc();
		}
	}
}