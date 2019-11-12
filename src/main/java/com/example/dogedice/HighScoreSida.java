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
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class HighScoreSida {

  private Stage myStage;
  private Scene highScoreScene;

  private Label plats1;
  private Label plats2;
  private Label plats3;

  private Button tillbaka;

  private int[] highScore;

  public HighScoreSida(Stage myStage){

    this.myStage = myStage;
    plats1 = new Label("Plats 1");
    plats2 = new Label("Plats 2");
    plats3 = new Label("Plats 3");

    tillbaka = new Button();
    highScore = new int[3];
    setUpSida();
  }

  private void setUpSida(){

    FlowPane rootNode = new FlowPane();
    rootNode.setOrientation(Orientation.VERTICAL);
    rootNode.setAlignment(Pos.CENTER);
    highScoreScene = new Scene(rootNode, 400, 500);

    Label rubrik = new Label("HighScore");
    rubrik.setAlignment(Pos.CENTER);
    rubrik.setStyle("-fx-font-size: 30pt");
    rubrik.setPadding(new Insets(10, 10, 30, 10));

    Insets labelPadding = new Insets(10, 10, 10, 50);

    plats1.setStyle("-fx-font-size: 20pt");
    plats1.setPadding(labelPadding);


    plats2.setStyle("-fx-font-size: 20pt");
    plats2.setPadding(labelPadding);


    plats3.setStyle("-fx-font-size: 20pt");
    plats3.setPadding(labelPadding);

    tillbaka.setStyle("-fx-padding: 15 28 15 28; -fx-background-image: url('https://www.netclipart.com/pp/m/0-8877_green-arrow-clipart-green-arrows.png'); -fx-background-size: 50px 40px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    tillbaka.setAlignment(Pos.BOTTOM_LEFT);
    tillbaka.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        StartSida startSida = new StartSida(myStage);
        startSida.visaStartSida(myStage);
      }
    });

    rootNode.getChildren().addAll(rubrik, plats1, plats2, plats3, tillbaka);

  }

  public void visaHighScore(Stage myStage) {

    myStage.setScene(highScoreScene);

    myStage.show();
  }

  public void uppdateraHighScore(ArrayList<Spelare> spelare){

      for(int i = 0; i<spelare.size(); i++){
        if (spelare.get(i).getTotalSumma() > highScore[2]){
          if (spelare.get(i).getTotalSumma() > highScore[1]){
            if (spelare.get(i).getTotalSumma() > highScore[0]){
              highScore[2] = highScore[1];
              highScore[1] = highScore[0];
              highScore[0] = spelare.get(i).getTotalSumma();

              plats3.setText(plats2.getText());
              plats2.setText(plats1.getText());
              plats1.setText(spelare.get(i).getNamn() + ", " + String.valueOf(highScore[0]));
            }
            else{
              highScore[2] = highScore[1];
              highScore[1] = spelare.get(i).getTotalSumma();

              plats3.setText(plats2.getText());
              plats2.setText(spelare.get(i).getNamn() + ", " + String.valueOf(highScore[1]));

            }
          }
          else{
            highScore[2] = spelare.get(i).getTotalSumma();
            plats3.setText(spelare.get(i).getNamn() + ", " + String.valueOf(highScore[2]));
          }
        }
      }
  }
}
