package main.member.controller;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
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
	}
	
	public void membershipProc() {
		ms.membershipProc(root);
	}
	public void joinMember() {
		ms.joinMember(root);
	}
	public void cancelProc(ActionEvent event) {
		cs.windowClose(event);
	}
	
}