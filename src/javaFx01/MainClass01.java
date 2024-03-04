package javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println("start실행");
		Label lb = new Label();
		lb.setFont(new Font(30));
		lb.setText("안녕하세요");
		
		Scene scene = new Scene(lb, 200, 300);//가로 세로크기
		arg0.setScene(scene);
		
		arg0.setTitle("제목을 설정합니다");
		arg0.show();//그래픽실행
		
		
	}
	public static void main(String[] args) {
		launch(args);//aplication의 start호출
		
	}
}
