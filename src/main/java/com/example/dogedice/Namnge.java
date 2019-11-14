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
  private Button vidare;
  private Button quit;

  public Namnge(Stage myStage) {
    this.myStage = myStage;
    spel1 = new Text("Spelare 1 ");
    spel2 = new Text("Spelare 2 ");
    spel3 = new Text("Spelare 3 ");
    spel4 = new Text("Spelare 4 ");
    spel5 = new Text("Spelare 5 ");
    spelare1 = new TextField();
    spelare2 = new TextField();
    spelare3 = new TextField();
    spelare4 = new TextField();
    spelare5 = new TextField();
    rubrik = new Label("Namnge Spelare");
    quit = new Button();
    vidare = new Button();
    setUpNamnge();
  }

    private void setUpNamnge(){
     GridPane gridPane = new GridPane();
      gridPane.setAlignment(Pos.CENTER);

      namngeScene = new Scene(gridPane, 400, 500);

      rubrik.setAlignment(Pos.CENTER);
      rubrik.setStyle("-fx-font-size: 30pt");
     rubrik.setPadding(new Insets(10, 10, 30, 10));


      gridPane.add(rubrik, 0, 0, 3 ,1);

      gridPane.add(spel1, 0,1);
      gridPane.add(spel2, 0,2);
      gridPane.add(spel3, 0,3);
      gridPane.add(spel4, 0,4);
      gridPane.add(spel5, 0,5);


      gridPane.add(spelare1, 1,1);
      gridPane.add(spelare2, 1,2);
      gridPane.add(spelare3, 1,3);
      gridPane.add(spelare4, 1,4);
      gridPane.add(spelare5, 1,5);



      quit.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('http://pluspng.com/img-png/exit-button-png-open-2000.png'); -fx-background-size: 60px 60px; -fx-background-repeat: no-repeat; -fx-background-position: center");
      quit.setAlignment(Pos.BOTTOM_LEFT);
      quit.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
          Avslut avslut = new Avslut(myStage);
          avslut.visaAvslut(myStage);
        }
      });

      vidare.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8sTy5PQ5M6cgzvrXj8QAi7OxvIkeMzeefq4WdX89Yxh51Zj7QEQ&s'); -fx-background-size: 40px 40px; -fx-background-repeat: no-repeat; -fx-background-position: center");
      vidare.setAlignment(Pos.BOTTOM_RIGHT);
      vidare.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
          String namn1 = spelare1.getText();
          String namn2 = spelare2.getText();
          String namn3 = spelare3.getText();
          String namn4 = spelare4.getText();
          String namn5 = spelare5.getText();

          ArrayList<Spelare> deltagare = new ArrayList<Spelare>();
          deltagare.add(new Spelare(namn1, 1));
          if (!namn2.equals("")){
            deltagare.add(new Spelare(namn2, 2));
            if(!namn3.equals("")){
              deltagare.add(new Spelare(namn3, 3));
              if(!namn4.equals("")){
                deltagare.add(new Spelare(namn4, 4));
                if (!namn5.equals("")){
                  deltagare.add(new Spelare(namn5, 5));
                }
              }
            }
          }
          Spel yatzyOmgang = new Spel(deltagare);
          Protokoll protokoll = new Protokoll(myStage, yatzyOmgang);
          protokoll.visaProtokoll(myStage);
        }
      });

      HBox quitVidare = new HBox();

      quitVidare.setSpacing(157);
      quitVidare.setAlignment(Pos.CENTER);
      quitVidare.setPadding(new Insets(30, 10, 10, 10));

      gridPane.add(quitVidare, 0,6, 2, 1);

      quitVidare.getChildren().addAll(quit, vidare);


    }

    public void visaNamnge (Stage myStage, int antal){

      if (antal < 5) {
        spelare5.setVisible(false);
        spel5.setVisible(false);
      }
      if (antal < 4) {
        spelare4.setVisible(false);
        spel4.setVisible(false);
      }
      if (antal < 3) {
        spelare3.setVisible(false);
        spel3.setVisible(false);
      }
      if (antal < 2) {
        spelare2.setVisible(false);
        spel2.setVisible(false);
      }

      myStage.setScene(namngeScene);
      myStage.show();

    }
  }