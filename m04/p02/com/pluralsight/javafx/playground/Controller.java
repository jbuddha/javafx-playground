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
        Button dynamicButton = new Button("Dynamic Button");
        dynamicButton.setOnAction(this::simpleClick);
        dynamicButton.setLayoutX(20);
        dynamicButton.setLayoutY(150);
        add(dynamicButton);

        simpleButton2.setOnAction(this::simpleClick);
    }

    @FXML
    void simpleClick(ActionEvent event) {
        log(((Button)event.getTarget()).getText() + " clicked");
    }
}
