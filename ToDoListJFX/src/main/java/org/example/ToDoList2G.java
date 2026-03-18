package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class ToDoList2G extends Application
{

    @Override
    public void start(Stage stage) throws Exception {
       URL fxml = this.getClass().getResource("/HalamanUtamaView.fxml");

        Parent root = FXMLLoader.load(fxml);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Todo List 2G");
        stage.show();
    }
}
