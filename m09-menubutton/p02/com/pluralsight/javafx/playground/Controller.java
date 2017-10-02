package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {


    private Map<String, List<String>> countryMap = new HashMap<>();

    List<String> continentsList = new ArrayList<>();

    @FXML
    private MenuButton continentMenuButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       continentsList.add("Asia");
       continentsList.add("Europe");
       continentsList.add("Africa");
       continentsList.add("North America");
       continentsList.add("South America");
       continentsList.add("Australia");

       continentsList.forEach(item -> {
           MenuItem menuItem = new MenuItem(item);
           menuItem.setOnAction(this::onContinentChange);
           continentMenuButton.getItems().add(menuItem);
       });
    }

    @FXML
    private void onContinentChange(ActionEvent event) {
        String continent = ((MenuItem) event.getTarget()).getText();
        continentMenuButton.setText(continent);
    }

}
