package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML private PasswordField passwordField;

    @FXML private TextField textField;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textField.textProperty().bind(passwordField.textProperty());
    }
}
