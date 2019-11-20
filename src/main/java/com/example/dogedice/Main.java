package com.example.dogedice;


import javafx.application.*;
import javafx.stage.*;


public class Main extends Application {
  public static void main(String[] args) {
    launch(args);
  }


  public void start(Stage myStage) {

    StartSida startSida = new StartSida(myStage);
    startSida.visaStartSida(myStage);
  }
}

