package com.pluralsight.javafx.playground;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Label l1 = new Label("Dynamic Label");
        l1.setFont(new Font(Font.getFontNames().get(11), 25));
        add(l1);
    }


}
