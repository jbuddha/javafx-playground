package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML private Button nextButton;
    @FXML private Button previousButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nextButton.setTooltip(new Tooltip("Go To Next Page"));
        previousButton.setTooltip(new Tooltip("Go to previous page"));
    }
}
