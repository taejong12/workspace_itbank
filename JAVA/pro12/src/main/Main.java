package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.login.controller.Controller;

public class Main extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(
			getClass().getResource("fxml/login.fxml"));
		
		Parent root = loader.load();
		
		Controller ctrl = loader.getController();
		ctrl.setRoot(root);
		
		stage.setScene(new Scene(root));
		stage.setTitle("로그인");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}


