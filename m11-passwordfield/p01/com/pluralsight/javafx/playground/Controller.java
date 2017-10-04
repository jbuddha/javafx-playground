package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.PasswordField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML private PasswordField passwordField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        passwordField.setCursor(Cursor.CROSSHAIR);
    }
}
