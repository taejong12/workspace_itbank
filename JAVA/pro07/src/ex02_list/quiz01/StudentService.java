package ex02_list.quiz01;

import java.util.List;

public interface StudentService {
	public abstract void menu();
	public abstract Student input();
	public abstract void output(List<Student> student);
	public abstract void delete(List<Student> student);
	public abstract void modify(List<Student> student);
	public abstract void emptyMsg(String sub);
}