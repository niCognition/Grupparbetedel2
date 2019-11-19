package com.example.dogedice;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class Avslut  {

  private Scene avslutScene;
  private Button avsluta;
  private Button tillbaka;
  private Stage myStage;
  private Label arDuSaker;

public Avslut(Stage myStage){

  this.myStage = myStage;
  avsluta = new Button("Avsluta Spel");
  tillbaka = new Button("Till Startsida");
  arDuSaker = new Label((char) 196 + "r du s" + (char) 228 + "ker" + (char) 63);

  avsluta.setOnAction(e-> closeProgram());

  tillbaka.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent actionEvent) {

      StartSida startSida = new StartSida(myStage);
      startSida.visaStartSida(myStage);
    }
  });

  setUpAvslut();
}

private void closeProgram(){
      myStage.close();
    }

private void setUpAvslut() {
  GridPane gridPane = new GridPane();
  gridPane.setVgap(10);
  gridPane.setAlignment(Pos.CENTER);

  arDuSaker.setStyle("-fx-padding: 0 0 50 0;-fx-font-size: 25pt; -fx-text-fill: #33691E");
  avsluta.setStyle("-fx-padding: 10; -fx-font-size: 20pt; -fx-border-color: #33481E; -fx-border-radius: 60; -fx-border-width: 2;");
  tillbaka.setStyle("-fx-padding: 10; -fx-font-size: 20pt; -fx-border-color: #33481E; -fx-border-radius: 60; -fx-border-width: 2;");

  avslutScene = new Scene(gridPane, 500, 700);
  avslutScene.getStylesheets().add("Layout.css");

  gridPane.add(arDuSaker, 0, 1);
  gridPane.add(avsluta, 0, 2);
  gridPane.add(tillbaka, 0, 3);

}

public void visaAvslut (Stage myStege){

  myStege.setScene(avslutScene);
  myStage.show();

  }
}