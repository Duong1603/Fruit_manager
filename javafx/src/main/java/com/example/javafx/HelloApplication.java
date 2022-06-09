package com.example.javafx;

import com.example.javafx.model.Fruit;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1100, 500);
        stage.setTitle("MANAGE FRUIT STORE!");
        stage.setScene(scene);
        stage.show();



        DBconect dBconect = new DBconect();
        List<Fruit> fruits = dBconect.getFruits();
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("----");
            System.out.println("Id"+fruits.get(i).id);
            System.out.println("Name"+fruits.get(i).name);
            System.out.println("Name"+fruits.get(i).quality);
            System.out.println("Name"+fruits.get(i).price);
        };




    }

    public static void main(String[] args) {
        launch();
    }
}