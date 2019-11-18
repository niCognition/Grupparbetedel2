package com.example.dogedice;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;




  public class Avslut  {

    private Scene avslutScene;
    private Button avsluta;
    private Button cancel;
    private Button tillbaka;
    private Stage myStage;


    public Avslut(Stage myStage){

      this.myStage = myStage;
      avsluta = new Button("Avsluta Spelet");
      tillbaka = new Button("Tillbaka Till Startsida");
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
      gridPane.setAlignment(Pos.CENTER);

      avsluta.setStyle("-fx-border-color: #E6E6E6; -fx-padding: 10; -fx-font-size: 20pt");
      tillbaka.setStyle("-fx-border-color: #E6E6E6; -fx-padding: 10; -fx-font-size: 20pt");


      avslutScene = new Scene(gridPane, 400, 500);

      gridPane.add(avsluta, 0, 1);
      gridPane.add(tillbaka, 0, 3);


    }


    public void visaAvslut (Stage myStege){

      myStege.setScene(avslutScene);
      myStage.show();

    }
  }