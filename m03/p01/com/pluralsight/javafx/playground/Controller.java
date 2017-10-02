package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML
    private Label hoveredLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image happyImage = new Image(getClass().getResourceAsStream("happy.png"), 25, 25, true, true);
        Image sadImage = new Image(getClass().getResourceAsStream("sad.png"), 25, 25, true, true);

        ImageView happyView = new ImageView(happyImage);
        ImageView sadView = new ImageView(sadImage);

        hoveredLabel.setGraphic(sadView);

    }

}
