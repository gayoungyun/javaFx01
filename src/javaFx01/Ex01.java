package javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	public void start(Stage arg0) throws Exception {
		FlowPane flowPane = new FlowPane();
		flowPane.setVgap(10);
		flowPane.setHgap(20);
		
		for(int i = 1; i<=10; i++) {
			Button btn01 = new Button();
			btn01.setText("버튼"+i);
			flowPane.getChildren().add(btn01);
		}
		arg0.setTitle("FlowPaneEx");
		Scene sc = new Scene(flowPane);
		arg0.setScene(sc);
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
