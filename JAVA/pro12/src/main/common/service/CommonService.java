package main.common.service;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class CommonService {
	
	public void windowClose(ActionEvent event) {
		Parent p = (Parent)event.getSource();
		Stage s = (Stage) p.getScene().getWindow();
		s.close();
		msgBox("취소", "취소버튼 클릭", "창이 닫힙니다.");
	}
	
	public void msgBox(String title, String subject,
			String content) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setHeaderText(subject);
		alert.setContentText(content);
		alert.showAndWait();
	}
}