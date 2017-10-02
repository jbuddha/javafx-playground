package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML
    private Button simpleButton2;

    @FXML
    private Button submitButton;

    @FXML
    private Button cancelButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Button dynamicButton = new Button("Dynamic Button");
        dynamicButton.setOnAction(this::simpleClick);
        dynamicButton.setLayoutX(20);
        dynamicButton.setLayoutY(150);
        add(dynamicButton);
        dynamicButton.setStyle("-fx-background-color: #00ff00");
        simpleButton2.setOnAction(this::simpleClick);

        Image happyImage = new Image(getClass().getResourceAsStream("happy-green.png"),
                                      30,
                                      30,
                                      true,
                                      true);
        ImageView happyImageView = new ImageView(happyImage);

        Image sadImage = new Image(getClass().getResourceAsStream("sad-orange.png"),
                                     30,
                                     30,
                                     true,
                                     true);
        ImageView sadImageView = new ImageView(happyImage);

        submitButton.setGraphic(happyImageView);
        cancelButton.setGraphic(sadImageView);
    }

    @FXML
    void simpleClick(ActionEvent event) {
        log(((Button)event.getTarget()).getText() + " clicked");
    }
}
