package com.example.dogedice;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FakeMain {

  public void visaStartSida(Stage myStage) {

    // Give the stage a title.
    myStage.setTitle("Yatzy!");

    // Use a FlowPane for the root node.
    FlowPane rootNode = new FlowPane(Orientation.VERTICAL);
    rootNode.setVgap(10);
    //Center the controls in the scene.
    rootNode.setAlignment(Pos.CENTER);

    //Skapar HBox
    HBox quitInfo = new HBox();
    //Sätter mellanrummet mellan Quit och Info knapp
    quitInfo.setSpacing(157);
    quitInfo.setAlignment(Pos.CENTER);

    // Create a scene.
    Scene startSida = new Scene(rootNode, 400, 500);

    // Set the scene on the stage.
    myStage.setScene(startSida);

    // Lägger till en label med texten "Yatzy!" och sätter storleken på texten till 30pt
    Label yatzy = new Label();
    yatzy.setAlignment(Pos.CENTER);
    yatzy.setStyle("-fx-padding: 50 125 50 125; -fx-background-image: url('https://steamcdn-a.akamaihd.net/steam/apps/749010/header.jpg?t=1511273662'); -fx-background-size: 200px 100px; -fx-background-repeat: no-repeat; -fx-background-position: center");

    // Lägger till en knapp för att starta spelet.
    Button starta = new Button("Starta Spel");
    starta.setStyle("-fx-border-color: #E6E6E6; -fx-padding: 30; -fx-font-size: 30pt");

    // Lägger till en knapp för att visa High Score.
    Button highScore = new Button("High Score");
    highScore.setStyle("-fx-border-color: #E6E6E6; -fx-padding: 28; -fx-font-size: 30pt");

    //Kod för att lägga till bild som knapp för quit
    Button quit = new Button();
    quit.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('http://pluspng.com/img-png/exit-button-png-open-2000.png'); -fx-background-size: 60px 60px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    quit.setAlignment(Pos.BOTTOM_LEFT);

    //Kod för att lägga till bild som knapp för info
    Button info = new Button();
    info.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('https://www.iconsdb.com/icons/preview/tropical-blue/info-xxl.png'); -fx-background-size: 65px 65px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    info.setAlignment(Pos.BOTTOM_RIGHT);

    quitInfo.getChildren().addAll(quit, info);

    rootNode.getChildren().addAll(yatzy, starta, highScore, quitInfo);

    // Show the stage and its scene.
    myStage.show();
  }
}
