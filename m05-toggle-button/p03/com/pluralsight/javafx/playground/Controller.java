package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML ToggleGroup alphabetGroup;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ToggleButton t1 = new ToggleButton("Toggle D");
        t1.setLayoutY(175);
        t1.setLayoutX(14);
        t1.setToggleGroup(alphabetGroup);
        add(t1);
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
