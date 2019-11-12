package com.example.dogedice;

//Niclas

import javafx.application.*;
import javafx.stage.*;


public class Main extends Application {
  public static void main(String[] args) {
    // Start the JavaFX application by calling launch().
    launch(args);
  }

  // Override the start() method.
  public void start(Stage myStage) {

    FakeMain startSida = new FakeMain();
    startSida.visaStartSida(myStage);

  }
}

