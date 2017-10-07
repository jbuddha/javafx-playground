package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.HTMLEditor;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller extends BaseController implements Initializable {

    @FXML private HTMLEditor htmlEditor;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void onType(KeyEvent event) {
        log.setText(getText(htmlEditor.getHtmlText()));
    }

    private String getText(String htmlText) {
        Pattern pattern = Pattern.compile("<[^>]*>");
        Matcher matcher = pattern.matcher(htmlText);
        final StringBuffer sb = new StringBuffer(htmlText.length());
        while(matcher.find()) {
            matcher.appendReplacement(sb, " ");
        }
        matcher.appendTail(sb);
        return sb.toString().trim();
    }
}
