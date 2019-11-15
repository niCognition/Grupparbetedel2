package com.example.dogedice;

//Niclas

import javafx.application.*;
import javafx.stage.*;

import java.util.ArrayList;


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

    //Visar resultatsida
    //ArrayList<Spelare> testOmgang = new ArrayList<>();
    //Spelare spelare1 = new Spelare("Kalle", 1);
    //Spelare spelare2 = new Spelare("Ida", 2);
    //Spelare spelare3 = new Spelare("qwer", 3);
    //Spelare spelare4 = new Spelare("ASDASD", 4);
    //Spelare spelare5 = new Spelare("AAAD", 5);
    //testOmgang.add(spelare1);
    //testOmgang.add(spelare2);
    //testOmgang.add(spelare3);
    //testOmgang.add(spelare4);
    //testOmgang.add(spelare5);
    //spelare1.sparaResultat(1, 200);
    //spelare2.sparaResultat(1, 300);
    //spelare3.sparaResultat(1, 150);
    //spelare4.sparaResultat(1, 240);
    //spelare5.sparaResultat(1, 240);

    //ResultatSida resultatSida = new ResultatSida(myStage, testOmgang);
    //resultatSida.visaResultatSida(myStage);
  }
}

