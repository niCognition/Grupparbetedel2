package com.example.dogedice;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Namnge {

  private Stage myStage;
  private Scene namngeScene;
  private Label rubrik;
  private Text spel1;
  private Text spel2;
  private Text spel3;
  private Text spel4;
  private Text spel5;
  private TextField spelare1;
  private TextField spelare2;
  private TextField spelare3;
  private TextField spelare4;
  private TextField spelare5;
  private Label meddelande;
  private Button vidare;
  private Button quit;
  private int antalSpelare;

  public Namnge(Stage myStage, int antalSpelare) {
    this.myStage = myStage;
    this.antalSpelare = antalSpelare;

    rubrik = new Label("Namnge Spelare");
    meddelande = new Label();
    quit = new Button();
    vidare = new Button();
    setUpNamnge();
  }

    private void setUpNamnge(){
     GridPane gridPane = new GridPane();
      gridPane.setAlignment(Pos.CENTER);

      namngeScene = new Scene(gridPane, 500, 700);

      namngeScene.getStylesheets().add("Layout.css");
      rubrik.setAlignment(Pos.CENTER);
      rubrik.setStyle("-fx-font-size: 30pt");
      rubrik.setPadding(new Insets(10, 10, 30, 10));

      gridPane.add(rubrik, 0, 0, 3 ,1);

      spel1 = new Text("Spelare 1 ");
      spelare1 = new TextField();
      gridPane.add(spel1, 0,1);
      gridPane.add(spelare1, 1,1);


      if (antalSpelare > 1){
        spel2 = new Text("Spelare 2 ");
        spelare2 = new TextField();
        gridPane.add(spel2, 0,2);
        gridPane.add(spelare2, 1,2);
      }

      if (antalSpelare > 2){
        spel3 = new Text("Spelare 3 ");
        spelare3 = new TextField();
        gridPane.add(spel3, 0,3);
        gridPane.add(spelare3, 1,3);
      }

      if (antalSpelare > 3){
        spel4 = new Text("Spelare 4 ");
        spelare4 = new TextField();
        gridPane.add(spel4, 0,4);
        gridPane.add(spelare4, 1,4);
      }

      if (antalSpelare == 5){
        spel5 = new Text("Spelare 5 ");
        spelare5 = new TextField();
        gridPane.add(spel5, 0,5);
        gridPane.add(spelare5, 1,5);
      }

      gridPane.add(meddelande, 1, 6);
      meddelande.setStyle("-fx-text-fill: red; -fx-font-size: 13pt;");
      meddelande.setPadding(new Insets(30, 0, 0, 0));
      meddelande.setAlignment(Pos.CENTER);

      quit.getStyleClass().add("avslutaknapp");
      quit.setAlignment(Pos.BOTTOM_LEFT);
      quit.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
          Avslut avslut = new Avslut(myStage);
          avslut.visaAvslut(myStage);
        }
      });

      vidare.getStyleClass().add("vidare");
      vidare.setAlignment(Pos.BOTTOM_RIGHT);
      vidare.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

          meddelande.setText("");

          ArrayList<Spelare> deltagare = new ArrayList<Spelare>();

          String namn1 = spelare1.getText();
          if (namn1.equals("")){
            meddelande.setText("Alla spelare ska ha ett namn");
          }
          deltagare.add(new Spelare(namn1, 1));

          if (antalSpelare > 1){
            String namn2 = spelare2.getText();
            if (namn2.equals("")){
              meddelande.setText("Alla spelare ska ha ett namn");
            }
            deltagare.add(new Spelare(namn2, 2));
          }
          if (antalSpelare > 2){
            String namn3 = spelare3.getText();
            if (namn3.equals("")){
              meddelande.setText("Alla spelare ska ha ett namn");
            }
            deltagare.add(new Spelare(namn3, 3));
          }
          if (antalSpelare > 3){
            String namn4 = spelare4.getText();
            if (namn4.equals("")){
              meddelande.setText("Alla spelare ska ha ett namn");
            }
            deltagare.add(new Spelare(namn4, 4));
          }
          if (antalSpelare > 4){
            String namn5 = spelare5.getText();
            if (namn5.equals("")){
              meddelande.setText("Alla spelare ska ha ett namn");
            }
            deltagare.add(new Spelare(namn5, 5));
          }

          if (meddelande.getText().equals("")){
            Spel yatzyOmgang = new Spel(deltagare);
            Protokoll protokoll = new Protokoll(myStage, yatzyOmgang);
            protokoll.visaProtokoll(myStage);
          }
        }
      });

      HBox quitVidare = new HBox();

      quitVidare.setSpacing(157);
      quitVidare.setAlignment(Pos.CENTER);
      quitVidare.setPadding(new Insets(30, 10, 10, 10));

      gridPane.add(quitVidare, 0,7, 2, 1);

      quitVidare.getChildren().addAll(quit, vidare);

    }

    public void visaNamnge (Stage myStage){

      myStage.setScene(namngeScene);
      myStage.show();

    }
  }