package exam02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exam02 extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		// fxml 로 만들어진 화면 구성을 읽어 오기
		FXMLLoader loader = 
			new FXMLLoader(
				getClass().getResource("login.fxml")
				);
		
		// 읽어온 화면 구성은 Scene의 최상위 클래스에 저장
		Parent root = loader.load();
		
		// fxml 파일의 controller 지정
		Controller ctrl = loader.getController();
		ctrl.setRoot(root);
		
		// stage Scene 구성에 fxml 의 내용으로 처리
		stage.setScene(new Scene(root));
		stage.setTitle("로그인페이지");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}