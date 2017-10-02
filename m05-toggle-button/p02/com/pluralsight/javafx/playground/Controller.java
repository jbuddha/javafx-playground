package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void onToggle(ActionEvent event) {
        ToggleButton t = (ToggleButton)event.getTarget();
        if (t.isSelected())
            log(t.getText() + " is selected");
        else
            log(t.getText() + " is unselected");
    }

}
