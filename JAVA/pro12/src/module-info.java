module pro12 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.graphics;
	
	exports main;
	opens main.login.controller to javafx.fxml;
	opens main.member.controller to javafx.fxml;
}