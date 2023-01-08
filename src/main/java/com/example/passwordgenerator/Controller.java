package com.example.passwordgenerator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField field;

    @FXML
    private Button go;

    @FXML
    private Label output;

    @FXML
    void onInput(ActionEvent event) {
        int test = Integer.parseInt(String.valueOf(field.getCharacters()));
        System.out.println(test);
        SequenceGenerator.setLength(test);
        System.out.println(SequenceGenerator.getLength());
    }

    @FXML
    void onNumberButtonClick(ActionEvent event) {
        SequenceGenerator.setNums(!SequenceGenerator.getNums());
        System.out.println(SequenceGenerator.getNums());
        System.out.println("numbers");
    }

    @FXML
    void onPress(ActionEvent event) {
        String text = SequenceGenerator.generateSequence();
        System.out.println(text);
        output.setText(text);
        System.out.println("button pressed");
    }

    @FXML
    void onSpecialCaseButtonClick(ActionEvent event) {
        SequenceGenerator.setSpecChar(!SequenceGenerator.getSpecChar());
        System.out.println(SequenceGenerator.getSpecChar());
        System.out.println("special character");
    }

    @FXML
    void onUpperCaseButtonClick(ActionEvent event) {
        SequenceGenerator.setUpCase(!SequenceGenerator.getUpCase());
        System.out.println(SequenceGenerator.getUpCase());
        System.out.println("upper case");
    }

}




