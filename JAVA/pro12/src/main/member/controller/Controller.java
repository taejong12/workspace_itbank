package main.member.controller;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.common.service.CommonService;
import main.member.service.MemberService;

public class Controller {
	Parent root;
	MemberService ms;
	CommonService cs;
	
	public Controller() {
		// TODO Auto-generated constructor stub
		ms = new MemberService();
		cs = new CommonService();
	}
	
	public void setRoot(Parent root) {
		this.root = root;
		ms.membershipProc(root);
	}
	
	public void joinMember(ActionEvent event) {
		System.out.println("회원가입 버튼");
		TextField id = 
				(TextField)root.lookup("#txtId");
		TextField name = 
				(TextField)root.lookup("#txtName");
		PasswordField pwd = 
				(PasswordField)root.lookup("#txtPw");
		PasswordField pwdOK = 
				(PasswordField)root.lookup("#txtPwOk");
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("pwd: "+pwd);
		System.out.println("pwdOK: "+pwdOK);
		ms.joinMember(event);
	}
	public void cancelProc(ActionEvent event) {
		cs.windowClose(event);
	}
	
}