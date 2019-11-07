package com.example.dogedice;

//Niclas

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.text.Text;

public class Main extends Application {
  public static void main(String[] args) {
    // Start the JavaFX application by calling launch().
    launch(args);
  }

  // Override the start() method.
  public void start(Stage myStage) {

    // Give the stage a title.
    myStage.setTitle("Yatzy!");

    // Use a FlowPane for the root node.
    FlowPane rootNode = new FlowPane(Orientation.VERTICAL);
    rootNode.setVgap(10);

    HBox quitInfo = new HBox();
    //Sätter mellanrummet mellan Quit och Info knapp
    quitInfo.setSpacing(157);
    quitInfo.setAlignment(Pos.CENTER);

    //Center the controls in the scene.
    rootNode.setAlignment(Pos.CENTER);

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

    Button quit = new Button();
    quit.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('http://pluspng.com/img-png/exit-button-png-open-2000.png'); -fx-background-size: 60px 60px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    quit.setAlignment(Pos.BOTTOM_LEFT);

    Button info = new Button();
    info.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('https://www.iconsdb.com/icons/preview/tropical-blue/info-xxl.png'); -fx-background-size: 65px 65px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    info.setAlignment(Pos.BOTTOM_RIGHT);


    // Create a label, then add the label to the scene graph.
    //Label myLabel = new Label("JavaFX is a powerful GUI");
    //rootNode.getChildren().add(myLabel);

    quitInfo.getChildren().addAll(quit, info);

    rootNode.getChildren().addAll(yatzy, starta, highScore, quitInfo);

    // Show the stage and its scene.
    myStage.show();
  }
}

