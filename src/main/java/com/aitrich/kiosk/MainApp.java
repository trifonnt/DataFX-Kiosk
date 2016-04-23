package com.aitrich.kiosk;

import com.aitrich.kiosk.controller.LoginController;
import com.aitrich.kiosk.controller.MainController;

import io.datafx.controller.flow.Flow;
import javafx.application.Application;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class MainApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		new Flow(MainController.class)
		new Flow(LoginController.class)
			.startInStage(primaryStage);
	}
}