package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.HTMLEditor;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML private HTMLEditor htmlEditor;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void onType(KeyEvent event) {
        log.setText(htmlEditor.getHtmlText());
    }
}
