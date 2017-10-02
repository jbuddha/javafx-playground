package com.pluralsight.javafx.playground;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    IntegerProperty count = new SimpleIntegerProperty(0);

    @FXML
    private Label selectedCount;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CheckBox c1 = new CheckBox("Squash");
        c1.setOnAction(this::onToggle);
        c1.setLayoutX(36);
        c1.setLayoutY(280);

        selectedCount.textProperty().bind(count.asString());

        add(c1);
    }

    @FXML
    void onToggle(ActionEvent event) {
        CheckBox c = (CheckBox)event.getTarget();
        if (c.isSelected()) {
            log(c.getText() + " is checked");
            count.set(count.getValue() + 1);
        } else {
            log(c.getText() + " is unchecked");
            count.set(count.getValue() - 1);
        }
    }
}
