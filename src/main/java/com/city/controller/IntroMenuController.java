package com.city.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import com.city.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Nidhal
 */
public class IntroMenuController {

    @FXML
    private Button nextButton;
    @FXML
    private Button quitButton;

    private Runnable nextScreenHandler;

    public void setNextScreenHandler(Runnable handler) {
        nextScreenHandler = handler;
    }

    @FXML
    private void initialize() {
        nextButton.setOnAction(event -> {
            if (nextScreenHandler != null) {
                nextScreenHandler.run();
            }
        });
    }
     @FXML
     public void quit() {
        System.exit(0);
    }
}