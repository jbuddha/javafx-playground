package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML private TextField name;
    @FXML private TextField phone;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        name.setOnAction(event -> {
            log("Action on name field");
        });

        phone.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                log("Focus acquired");
            } else {
                log("Focus lost");
            }
        });

        phone.disableProperty().bind(name.textProperty().length().lessThan(1));
    }
}
