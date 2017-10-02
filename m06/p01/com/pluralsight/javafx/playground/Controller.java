package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML
    private ToggleGroup mainCourse;

    @FXML
    private ToggleGroup dessert;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void onSelection(ActionEvent event) {
        RadioButton r = (RadioButton)event.getTarget();
        if (r.isSelected())
            log(r.getText() + " is selected");
        else
            log(r.getText() + " is unselected");
    }
}
