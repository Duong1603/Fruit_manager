package com.example.javafx;

import com.example.javafx.model.Fruit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML

    public void DELETE(ActionEvent actionEvent) {
    }

    public void ADD(ActionEvent actionEvent) {

        DBconect DBconect = new DBconect();
        int id = Fruit.getId();
        String name = Fruit.getName();
        int quality = Fruit.getQuality();
        int price = Fruit.getPrice();

    }

    public void UPDATE(ActionEvent actionEvent) {
    }
}