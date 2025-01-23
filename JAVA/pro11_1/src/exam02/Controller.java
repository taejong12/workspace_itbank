package exam02;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
	private Parent root;
	
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	
	public void loginProc() {
		TextField id = 
			(TextField) root.lookup("#txtId");
		PasswordField pwd =
			(PasswordField) root.lookup("#txtPw");
		System.out.println("아이디 : " + id.getText());
		System.out.println("암호 " + pwd.getText());
	
		System.out.println("로그인 버튼 클릭");
	}
	
	public void cancelProc() {
		System.out.println("취소 버튼 클릭");
	}
	
	public void membershipProc() {
		System.out.println("회원가입버튼 클릭");
	}
}