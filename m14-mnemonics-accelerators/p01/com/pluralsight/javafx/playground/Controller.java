package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Button button = new Button("_Button");
        button.setMnemonicParsing(true);
    }

    @FXML
    void onNext(ActionEvent event) {
        log("Clicked Next");
    }

    @FXML
    void onPrevious(ActionEvent event) {
        log("Clicked Previous");
    }
}
