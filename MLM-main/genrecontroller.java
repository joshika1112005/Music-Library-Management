package com.example.mlmw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class genrecontroller
{

    @FXML
    void gotogenre(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("genre.fxml"));
        Scene firstscene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("GenrePage");
        stage.setScene(firstscene);

        stage.show();
    }

}
