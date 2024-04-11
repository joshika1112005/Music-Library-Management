package com.example.mlmw;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene firstscene = new Scene(loader.load());

        stage.setTitle("Login Application");
        stage.setScene(firstscene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
