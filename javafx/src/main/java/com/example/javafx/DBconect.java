package com.example.javafx;

import com.example.javafx.model.Fruit;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;
//import java.util.List;

public class DBconect {
    private static final String URL = "jdbc:mysql://localhost/manage_fruit"; //jdbc:mysql is required
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    Connection connection;

    public DBconect() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connect successfully!!!");
        } catch (SQLException e) {
            System.out.println("Connect failed!!!");
            throw new RuntimeException(e);
        }
    }

    public List<Fruit> getFruits() {
        ArrayList<Fruit> fruits = new ArrayList<>();
        String sql = "select * from fruit";
        try {
            ResultSet results = connection.prepareStatement(sql).executeQuery();
            while (results.next()) {
                Fruit fruit = new Fruit(
                        results.getInt("id"),
                        results.getString("name"),
                        results.getInt("quality"),
                        results.getInt("price")
                );
                fruits.add(fruit);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return fruits;
    }


    public void add( Fruit fruit){
        String sql = "INSERT INTO manage_fruit (Name, Quality,Price) VALUE ('" + fruit.name+"','"+fruit.quality+"','"+fruit.price+"')";
        try {
            connection.prepareStatement(sql).executeUpdate();
            System.out.println("add successfully ('" + fruit.name+"','"+fruit.quality+"','"+fruit.price+"') ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(int id,Fruit fruit){
        String sql = "UPDATE students SET Name='"+fruit.name+"', Quality = "+fruit.quality+", Price = "+fruit.price+" WHERE id="+ id;
        System.out.println(sql);
        try {
            connection.prepareStatement(sql).executeUpdate();
            System.out.println("update successfully ('" + fruit.name+"','"+fruit.quality+"',,'"+fruit.price+"') ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void delete(int id){
        String sql = "DELETE FROM manage_fruit WHERE id="+ id;
        System.out.println(sql);
        try {
            connection.prepareStatement(sql).executeUpdate();
            System.out.println("delete successfully ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}


