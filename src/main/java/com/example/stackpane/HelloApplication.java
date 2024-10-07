package com.example.stackpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("Botón 1");
        Button btn2 = new Button("Botón 2");

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(btn1, btn2);
        StackPane.setAlignment(btn1, Pos.TOP_LEFT);
        StackPane.setMargin(btn1, new Insets(10));
        StackPane.setAlignment(btn2, Pos.BOTTOM_RIGHT);
        StackPane.setMargin(btn2, new Insets(10));

        Scene scene = new Scene(stackPane, 300, 200);
        primaryStage.setTitle("Ejemplo StackPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


