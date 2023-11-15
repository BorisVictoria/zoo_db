package com.example.zoo_management_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        loader.setControllerFactory(controllerClass -> new mainController());
        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("Zoo Management System 1");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }
    public static void main(String[] args) {
        launch();
    }
}