package com.example.dogedice;

import javafx.geometry.Insets;
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

    
    FlowPane rootNode = new FlowPane(Orientation.VERTICAL);
    rootNode.setVgap(20);
    rootNode.setAlignment(Pos.CENTER);

    resultatSida = new Scene(rootNode, 450, 600);

    rubrik1.setAlignment(Pos.CENTER);
    rubrik1.setStyle("-fx-font-size: 25pt");

    rootNode.getChildren().add(rubrik1);

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

    slutPoang1 = new Label("1. \t" + namn1 + "\t \t" + slutSummor[0]);
    slutPoang1.setAlignment(Pos.CENTER);
    slutPoang1.setStyle("-fx-font-size: 15pt");

    rootNode.getChildren().addAll(vinnare, rubrik2, slutPoang1);

    if (antalSpelare > 1) {
      slutPoang2 = new Label("2. \t" + namn2 + "\t \t" + slutSummor[1]);
      slutPoang2.setAlignment(Pos.CENTER);
      slutPoang2.setStyle("-fx-font-size: 15pt");

      rootNode.getChildren().add(slutPoang2);
    }

    if (antalSpelare > 2) {
      slutPoang3 = new Label("3. \t" + namn3 + "\t \t" + slutSummor[2]);
      slutPoang3.setAlignment(Pos.CENTER);
      slutPoang3.setStyle("-fx-font-size: 15pt");

      rootNode.getChildren().add(slutPoang3);
    }

    if (antalSpelare > 3) {
      slutPoang4 = new Label("4. \t" + namn4 + "\t \t" + slutSummor[3]);
      slutPoang4.setAlignment(Pos.CENTER);
      slutPoang4.setStyle("-fx-font-size: 15pt");

      rootNode.getChildren().add(slutPoang4);
    }

    if (antalSpelare > 4) {
      slutPoang5 = new Label("5. \t" + namn5 + "\t \t" + slutSummor[4]);
      slutPoang5.setAlignment(Pos.CENTER);
      slutPoang5.setStyle("-fx-font-size: 15pt");
      rootNode.getChildren().add(slutPoang5);
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

    rootNode.getChildren().addAll(nyttHighScoreAvsluta);
  }

  public void visaResultatSida(Stage myStage) {

    myStage.setScene(resultatSida);
    myStage.show();

  }
}
