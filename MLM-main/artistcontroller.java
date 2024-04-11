package com.example.mlmw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class artistcontroller {

    @FXML
    void gotoartist(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Artist.fxml"));
        Scene firstscene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Artistpage");
        stage.setScene(firstscene);

        stage.show();
    }

}
