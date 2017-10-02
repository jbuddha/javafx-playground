package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CheckBox c1 = new CheckBox("Squash");
        c1.setOnAction(this::onToggle);
        c1.setLayoutX(36);
        c1.setLayoutY(280);
        add(c1);
    }

    @FXML
    void onToggle(ActionEvent event) {
        CheckBox c = (CheckBox)event.getTarget();
        if (c.isSelected()) {
            log(c.getText() + " is checked");
        } else {
            log(c.getText() + " is unchecked");
        }
    }
}
