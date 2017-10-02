package com.pluralsight.javafx.playground;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML
    private ToggleGroup mainCourse;

    @FXML
    private ToggleGroup dessert;

    @FXML
    private Button submitButton;

    BooleanProperty disable = new SimpleBooleanProperty();

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        RadioButton r = new RadioButton("Salmon");
        r.setOnAction(this::onSelection);
        r.setLayoutX(14);
        r.setLayoutY(145);
        r.setToggleGroup(mainCourse);
        add(r);
        disable.bind(mainCourse.selectedToggleProperty().isNull().or(dessert.selectedToggleProperty().isNull()));
        submitButton.disableProperty().bind(disable);
    }

    @FXML
    void onSelection(ActionEvent event) {
        ToggleButton r = (ToggleButton)event.getTarget();
        if (r.isSelected())
            log(r.getText() + " is selected");
        else
            log(r.getText() + " is unselected");
    }

    @FXML
    void confirmOrder(ActionEvent event) {
        RadioButton mainCourseOption = (RadioButton)mainCourse.getSelectedToggle();
        RadioButton dessertOption = (RadioButton)dessert.getSelectedToggle();

        log("---------------");
        log("" + mainCourseOption.getText() + " for main course");
        log("" + dessertOption.getText() + " for dessert");
        log("Excellent Choice");

    }
}
