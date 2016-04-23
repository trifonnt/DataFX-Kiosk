package com.aitrich.kiosk.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import io.datafx.controller.ViewController;
import io.datafx.controller.flow.action.ActionMethod;
import io.datafx.controller.flow.action.ActionTrigger;

@ViewController("/fxml/Login.fxml")
public class LoginController {
	@FXML
	private GridPane loginPane;
	@FXML
	private TextField adminUserName;
	@FXML
	private PasswordField adminPassword;
	@FXML
	private Label errUser;
	@FXML
	@ActionTrigger("loginClick")
	private Button btnLogin;

	@PostConstruct
	public void init(){

	}

	@ActionMethod("loginClick")
	public void onLoginClick() throws IOException {
		loginPane.getChildren().clear();
		loginPane.getChildren().add(FXMLLoader.load(getClass().getResource("/fxml/RootLayout.fxml")));
	}
}
