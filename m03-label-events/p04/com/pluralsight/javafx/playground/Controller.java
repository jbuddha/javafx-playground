package com.pluralsight.javafx.playground;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    @FXML
    private Label hoveredLabel;

    @FXML
    private Label dragSource;

    @FXML
    private Label dragTarget;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initHoverImages();

        dragSource.setOnDragDetected(event -> {
            Dragboard db = dragSource.startDragAndDrop(TransferMode.MOVE);

            ClipboardContent content = new ClipboardContent();
            content.putString(dragSource.getText());

            db.setContent(content);
            event.consume();
        });

        dragTarget.setOnDragDropped(event -> {
            Dragboard db = event.getDragboard();

            if (db.hasString()) {
                dragTarget.setText(db.getString());
                event.setDropCompleted(true);
            }
            event.consume();
        });

        dragTarget.setOnDragOver(event -> {
            Dragboard db = event.getDragboard();

            if (event.getGestureSource() != dragTarget && event.getDragboard().hasString())
                event.acceptTransferModes(TransferMode.MOVE);

            event.consume();
        });



    }

    private void initHoverImages() {
        Image happyImage = new Image(getClass().getResourceAsStream("happy.png"), 25, 25, true, true);
        Image sadImage = new Image(getClass().getResourceAsStream("sad.png"), 25, 25, true, true);

        ImageView happyView = new ImageView(happyImage);
        ImageView sadView = new ImageView(sadImage);

        hoveredLabel.setGraphic(sadView);

        hoveredLabel.setOnMouseEntered(event -> {
            hoveredLabel.setGraphic(happyView);
        });

        hoveredLabel.setOnMouseExited(event -> {
            hoveredLabel.setGraphic(sadView);
        });

        hoveredLabel.setOnMouseClicked(event -> {
            log("Clicked");
        });
    }

}
