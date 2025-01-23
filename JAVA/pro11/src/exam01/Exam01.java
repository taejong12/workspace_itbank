package exam01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

// javaFX 사용하려면 Application 상속 받아야 한다.
public class Exam01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setScene
			(new Scene(new Pane(), 300, 200));
		primaryStage.setTitle("화면");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		// start 메서드 실행은 launch(args) 로 실행
		launch(args);
	}
}