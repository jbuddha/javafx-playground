package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML
    private Button simpleButton2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        simpleButton2.setOnAction(this::simpleClick);
    }

    @FXML
    void simpleClick(ActionEvent event) {
        log(((Button)event.getTarget()).getText() + " clicked");
    }
}
