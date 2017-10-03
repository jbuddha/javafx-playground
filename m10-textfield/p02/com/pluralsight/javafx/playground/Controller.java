package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;

public class Controller extends BaseController implements Initializable {

    @FXML private TextField name;
    @FXML private TextField phone;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        name.setOnAction(event -> {
            log("Action on name field");
        });

        phone.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                log("Focus acquired");
            } else {
                log("Focus lost");
            }
        });

        phone.disableProperty().bind(name.textProperty().length().lessThan(1));

        phone.setTextFormatter(new TextFormatter<Object>(new UnaryOperator<TextFormatter.Change>() {
            @Override
            public TextFormatter.Change apply(TextFormatter.Change change) {
                change.setText(change.getText().replaceAll("[^0-9]", ""));
                return change;
            }
        }));
    }
}
