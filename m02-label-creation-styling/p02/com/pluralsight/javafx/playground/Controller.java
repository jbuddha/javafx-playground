package com.pluralsight.javafx.playground;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    private List<String> fonts = Font.getFontNames();

    int index = (int)(System.currentTimeMillis() % fonts.size());

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List<String> fonts = Font.getFontNames();
        Label l1 = new Label("Dynamic Label");
        l1.setFont(new Font(fonts.get(index), 20));

        add(l1);
    }


}
