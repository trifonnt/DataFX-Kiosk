package com.aitrich.kiosk;

import java.io.IOException;
import javax.annotation.PostConstruct;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import io.datafx.controller.FXMLController;

@FXMLController("/fxml/RootLayout.fxml")
public class MainController {
	@FXML
	private GridPane root;
	@FXML
	public GridPane rightContent;

	@PostConstruct
	public void init() throws IOException{
		loadSubroot();
	}
	
	/**
	 * load subroot
	 * @throws IOException 
	 */
	public void loadSubroot() throws IOException {
		rightContent.getChildren().clear();
		rightContent.getChildren().add(FXMLLoader.load(getClass().getResource("/fxml/SubRoot.fxml")));
	}

	
}
