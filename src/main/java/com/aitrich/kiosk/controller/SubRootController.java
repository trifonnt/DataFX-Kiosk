package com.aitrich.kiosk.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import io.datafx.controller.ViewController;
import io.datafx.controller.flow.action.ActionMethod;
import io.datafx.controller.flow.action.ActionTrigger;


@ViewController("/fxml/SubRoot.fxml")
public class SubRootController {

	@FXML
	@ActionTrigger("buy")
	private Button btnBuy;

	@FXML
	@ActionTrigger("collect")
	private Button btnCollect;

	@ActionMethod("buy")
	public void onBuyTicketsClicked() {
		System.out.println("*********");
	}
}