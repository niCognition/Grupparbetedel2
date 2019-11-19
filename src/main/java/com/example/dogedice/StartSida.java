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

    FlowPane rootNode = new FlowPane(Orientation.VERTICAL);
    rootNode.setVgap(10);
    rootNode.setAlignment(Pos.CENTER);

    quitInfo.setSpacing(157);
    quitInfo.setAlignment(Pos.CENTER);

    startScen = new Scene(rootNode, 500, 700);
    startScen.getStylesheets().add("Layout.css");

    yatzy.setAlignment(Pos.CENTER);
    yatzy.getStyleClass().add("yatzybild");

    starta.setStyle("-fx-padding: 28; -fx-font-size: 30pt; -fx-border-color: #33481E; -fx-border-radius: 60; -fx-border-width: 2;");
    starta.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        AntalSpelareSida antalSpelareSida = new AntalSpelareSida(myStage);
        antalSpelareSida.visaAntalSpelareSida(myStage);
      }
    });

    highScore.setStyle("-fx-padding: 28; -fx-font-size: 30pt; -fx-border-color: #33481E; -fx-border-radius: 60; -fx-border-width: 2;");
    highScore.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        HighScoreSida highScoreSida = new HighScoreSida(myStage);
        highScoreSida.visaHighScore(myStage);
      }
    });

    quit.getStyleClass().add("avslutaknapp");
    quit.setAlignment(Pos.BOTTOM_LEFT);
    quit.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        Avslut avslut = new Avslut(myStage);
        avslut.visaAvslut(myStage);
      }
    });

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
    myStage.show();

  }
}
