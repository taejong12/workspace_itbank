package main.login.service;

import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.common.service.CommonService;
import main.login.controller.Controller;
import main.login.dao.LoginDAO;
import main.member.dto.Member;

public class LoginService {
	LoginDAO dao;
	
	public LoginService() {
		// TODO Auto-generated constructor stub
		dao = new LoginDAO();
	}
	
	public void loginProc(Parent root) {
		// TODO Auto-generated method stub
		TextField id = 
				(TextField)root.lookup("#txtId");
		PasswordField pwd = 
				(PasswordField)root.lookup("#txtPw");
		// System.out.println(id.getText());
		// System.out.println(pwd.getText());
		if(dao.loginChk(id.getText(), pwd.getText())) {
			memberInfo(root);
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

	private void memberInfo(Parent root) {
		// TODO Auto-generated method stub
		// root -> getScene() : container
		// container -> getWindow() 
		// 		- contrainer 를 가진 창
		Stage s = (Stage)root.getScene().getWindow();
		s.close();
		
		Stage infoStage = new Stage();
		FXMLLoader loader =	new FXMLLoader(
				getClass().getResource("/main/fxml/info.fxml"));
		
		Parent info = null;
		try {
			info = loader.load();
			infoStage.setScene(new Scene(info));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setRoot(info);
		
		ListView<Member> infoListView =
				(ListView)info.lookup("#infoListView");
		
		List<Member> memberList = dao.selectAll();
		
		infoListView.setItems(FXCollections.
				observableArrayList(memberList));
		
		infoListView.getSelectionModel().
			selectedIndexProperty().addListener(
				new ChangeListener<Number>() {
					@Override
					public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
						// TODO Auto-generated method stub
						Member m = infoListView.
								getSelectionModel().getSelectedItem();
						System.out.println(m.getId());
						System.out.println(m.getPwd());
						System.out.println(m.getName());
						System.out.println(m.getGender());
						System.out.println(m.getAge());
						System.out.println(m.getHobby());
					}
			});
		infoStage.setTitle("회원정보");
		infoStage.show();
	}

	public void logout(Parent root) {
		// TODO Auto-generated method stub
		Stage s = (Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(
				getClass()
				.getResource("/main/fxml/login.fxml"));
		Parent logout = null;
		try {
			logout = loader.load();
			s.setScene(new Scene(logout));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setRoot(logout);
		
		CommonService cs = new CommonService();
		cs.msgBox("로그아웃", "로그아웃성공", "로그인 창이 열립니다.");
		s.setTitle("로그인");
		s.show();
	}

}




