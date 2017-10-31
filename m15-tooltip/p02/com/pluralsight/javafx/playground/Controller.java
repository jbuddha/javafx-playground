package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML private Button nextButton;
    @FXML private Button previousButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image prev = new Image(getClass().getResourceAsStream("left.png"), 25, 25, true, true);
        Image next = new Image(getClass().getResourceAsStream("right.png"), 25, 25, true, true);

        Tooltip nextToolTip = new Tooltip("Go To Next Page");
        nextToolTip.setGraphic(new ImageView(next));
        nextButton.setTooltip(nextToolTip);

        Tooltip prevToolTip = new Tooltip("Go to previous page");
        prevToolTip.setGraphic(new ImageView(prev));
        previousButton.setTooltip(prevToolTip);
    }
}
