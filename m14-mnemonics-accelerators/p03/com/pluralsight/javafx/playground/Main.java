package com.pluralsight.javafx.playground;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ui.fxml"));
        primaryStage.setTitle("JavaFX Playground");
        primaryStage.setScene(new Scene(root, 600, 400));
        KeyCombination hideKey = new KeyCodeCombination(KeyCode.C, KeyCombination.CONTROL_DOWN);
        Runnable task = () -> primaryStage.getScene().getWindow().centerOnScreen();
        primaryStage.getScene().getAccelerators().put(hideKey, task);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
