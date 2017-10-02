package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void onClick(ActionEvent event) {
        Hyperlink h = (Hyperlink)event.getTarget();
        log("Clicked: " + h.getText());
    }
}
