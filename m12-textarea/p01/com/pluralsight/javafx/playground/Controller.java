package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML private TextArea textArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textArea.setText("Initial Text"+System.lineSeparator());
        textArea.appendText(System.lineSeparator());
        textArea.appendText("Another text appended");
        System.out.println(textArea.getParagraphs());
    }
}
