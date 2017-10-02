package com.pluralsight.javafx.playground;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {


    private Map<String, List<String>> countryMap = new HashMap<>();

    List<String> continentsList = new ArrayList<>();

    @FXML
    private MenuButton continentMenuButton;

    @FXML
    private MenuButton countryMenuButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       continentsList.add("Asia");
       continentsList.add("Europe");
       continentsList.add("Africa");
       continentsList.add("North America");
       continentsList.add("South America");
       continentsList.add("Australia");

        countryMap.put("Asia", Arrays.asList("India", "Pakistan", "China"));
        countryMap.put("Africa", Arrays.asList("Egypt", "South Africa", "Kenya"));
        countryMap.put("Australia", Arrays.asList("Australia", "New zealand"));
        countryMap.put("Europe", Arrays.asList("France", "Germany", "Switzerland"));
        countryMap.put("North America", Arrays.asList("Canada", "USA", "Mexico"));
        countryMap.put("South America", Arrays.asList("Brazil", "Chile"));

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
        countryMenuButton.getItems().clear();
        countryMap.get(continent).forEach(item -> {
            countryMenuButton.getItems().add(new MenuItem(item));
        });
    }

}
