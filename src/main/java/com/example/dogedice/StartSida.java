package com.example.dogedice;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class StartSida {



  private Scene startScen;
  private HBox quitInfo;
  private Label yatzy;
  private Button starta;
  private Button highScore;
  private Button quit;
  private Button info;
  private Stage myStage;

  public StartSida(Stage myStage){

    this.myStage = myStage;
    quitInfo = new HBox();
    yatzy = new Label();
    starta = new Button("Starta Spel");
    highScore = new Button("High Score");
    quit = new Button();
    info = new Button();
    setUpStartSida();
  }


  private void setUpStartSida(){

    // Use a FlowPane for the root node.
    FlowPane rootNode = new FlowPane(Orientation.VERTICAL);
    rootNode.setVgap(10);
    //Center the controls in the scene.
    rootNode.setAlignment(Pos.CENTER);

    //Sätter mellanrummet mellan Quit och Info knapp
    quitInfo.setSpacing(157);
    quitInfo.setAlignment(Pos.CENTER);

    // Create a scene.
    startScen = new Scene(rootNode, 400, 500);
    startScen.getStylesheets().add("Layout.css");



    // Position och Stil för yatzy
    yatzy.setAlignment(Pos.CENTER);
    yatzy.setStyle("-fx-padding: 50 125 50 125; -fx-background-image: url('https://steamcdn-a.akamaihd.net/steam/apps/749010/header.jpg?t=1511273662'); -fx-background-size: 200px 100px; -fx-background-repeat: no-repeat; -fx-background-position: center; -fx-background-color: #FFD600");

    // Stil för Starta spel knapp
    starta.setStyle("-fx-padding: 28; -fx-font-size: 30pt");
    starta.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        AntalSpelareSida antalSpelareSida = new AntalSpelareSida(myStage);
        antalSpelareSida.visaAntalSpelareSida(myStage);
      }
    });

    // Stil på High Score knapp
    highScore.setStyle("-fx-padding: 28; -fx-font-size: 30pt");
    highScore.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent actionEvent) {
        HighScoreSida highScoreSida = new HighScoreSida(myStage);
        highScoreSida.visaHighScore(myStage);
      }
    });

    //Stil och position på Quit knapp
    //quit.setStyle("-fx-padding: 15 23 15 23; -fx-image:('C:\\Users\\ronsal\\IdeaProjects\\Grupparbetedel2\\Grupparbetedel2\\pic\\Avsluta.jpg'); -fx-background-size: 60px 60px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    quit.getStyleClass().add("avslutaknapp");
    quit.setAlignment(Pos.BOTTOM_LEFT);
    quit.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        Avslut avslut = new Avslut(myStage);
        avslut.visaAvslut(myStage);
      }
    });


    //Stil och position för info knapp
    info.getStyleClass().add("infoknapp");
    info.setAlignment(Pos.BOTTOM_RIGHT);
    info.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        InfoSida infoSida = new InfoSida(myStage);
        infoSida.visaInfoSida(myStage);
      }
    });

    quitInfo.getChildren().addAll(quit, info);

    rootNode.getChildren().addAll(yatzy, starta, highScore, quitInfo);

  }

  public void visaStartSida(Stage myStage) {

    myStage.setScene(startScen);

    // Show the stage and its scene.
    myStage.show();

  }
}
