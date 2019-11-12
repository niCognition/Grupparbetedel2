package com.example.dogedice;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AntalSpelareSida {

  private Scene antalSpelareScen;

  private RadioButton enSpelare;
  private RadioButton tvaSpelare;
  private RadioButton treSpelare;
  private RadioButton fyraSpelare;
  private RadioButton femSpelare;

  private Button quit;
  private Button vidare;

  public AntalSpelareSida(){
    enSpelare = new RadioButton();
    tvaSpelare = new RadioButton();
    treSpelare = new RadioButton();
    fyraSpelare = new RadioButton();
    femSpelare = new RadioButton();

    quit = new Button();
    vidare = new Button();
    setUpSida();
  }

  private void setUpSida(){

    FlowPane rootNode = new FlowPane();
    rootNode.setOrientation(Orientation.VERTICAL);
    rootNode.setAlignment(Pos.CENTER);

    antalSpelareScen = new Scene(rootNode, 400, 500);

    Label rubrik = new Label("Ange antal spelare");
    rubrik.setAlignment(Pos.CENTER);
    rubrik.setStyle("-fx-font-size: 30pt");
    rubrik.setPadding(new Insets(10, 10, 30, 10));

    ToggleGroup antalKnappar = new ToggleGroup();
    Insets knappPadding = new Insets(10, 10, 10, 50);

    enSpelare.setText("1 spelare");
    enSpelare.setToggleGroup(antalKnappar);
    enSpelare.setStyle("-fx-font-size: 20pt");
    enSpelare.setPadding(knappPadding);

    tvaSpelare.setText("2 spelare");
    tvaSpelare.setToggleGroup(antalKnappar);
    tvaSpelare.setStyle("-fx-font-size: 20pt");
    tvaSpelare.setPadding(knappPadding);

    treSpelare.setText("3 spelare");
    treSpelare.setToggleGroup(antalKnappar);
    treSpelare.setStyle("-fx-font-size: 20pt");
    treSpelare.setPadding(knappPadding);

    fyraSpelare.setText("4 spelare");
    fyraSpelare.setToggleGroup(antalKnappar);
    fyraSpelare.setStyle("-fx-font-size: 20pt");
    fyraSpelare.setPadding(knappPadding);

    femSpelare.setText("5 spelare");
    femSpelare.setToggleGroup(antalKnappar);
    femSpelare.setStyle("-fx-font-size: 20pt");
    femSpelare.setPadding(knappPadding);

    quit.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('http://pluspng.com/img-png/exit-button-png-open-2000.png'); -fx-background-size: 60px 60px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    quit.setAlignment(Pos.BOTTOM_LEFT);

    vidare.setStyle("-fx-padding: 15 23 15 23; -fx-background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8sTy5PQ5M6cgzvrXj8QAi7OxvIkeMzeefq4WdX89Yxh51Zj7QEQ&s'); -fx-background-size: 40px 40px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    vidare.setAlignment(Pos.BOTTOM_RIGHT);

    HBox quitVidare = new HBox();

    quitVidare.setSpacing(157);
    quitVidare.setAlignment(Pos.CENTER);
    quitVidare.setPadding(new Insets(30, 10, 10, 10 ));

    quitVidare.getChildren().addAll(quit, vidare);

    rootNode.getChildren().addAll(rubrik, enSpelare, tvaSpelare, treSpelare, fyraSpelare, femSpelare, quitVidare);
  }

  public void visaAntalSpelareSida(Stage myStage){

    myStage.setScene(antalSpelareScen);
    myStage.show();
  }

}
