package exam01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class exam01 extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		// Scene : 화면의 요소 
		stage.setScene(new Scene(new Pane(), 300,200));
		// stage : 화면을 구성하는 틀
		stage.setTitle("stage 제목");
		// stage.show() : 틀 출력
		stage.show();
	}
	
	public static void main(String[] args) {
		// start() 메서드는 launch(args); 실행해야만 한다.
		launch(args);
	}
	
}
