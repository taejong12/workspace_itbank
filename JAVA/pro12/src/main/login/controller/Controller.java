package main.login.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.common.service.CommonService;
import main.login.service.LoginService;

public class Controller {
	Parent root;
	LoginService ls;
	CommonService cs;
	main.member.controller.Controller ctrl;
	
	public Controller() {
		// TODO Auto-generated constructor stub
		ls = new LoginService();
		cs = new CommonService();
		ctrl = new main.member.controller.Controller();
	}
	
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	
	public void loginProc() {
		ls.loginProc(root);
		// System.out.println("로그인 버튼 클릭");
	}
	
	public void cancelProc(ActionEvent event) {
		cs.windowClose(event);
		System.out.println("취소 버튼 클릭");
	}
	
	public void membershipProc() {
		ctrl.setRoot(root);
		ctrl.membershipProc();
	}
	
	public void logout() {
		ls.logout(root);
	}
}