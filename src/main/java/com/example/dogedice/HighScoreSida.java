package com.example.dogedice;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class HighScoreSida {

  private Stage myStage;
  private Scene highScoreScene;

  private Label plats1;
  private Label plats2;
  private Label plats3;

  private Label plats1Resultat;
  private Label plats2Resultat;
  private Label plats3Resultat;

  private Button tillbaka;

  private static int[] highScore = {0, 0, 0};
  private static String[] namnHighScore = {"", "", ""};

  public HighScoreSida(Stage myStage){

    this.myStage = myStage;
    plats1Resultat = new Label(String.valueOf(highScore[0]));
    plats2Resultat = new Label(String.valueOf(highScore[1]));
    plats3Resultat = new Label(String.valueOf(highScore[2]));
    plats1 = new Label("1.\t" + namnHighScore[0]);
    plats2 = new Label("2.\t" + namnHighScore[1]);
    plats3 = new Label("3.\t" + namnHighScore[2]);

    tillbaka = new Button();
    setUpSida();
  }

  private void setUpSida(){

    GridPane rootNode = new GridPane();
    rootNode.setAlignment(Pos.CENTER);
    highScoreScene = new Scene(rootNode, 500, 700);
    highScoreScene.getStylesheets().add("Layout.css");

    Label rubrik = new Label("HighScore");
    rubrik.setAlignment(Pos.CENTER);
    rubrik.setStyle("-fx-font-size: 30pt");
    rubrik.setPadding(new Insets(10, 10, 30, 10));

    rootNode.add(rubrik, 0, 0, 2, 1);

    Insets labelPadding = new Insets(10, 50, 10, 10);

    plats1.setStyle("-fx-font-size: 20pt");
    plats1.setPadding(labelPadding);
    rootNode.add(plats1, 0, 1);

    plats1Resultat.setStyle("-fx-font-size: 20pt");
    rootNode.add(plats1Resultat, 1, 1);


    plats2.setStyle("-fx-font-size: 20pt");
    plats2.setPadding(labelPadding);
    rootNode.add(plats2, 0, 2);

    plats2Resultat.setStyle("-fx-font-size: 20pt");
    rootNode.add(plats2Resultat, 1, 2);


    plats3.setStyle("-fx-font-size: 20pt");
    plats3.setPadding(labelPadding);
    rootNode.add(plats3, 0, 3);

    plats3Resultat.setStyle("-fx-font-size: 20pt");
    rootNode.add(plats3Resultat, 1, 3);

    tillbaka.getStyleClass().add("bak");
    tillbaka.setAlignment(Pos.BOTTOM_LEFT);
    tillbaka.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        StartSida startSida = new StartSida(myStage);
        startSida.visaStartSida(myStage);
      }
    });

    rootNode.add(tillbaka, 0, 4);

  }

  public void visaHighScore(Stage myStage) {

    myStage.setScene(highScoreScene);

    myStage.show();
  }

  public static void uppdateraHighScore(ArrayList<Spelare> spelare){

      for(int i = 0; i<spelare.size(); i++){
        if (spelare.get(i).getTotalSumma() > highScore[2]){
          if (spelare.get(i).getTotalSumma() > highScore[1]){
            if (spelare.get(i).getTotalSumma() > highScore[0]){
              highScore[2] = highScore[1];
              highScore[1] = highScore[0];
              highScore[0] = spelare.get(i).getTotalSumma();

              namnHighScore[2] = namnHighScore[1];
              namnHighScore[1] = namnHighScore[0];
              namnHighScore[0] = spelare.get(i).getNamn();

            }
            else{
              highScore[2] = highScore[1];
              highScore[1] = spelare.get(i).getTotalSumma();

              namnHighScore[2] = namnHighScore[1];
              namnHighScore[1] = spelare.get(i).getNamn();

            }
          }
          else{
            highScore[2] = spelare.get(i).getTotalSumma();
            namnHighScore[2] = spelare.get(i).getNamn();

          }
        }
      }
  }
}
