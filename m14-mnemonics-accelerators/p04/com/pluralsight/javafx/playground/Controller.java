package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private MenuItem firstMenuItem;

    @FXML
    private MenuItem secondMenuItem;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        firstNameLabel.setLabelFor(firstNameTextField);
        lastNameLabel.setLabelFor(lastNameTextField);

//        secondMenuItem.setAccelerator(KeyCombination.valueOf("Ctrl+Alt+2"));
//        secondMenuItem.setAccelerator(new KeyCodeCombination(KeyCode.DIGIT2, KeyCodeCombination.CONTROL_DOWN, KeyCodeCombination.ALT_DOWN));
    }

    @FXML
    void onFirstMenuItemClicked(ActionEvent event) {
        log("First menu item clicked");
    }

    @FXML
    void onSecondMenuItemClicked(ActionEvent event) {
        log("Second menu item clicked");
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
