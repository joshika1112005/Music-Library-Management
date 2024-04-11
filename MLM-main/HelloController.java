package com.example.mlmw;

import com.example.mlmw.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.sql.*;


public class HelloController {
    @FXML
    private TextField Username;

    @FXML
    private PasswordField password;
    @FXML
    private TextField addsong;
    @FXML
    private TextField removesong;



    @FXML
    void switchToDashboard(ActionEvent event) throws IOException, SQLException {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("dashboard.fxml"));
        Scene firstscene = new Scene(loader.load());

        String user_name = Username.getText();
        String Password = password.getText();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/musiclibrarymanagement", "root","root@123");
        String sql = "insert into User values (?,?)";
        PreparedStatement statement1 = connection.prepareStatement(sql);
        statement1.setString(1,user_name);
        statement1.setString(2,Password);
        statement1.execute();


        Stage stage = new Stage();
        stage.setTitle("Dashboard");
        stage.setScene(firstscene);
        stage.show();
    }
    public void gotosong(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("songs.fxml"));
        Scene firstscene = new Scene(loader.load());

        Stage stage = new Stage();
        stage.setTitle("Songpage");

        stage.setScene(firstscene);
        stage.show();
    }
    public void gotoartist(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Artist.fxml"));
        Scene firstscene = new Scene(loader.load());

        Stage stage = new Stage();
        stage.setTitle("Artistpage");
        stage.setScene(firstscene);
        stage.show();
    }
    public void gotogenre(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("genre.fxml"));
        Scene firstscene = new Scene(loader.load());

        Stage stage = new Stage();
        stage.setTitle("GenrePage");
        stage.setScene(firstscene);
        stage.show();}
    public void gotoplaylist(ActionEvent event) throws IOException, SQLException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("playlist.fxml"));
        Scene firstscene = new Scene(loader.load());

        /*String add_song = addsong.getText();
        String remove_song= removesong.getText();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/musiclibrarymanagement", "root","root@123");
        String sql = "insert into Playlist values (?,?)";
        PreparedStatement statement1 = connection.prepareStatement(sql);
        statement1.setString(1,add_song);
        statement1.setString(2,remove_song);
        statement1.execute();*/


        Stage stage = new Stage();
        stage.setTitle("PlaylistPage");
        stage.setScene(firstscene);
        stage.show();}



}
