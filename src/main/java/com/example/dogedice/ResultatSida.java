package com.example.dogedice;

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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;
/*
SPELET SLUT - rubrik1
<namn> har vunnit! - vinnare

Slutpoäng: - rubrik2
1. <poäng> - slutpoang1
2. <poäng> - slutpoang2
3. <poäng> - slutpoang3
4. <poäng> - slutpoang4
5. <poäng> - slutpoang5

Vill du: - rubrik3
Starta ett nytt spel <visa AntalSpelareSida> - startaOm
Se High Score lista <visa HighScoreSida> - highScoreLista
Avsluta Spel <visa Avslut> - avsluta
 */

public class ResultatSida {

  private Scene resultatSida;
  private Label rubrik1;
  private Label rubrik2;
  private Label vinnare;
  private Label slutPoang1;
  private Label slutPoang2;
  private Label slutPoang3;
  private Label slutPoang4;
  private Label slutPoang5;
  private Label slutNamn1;
  private Label slutNamn2;
  private Label slutNamn3;
  private Label slutNamn4;
  private Label slutNamn5;
  private Button startaOm;
  private Button highScoreLista;
  private Button avsluta;
  private Stage myStage;
  private ArrayList<Spelare> spelare;
  private HBox nyttHighScoreAvsluta;

  public ResultatSida(Stage myStage, ArrayList<Spelare> spelare) {

    this.myStage = myStage;
    this.spelare = spelare;
    rubrik1 = new Label("SPEL SLUT");
    rubrik2 = new Label("Slutpo"+(char) 228+"ng");
    startaOm = new Button("Starta nytt Spel");
    highScoreLista = new Button("High Score");
    avsluta = new Button("Avsluta spel");
    setUpResultatSida();

  }

  private void setUpResultatSida(){

    int[] slutSummor = new int[spelare.size()];
    for (int i = 0; i < spelare.size(); i++) {
      slutSummor[i] = spelare.get(i).getTotalSumma();
    }
    for (int m = slutSummor.length - 1; m > 0; m--) {
      for (int n = 0; n < m; n++) {
        if (slutSummor[n] < slutSummor[n+1]) {
          int temp = slutSummor[n];
          slutSummor[n] = slutSummor[n+1];
          slutSummor[n+1] = temp;
        }
      }
    }


    GridPane rootNode = new GridPane();
    rootNode.setAlignment(Pos.CENTER);

    resultatSida = new Scene(rootNode, 450, 600);

    rubrik1.setAlignment(Pos.CENTER);
    rubrik1.setStyle("-fx-font-size: 25pt");
    //rubrik1.setPadding(new Insets(10, 10, 10, 10));

    rootNode.add(rubrik1, 1, 0, 2, 1);

    String namn1 = "";
    String namn2 = "";
    String namn3 = "";
    String namn4 = "";
    String namn5 = "";
    int antalSpelare = spelare.size();

    for (Spelare namn : spelare) {
      if (namn.getTotalSumma() == slutSummor[0]) {
        namn1 = namn.getNamn();
      }
      if ((antalSpelare > 1) && (namn.getTotalSumma() == slutSummor[1])) {
        namn2 = namn.getNamn();
      }
      if ((antalSpelare > 2) && (namn.getTotalSumma() == slutSummor[2])) {
        namn3 = namn.getNamn();
      }
      if ((antalSpelare > 3) && (namn.getTotalSumma() == slutSummor[3])) {
        namn4 = namn.getNamn();
      }
      if ((antalSpelare > 4) && (namn.getTotalSumma() == slutSummor[4])) {
        namn5 = namn.getNamn();
      }
    }

    vinnare = new Label(namn1 + " har vunnit");
    vinnare.setAlignment(Pos.CENTER);
    vinnare.setStyle("-fx-font-size: 25pt");

    rubrik2.setAlignment(Pos.CENTER);
    rubrik2.setStyle("-fx-font-size: 18pt");

    slutNamn1 = new Label("1. " + namn1);
    slutPoang1 = new Label("" + slutSummor[0]);
    slutPoang1.setAlignment(Pos.CENTER);
    slutNamn1.setStyle("-fx-font-size: 15pt");
    slutPoang1.setStyle("-fx-font-size: 15pt");

    rootNode.add(vinnare, 1, 1, 2, 1);
    rootNode.add(rubrik2, 0, 2, 2, 1);
    rootNode.add(slutNamn1, 0, 3, 1, 1);
    rootNode.add(slutPoang1, 2, 3, 1, 1);
    //rootNode.getChildren().addAll(vinnare, rubrik2, slutPoang1);

    if (antalSpelare > 1) {
      slutNamn2 = new Label("2. " + namn2);
      slutPoang2 = new Label("" + slutSummor[1]);
      slutPoang2.setAlignment(Pos.CENTER);
      slutNamn2.setStyle("-fx-font-size: 15pt");
      slutPoang2.setStyle("-fx-font-size: 15pt");

      rootNode.add(slutNamn2, 0, 4, 1, 1);
      rootNode.add(slutPoang2, 2, 4, 1, 1);
    }

    if (antalSpelare > 2) {
      slutNamn3 = new Label("3. " + namn3);
      slutPoang3 = new Label("" + slutSummor[2]);
      slutPoang3.setAlignment(Pos.CENTER);
      slutNamn3.setStyle("-fx-font-size: 15pt");
      slutPoang3.setStyle("-fx-font-size: 15pt");

      rootNode.add(slutNamn3, 0, 5, 1, 1);
      rootNode.add(slutPoang3, 2, 5, 1, 1);
    }

    if (antalSpelare > 3) {
      slutNamn4 = new Label("4. " + namn4);
      slutPoang4 = new Label("" + slutSummor[3]);
      slutPoang4.setAlignment(Pos.CENTER);
      slutNamn4.setStyle("-fx-font-size: 15pt");
      slutPoang4.setStyle("-fx-font-size: 15pt");

      rootNode.add(slutNamn4, 0, 6, 1, 1);
      rootNode.add(slutPoang4, 2, 6, 1, 1);
    }

    if (antalSpelare > 4) {
      slutNamn5 = new Label("5. " + namn5);
      slutPoang5 = new Label("" + slutSummor[4]);
      slutPoang5.setAlignment(Pos.CENTER);
      slutNamn5.setStyle("-fx-font-size: 15pt");
      slutPoang5.setStyle("-fx-font-size: 15pt");

      rootNode.add(slutNamn5, 0, 7, 1, 1);
      rootNode.add(slutPoang5, 2, 7, 1, 1);
    }

    startaOm.setAlignment(Pos.CENTER);
    startaOm.setStyle("-fx-font-size: 10pt");
    startaOm.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        AntalSpelareSida antalSpelareSida = new AntalSpelareSida(myStage);
        antalSpelareSida.visaAntalSpelareSida(myStage);
      }
    });

    highScoreLista.setAlignment(Pos.CENTER);
    highScoreLista.setStyle("-fx-font-size: 10pt");
    highScoreLista.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        HighScoreSida highScoreSida = new HighScoreSida(myStage);
        highScoreSida.visaHighScore(myStage);
      }
    });

    avsluta = new Button();
    avsluta.setStyle("-fx-padding: 5 13 5 13; -fx-background-image: url('http://pluspng.com/img-png/exit-button-png-open-2000.png'); -fx-background-size: 35px 35px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    avsluta.setAlignment(Pos.BOTTOM_LEFT);
    avsluta.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        Avslut avslut = new Avslut(myStage);
        avslut.visaAvslut(myStage);
      }
    });

    HBox nyttHighScoreAvsluta = new HBox();
    nyttHighScoreAvsluta.setSpacing(60);
    nyttHighScoreAvsluta.setPadding(new Insets(50, 0, 0, 0));
    nyttHighScoreAvsluta.setAlignment(Pos.CENTER);
    nyttHighScoreAvsluta.getChildren().addAll(avsluta, highScoreLista, startaOm);

    rootNode.add(nyttHighScoreAvsluta, 0, 8, 2, 3);
  }

  public void visaResultatSida(Stage myStage) {

    myStage.setScene(resultatSida);
    myStage.show();

  }
}
