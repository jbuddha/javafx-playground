package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    private List<String> fonts = Font.getFontNames();

    private Random random = new Random();

    @FXML
    private Label effected;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List<String> fonts = Font.getFontNames();
        Label l1 = new Label("Dynamic Label");
        l1.setFont(new Font(getRandomFont(), 20));
        l1.setTextFill(Paint.valueOf("#0000FF"));
        l1.setStyle("-fx-underline: true");
        add(l1);

        Label l2 = new Label("API Drop Shadow");
        l2.setLayoutX(49);
        l2.setLayoutY(250);
        l2.setFont(new Font(30));
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(10);
        dropShadow.setOffsetY(10);
        l2.setEffect(dropShadow);
        add(l2);
        //effected.setEffect();
    }

    private String getRandomFont() {
        return fonts.get(random.nextInt(fonts.size()));
    }
}
