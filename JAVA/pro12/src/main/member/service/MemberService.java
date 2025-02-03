package main.member.service;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import main.common.service.CommonService;
import main.member.controller.Controller;
import main.member.dao.MemberDAO;
import main.member.dto.Member;

public class MemberService {
	CommonService cs = new CommonService();
	MemberDAO dao = new MemberDAO();
	
	public void membershipProc(Parent root) {
		// TODO Auto-generated method stub
		Stage memberForm =
			(Stage)root.getScene().getWindow();
		
		FXMLLoader loader = new FXMLLoader(
			getClass().getResource
				("/main/fxml/joinMember.fxml"));
		
		Parent member = null;
		try {
			member = loader.load();
			memberForm.setScene(new Scene(member));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		
		Controller ctrl = loader.getController();
		
		ComboBox<String> cmbAge =
			(ComboBox<String>)member.lookup("#cmbAge");
		
		String ageString[] =
			{"10대","20대","30대","40대","50대","60대","70대 이상"};
		cmbAge.getItems().addAll
			(FXCollections.observableArrayList(ageString));
		// cmbAge.getItems().addAll("10대","20대","30대","40대","50대","60대","70대 이상");
		
		memberForm.setTitle("회원가입창");
		memberForm.show();
	}

	public void joinMember(ActionEvent event) {
		// TODO Auto-generated method stub
		Parent memberForm = 
				(Parent) event.getSource();
		
		Member m = new Member();
		
		TextField id = (TextField) 
				memberForm.lookup("#txtId");
		TextField name = (TextField)
				memberForm.lookup("#txtName");
		PasswordField pwd = (PasswordField)
				memberForm.lookup("#txtPw");
		PasswordField pwdOk = (PasswordField)
				memberForm.lookup("#txtPwOk");
		
		if(id.getText().isEmpty()) {
			cs.msgBox("입력오류", "아이디 입력 오류", 
			"아이디가 입력되지 않았습니다. 다시 입력하세요");
			id.requestFocus();
			return;
		} else if(name.getText().isEmpty()) {
			cs.msgBox("입력오류", "이름 입력 오류", 
			"이름이 입력되지 않았습니다. 다시 입력하세요");
			name.requestFocus();
			return;
		} else if(pwd.getText().isEmpty()) {
			cs.msgBox("입력오류", "암호 입력 오류", 
			"암호가 입력되지 않았습니다. 다시 입력하세요");
			pwd.requestFocus();
			return;
		} else if(pwdOk.getText().isEmpty()) {
			cs.msgBox("입력오류", "암호확인 입력 오류", 
			"암호확인이 입력되지 않았습니다. 다시 입력하세요");
			pwdOk.requestFocus();
			return;
		}
		
		if(pwd.getText().equals(pwdOk.getText())) {
			cs.msgBox("암호", "암호일치여부", "암호가 일치합니다.");
		} else {
			cs.msgBox("암호", "암호일치여부", 
			"암호가 일치하지 않습니다. 다시 입력하세요.");
			pwd.clear();
			pwdOk.clear();
			pwd.requestFocus();
			return;
		}
		
		m.setId(id.getText());
		m.setPwd(pwd.getText());
		m.setName(name.getText());
		
		RadioButton rdoMan =
			(RadioButton)memberForm.lookup("#rdoMan");
		RadioButton rdoWoman =
			(RadioButton)memberForm.lookup("#rdoWoman");
		
		if(rdoMan.isSelected()) {
			m.setGender("M");
		} else if (rdoWoman.isSelected()) {
			m.setGender("W");
		}
		
		ComboBox<String> cmbAge =
			(ComboBox<String>)memberForm.
				lookup("#cmbAge");
		
		if(cmbAge.getValue() == null) {
			cs.msgBox("연령대선택", "연령대 선택 오류", 
				"연령대가 선택되지 않았습니다. 다시 선택하세요.");
			cmbAge.requestFocus();
			return;
		} else {
			switch(cmbAge.getValue()) {
			case "10대":
				m.setAge(10);
				break;
			case "20대":
				m.setAge(20);
				break;
			case "30대":
				m.setAge(30);
				break;
			case "40대":
				m.setAge(40);
				break;
			case "50대":
				m.setAge(50);
				break;
			case "60대":
				m.setAge(60);
				break;
			default:
				m.setAge(70);
				break;
			}			
		}
		CheckBox chkMusic =
			(CheckBox)memberForm.lookup("#chkMusic");
		CheckBox chkSports =
			(CheckBox)memberForm.lookup("#chkSports");
		CheckBox chkMovie =
			(CheckBox)memberForm.lookup("#chkMovie");
		
		
		// 2진수 기법
		// 음악 1
		// 스포츠 2
		// 영화 4
		int hobby = 0;
		
		if(chkMusic.isSelected()) {
			hobby += 1;
		} 
		if(chkSports.isSelected()) {
			hobby += 2;
		}
		if(chkMovie.isSelected()) {
			hobby += 4;
		}
		
		m.setHobby(hobby);
		
		if(hobby >= 4) {
			hobby -= 4;
			System.out.println("영화");
		}
		if(hobby >= 2) {
			hobby -= 2;
			System.out.println("운동");
		}
		if(hobby >= 1) {
			hobby -= 1;
			System.out.println("음악");
		}
		
		if(dao.insertMember(m)) {
			Stage s = (Stage) 
				memberForm.getScene().getWindow();
			FXMLLoader loader =
				new FXMLLoader(
				getClass().
				getResource("/main/fxml/login.fxml"));
			
			
			try {
				memberForm = loader.load();
				s.setScene(new Scene(memberForm));
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			s.setTitle("로그인");
			s.show();
		} else {
			id.clear();
			pwd.clear();
			pwdOk.clear();
			name.clear();
			rdoWoman.setSelected(true);
			chkMusic.setSelected(false);
			chkSports.setSelected(false);
			chkMovie.setSelected(false);
			cmbAge.setValue(null);
		}
	}

}







