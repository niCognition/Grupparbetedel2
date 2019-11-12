package com.example.dogedice;

// Karins testklass
//Sidan med antal spelare och highscoresidan

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.text.Text;

public class FXTest extends Application {
  public static void main(String[] args) {
    // Start the JavaFX application by calling launch().
    launch(args);
  }

  // Override the start() method.
  public void start(Stage myStage) {

    // Give the stage a title.
    myStage.setTitle("Yatzy!");

    // Use a FlowPane for the root node.
    FlowPane rootNode = new FlowPane();


    rootNode.setOrientation(Orientation.VERTICAL);
    rootNode.setAlignment(Pos.CENTER);
   // rootNode.setPadding(new Insets(10, 10, 10, 10));
    //Center the controls in the scene.


    // Create a scene.
    Scene antalSpelare = new Scene(rootNode, 400, 500);

    // Set the scene on the stage.
    myStage.setScene(antalSpelare);

    // Lägger till en label med texten "Yatzy!" och sätter storleken på texten till 30pt
    Label rubrik = new Label("Ange antal spelare");
    rubrik.setAlignment(Pos.CENTER);
    rubrik.setStyle("-fx-font-size: 30pt");
    rubrik.setPadding(new Insets(10, 10, 30, 10));

    ToggleGroup antalKnappar = new ToggleGroup();
    Insets knappPadding = new Insets(10, 10, 10, 50);

    // Lägger till en knapp för att starta spelet.
    RadioButton enSpelare = new RadioButton();
    enSpelare.setText("1 spelare");
    enSpelare.setToggleGroup(antalKnappar);
    enSpelare.setStyle("-fx-font-size: 20pt");
    enSpelare.setPadding(knappPadding);

    RadioButton tvaSpelare = new RadioButton();
    tvaSpelare.setText("2 spelare");
    tvaSpelare.setToggleGroup(antalKnappar);
    tvaSpelare.setStyle("-fx-font-size: 20pt");
    tvaSpelare.setPadding(knappPadding);

    RadioButton treSpelare = new RadioButton();
    treSpelare.setText("3 spelare");
    treSpelare.setToggleGroup(antalKnappar);
    treSpelare.setStyle("-fx-font-size: 20pt");
    treSpelare.setPadding(knappPadding);

    RadioButton fyraSpelare = new RadioButton();
    fyraSpelare.setText("4 spelare");
    fyraSpelare.setToggleGroup(antalKnappar);
    fyraSpelare.setStyle("-fx-font-size: 20pt");
    fyraSpelare.setPadding(knappPadding);

    RadioButton femSpelare = new RadioButton();
    femSpelare.setText("5 spelare");
    femSpelare.setToggleGroup(antalKnappar);
    femSpelare.setStyle("-fx-font-size: 20pt");
    femSpelare.setPadding(knappPadding);

    Button quit = new Button();
    quit.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('http://pluspng.com/img-png/exit-button-png-open-2000.png'); -fx-background-size: 60px 60px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    quit.setAlignment(Pos.BOTTOM_LEFT);

    Button vidare = new Button();
    vidare.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8sTy5PQ5M6cgzvrXj8QAi7OxvIkeMzeefq4WdX89Yxh51Zj7QEQ&s'); -fx-background-size: 40px 40px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    vidare.setAlignment(Pos.BOTTOM_RIGHT);

    HBox quitVidare = new HBox();

    quitVidare.setSpacing(157);
    quitVidare.setAlignment(Pos.CENTER);
    quitVidare.setPadding(new Insets(30, 10, 10, 10 ));

    quitVidare.getChildren().addAll(quit, vidare);



    rootNode.getChildren().addAll(rubrik, enSpelare, tvaSpelare, treSpelare, fyraSpelare, femSpelare, quitVidare);

    // Lägger till en knapp för att visa High Score.
    Button highScore = new Button("High Score");
    highScore.setStyle("-fx-border-color: #E6E6E6; -fx-padding: 50; -fx-font-size: 30pt");

    // Create a label, then add the label to the scene graph.
    //Label myLabel = new Label("JavaFX is a powerful GUI");
    //rootNode.getChildren().add(myLabel);



    // Show the stage and its scene.
    //myStage.show();
    visaHighScore(myStage);
  }

  public void visaHighScore(Stage myStage) {

    FlowPane rootNode = new FlowPane();
    rootNode.setOrientation(Orientation.VERTICAL);
    rootNode.setAlignment(Pos.CENTER);
    //rootNode.setPadding(new Insets(10, 10, 10, 10));

    Scene highScoreScene = new Scene(rootNode, 400, 500);
    myStage.setScene(highScoreScene);

    Label rubrik = new Label("HighScore");
    rubrik.setAlignment(Pos.CENTER);
    rubrik.setStyle("-fx-font-size: 30pt");
    rubrik.setPadding(new Insets(10, 10, 30, 10));

    Insets labelPadding = new Insets(10, 10, 10, 50);

    Label plats1 = new Label("Plats 1");
    plats1.setStyle("-fx-font-size: 20pt");
    plats1.setPadding(labelPadding);

    Label plats2 = new Label("Plats 2");
    plats2.setStyle("-fx-font-size: 20pt");
    plats2.setPadding(labelPadding);

    Label plats3 = new Label("Plats 3");
    plats3.setStyle("-fx-font-size: 20pt");
    plats3.setPadding(labelPadding);

    Label plats4 = new Label("Plats 4");
    plats4.setStyle("-fx-font-size: 20pt");
    plats4.setPadding(labelPadding);

    Label plats5 = new Label("Plats 5");
    plats5.setStyle("-fx-font-size: 20pt");
    plats5.setPadding(labelPadding);



    Button quit = new Button();
    quit.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('http://pluspng.com/img-png/exit-button-png-open-2000.png'); -fx-background-size: 60px 60px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    quit.setAlignment(Pos.BOTTOM_LEFT);

    Button vidare = new Button();
    vidare.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8sTy5PQ5M6cgzvrXj8QAi7OxvIkeMzeefq4WdX89Yxh51Zj7QEQ&s'); -fx-background-size: 40px 40px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    vidare.setAlignment(Pos.BOTTOM_RIGHT);

    HBox quitVidare = new HBox();

    quitVidare.setSpacing(157);
    quitVidare.setAlignment(Pos.CENTER);
    quitVidare.setPadding(new Insets(30, 10, 10, 10 ));

    quitVidare.getChildren().addAll(quit, vidare);

    rootNode.getChildren().addAll(rubrik, plats1, plats2, plats3, plats4, plats5, quitVidare);
    myStage.show();
  }
}
