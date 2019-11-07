package com.example.dogedice;

import java.util.ArrayList;

public class Spel {
  private ArrayList<Spelare> spelare;
  private int kastOmgang;
  private Tarningar tarningar;

  public Spel(ArrayList<Spelare> spelare) {
    this.spelare = spelare;
    this.kastOmgang = 1;
    this.tarningar = new Tarningar();
  }

  public void spela() {
    while (kastOmgang < 16) {

      for (int i = 0; i < spelare.size(); i++) {
        kasta();
        int radIProtokoll = getResultatTyp(); // ofärdig metod, ska få input från spelaren vad resultatet ska sparas som
        int summa = tarningar.kontrolleraResultat(radIProtokoll);
        spelare.get(i).sparaResultat(radIProtokoll, summa);
      }
      kastOmgang++;
    }
  }

    public void kasta(){

      tarningar.kasta();

      for (int i = 0; i < 2; i++) {
        int[] positioner = getInput(); // ofärdig metod, ska få input från spelaren om vilka tärningar som ska sparas

        if (positioner.length == 0) {
          tarningar.kasta();
        } else {
          tarningar.sparaKast(positioner);
        }
      }
    }

  //Ta emot input från spelaren på vilka tärningar som ska sparas. Positionerna
  // på tärningarna skickas vidare i en int-array
  public int[] getInput(){
    return new int[1]; // måste ha med return för att inte programmet ska krascha, ingen färdig metod
  }


  // Tar emot input om vilken sorts resultat spelaren vill spara
  // (Ettor, tvåor, kåk...)
  // Skickas som en int motsvarande raden i protokollet
  public int getResultatTyp(){
    return 1; // måste ha med return för att inte programmet ska krascha, ingen färdig metod
  }


}
