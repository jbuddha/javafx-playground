package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML
    private Hyperlink imagedLink;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image = new Image(getClass().getResourceAsStream("happy.png"), 50, 50, true, true);
        ImageView imageView = new ImageView(image);
        imagedLink.setGraphic(imageView);
    }

    @FXML
    void onClick(ActionEvent event) {
        Hyperlink h = (Hyperlink)event.getTarget();
        log("Clicked: " + h.getText());
    }

}
