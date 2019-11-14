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
    //Skapar och visar startsidan
    StartSida startSida = new StartSida(myStage);
    startSida.visaStartSida(myStage);

    //Skapar och visar Infosidan
    //InfoSida infoSida = new InfoSida();
    //infoSida.visaInfoSida(myStage);

    //Namnge namnge = new Namnge(myStage);
    //namnge.visaNamnge(myStage);

    //Avslut avslut = new Avslut(myStage);
    //avslut.visaAvslut(myStage);


    //Visar Highscoresidan
    //HighScoreSida highScoreSida = new HighScoreSida(myStage);
    //highScoreSida.visaHighScore(myStage);

    //Visar AntalSpelareSidan
    //AntalSpelareSida antalSpelareSida = new AntalSpelareSida(myStage);
    //antalSpelareSida.visaAntalSpelareSida(myStage);

    //Visar protokollet
   // Protokoll protokoll = new Protokoll(myStage);
    //protokoll.visaProtokoll(myStage);
  }
}

