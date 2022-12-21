package com.example.passwordgenerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label welcomeText;

    @FXML
    void onUpperCaseButtonClick(ActionEvent event) {
        SequenceGenerator.setUpCase(!SequenceGenerator.getUpCase());
        System.out.println("upper case");
    }

    @FXML
    void onNumberButtonClick(ActionEvent event) {
        SequenceGenerator.setNums(!SequenceGenerator.getNums());
        System.out.println("numbers");
    }

    @FXML
    void onSpecialCaseButtonClick(ActionEvent event) {
        SequenceGenerator.setSpecChar(!SequenceGenerator.getSpecChar());
        System.out.println("special character");
    }

    @FXML
    void onInput(ActionEvent event) {

    }

}
