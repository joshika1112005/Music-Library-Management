package com.example.mlmw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class playlistcontroller
{
    @FXML
    void gotoplaylist(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("playlist.fxml"));
        Scene firstscene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("PlaylistPage");
        stage.setScene(firstscene);

        stage.show();}




}
