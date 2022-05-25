package com.example.demo;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    public static Label cartData;

    int TotalCost = 0;
    int count = 0;
    String TC = "0.00";
    String C = "0";
    @FXML
    protected void Lays() {
        TotalCost = TotalCost + 20;
        count = count +1;
        System.out.println("bought 1 lays"+" total cost: "+ TotalCost);
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");
        C = new String(String.valueOf(count));
        cartData.setText(C.toString());
    }

    @FXML
    protected void NoLays() {
        TotalCost = TotalCost - 20;
        count = count -1;
        System.out.println("1 lays returned"+" total cost: "+ TotalCost);
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");;
        C = new String(String.valueOf(count));
        cartData.setText(C.toString());
    }

    @FXML
    protected void Coffee() {
        TotalCost = TotalCost + 40;
        count = count +1;
        System.out.println("bought 1 coffee"+" total cost: "+ TotalCost);
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");;
        C = new String(String.valueOf(count));
        System.out.println(C);
        cartData.setText(C.toString());

    }

    @FXML
    protected void NoCoffee() {
        TotalCost = TotalCost - 40;
        count = count -1;
        System.out.println("1 coffee returned"+" total cost: "+ TotalCost);
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");;
        C = new String(String.valueOf(count));
        cartData.setText(C.toString());
    }


    @FXML
    protected void wafers() {
        TotalCost = TotalCost + 50;
        count = count +1;
        System.out.println("bought 1 wefer"+" total cost: "+ TotalCost);
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");;
        C = new String(String.valueOf(count));
        cartData.setText(C.toString());
    }

    @FXML
    protected void Nowafers() {
        TotalCost = TotalCost - 50;
        count = count -1;
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");
        C = new String(String.valueOf(count));
        System.out.println("1 wafer returned"+" total cost: "+ TotalCost+C);
        cartData.setText(C.toString());

    }


    @FXML
    protected void pay() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PAGE 3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        Stage stage = new Stage();
        Label lblData = (Label) scene.lookup("#totalAmount");
        if (lblData!=null) lblData.setText(TC);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void HUNGRY() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Page 2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = new Stage();
        cartData = (Label) scene.lookup("#cartCount");
        if (cartData!=null) cartData.setText(C);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



}