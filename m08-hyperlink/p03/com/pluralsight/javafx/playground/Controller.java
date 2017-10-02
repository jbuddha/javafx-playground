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

    @FXML
    private Hyperlink firstLink;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image = new Image(getClass().getResourceAsStream("happy.png"), 50, 50, true, true);
        ImageView imageView = new ImageView(image);
        imagedLink.setGraphic(imageView);
    }

    @FXML
    void onCheckStatus(ActionEvent event) {
        if (firstLink.isVisited()) {
            log("First link is already visited");
        } else {
            log ("First link is not visited");
        }
    }

    @FXML
    void onResetStatus(ActionEvent event) {
        if (firstLink.isVisited()) {
            firstLink.setVisited(false);
            log("Link status is reset");
        } else {
            log("No need to reset");
        }
    }

    @FXML
    void onClick(ActionEvent event) {
        Hyperlink h = (Hyperlink)event.getTarget();
        log("Clicked: " + h.getText());
    }
}
