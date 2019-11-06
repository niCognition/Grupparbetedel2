package com.example.dogedice;

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
    rootNode.setVgap(20);

    //Center the controls in the scene.
    rootNode.setAlignment(Pos.CENTER);

    rootNode.setVgap(10);

    // Create a scene.
    Scene startSida = new Scene(rootNode, 400, 500);

    // Set the scene on the stage.
    myStage.setScene(startSida);

    // Lägger till en label med texten "Yatzy!" och sätter storleken på texten till 30pt
    Label yatzy = new Label("YATZY!");
    yatzy.setAlignment(Pos.CENTER);
    yatzy.setStyle("-fx-font-size: 70pt");

    // Lägger till en knapp för att starta spelet.
    Button starta = new Button("Starta Spel");
    starta.setStyle("-fx-border-color: #E6E6E6; -fx-padding: 50; -fx-font-size: 30pt");

    // Lägger till en knapp för att visa High Score.
    Button highScore = new Button("High Score");
    highScore.setStyle("-fx-border-color: #E6E6E6; -fx-padding: 50; -fx-font-size: 30pt");

    // Create a label, then add the label to the scene graph.
    //Label myLabel = new Label("JavaFX is a powerful GUI");
    //rootNode.getChildren().add(myLabel);

    rootNode.getChildren().addAll(yatzy, starta, highScore);

    // Show the stage and its scene.
    myStage.show();
  }
}

