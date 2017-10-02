package com.pluralsight.javafx.playground;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;

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

    @FXML
    private MenuButton menu;

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

        ObservableList<MenuItem> items = menu.getItems();
        items.add(new MenuItem("Item A"));
        items.add(new MenuItem("Item B"));
        items.add(new SeparatorMenuItem());
        items.add(new MenuItem("Item C"));
        items.add(new CheckMenuItem("Checkbox item"));
        items.add(new SeparatorMenuItem());
        RadioMenuItem item1 = new RadioMenuItem("Radio 1");
        item1.setToggleGroup(new ToggleGroup());
        RadioMenuItem item2 = new RadioMenuItem("Radio 2");
        item2.setToggleGroup(item1.getToggleGroup());
        items.addAll(item1, item2);

    }

    @FXML
    private void onContinentChange(ActionEvent event) {
        String continent = ((MenuItem) event.getTarget()).getText();
        continentMenuButton.setText(continent);
        countryMenuButton.getItems().clear();
        countryMap.get(continent).forEach(item -> {
            MenuItem menuItem = new MenuItem(item);
            menuItem.setOnAction(this::onCountryChange);
            countryMenuButton.getItems().add(menuItem);
        });
    }

    private void onCountryChange(ActionEvent event) {
        String country = ((MenuItem) event.getTarget()).getText();
        countryMenuButton.setText(country);
    }

    @FXML
    public void onCountryClickedAgain(ActionEvent actionEvent) {
        log("Clicked " + countryMenuButton.getText());
    }
}
