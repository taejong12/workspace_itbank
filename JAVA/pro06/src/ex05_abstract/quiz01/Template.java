package ex05_abstract.quiz01;

public abstract class Template {
	
	public abstract int menu();
	
	public abstract void input();
	
	public abstract void output();
	
	public int main() {
		while(true) {
			
			int menu = menu();
			
			switch(menu) {
				case 1:
					input();
					break;
				case 2:
					output();
					break;
				case 3:
					System.out.println("이전페이지");
					return 1;
				default:
					System.out.println("없는 번호");
			}

		}

	}
	
}