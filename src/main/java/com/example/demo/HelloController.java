package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    int TotalCost = 0;
    String TC = "";
    @FXML
    protected void Lays() {
        TotalCost = TotalCost + 20;
        System.out.println("bought 1 lays"+" total cost: "+ TotalCost);
        TC = new String(String.valueOf(TotalCost));
    }
    @FXML
    protected void Coffee() {
        TotalCost = TotalCost + 40;
        System.out.println("bought 1 coffee"+" total cost: "+ TotalCost);
        TC = new String(String.valueOf(TotalCost));
    }

    @FXML
    protected void wafers() {
        TotalCost = TotalCost + 50;
        System.out.println("bought 1 wefer"+" total cost: "+ TotalCost);
        TC = new String(String.valueOf(TotalCost));
    }


    @FXML
    protected void pay() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PAGE 3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();}

    @FXML
    protected void HUNGRY() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page 2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



}