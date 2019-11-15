package com.example.dogedice;
import java.util.ArrayList;

public class Spel {
  private ArrayList<Spelare> spelare;
  private int kastOmgang;
  private int kast;
  private int aktivSpelare;
  private Tarningar tarningar;

  public Spel(ArrayList<Spelare> spelare) {
    this.spelare = spelare;
    this.kastOmgang = 1;
    this.kast = 1;
    this.tarningar = new Tarningar();
    this.aktivSpelare = 1;
  }

  public int getKastOmgang(){
    return kastOmgang;
  }

  public int getKast(){
    return kast;
  }

  public int getAktivSpelare() {
    return aktivSpelare;
  }

  public void okaKastomgang(){
    kastOmgang++;
  }

  public void okaKast(){
    kast++;
    if (kast > 3){
      kast = 1;
      nastaSpelare();
    }
  }

  public void nastaSpelare(){
    aktivSpelare++;
    kast = 1;
    if (aktivSpelare > spelare.size()){
      aktivSpelare = 1;
      okaKastomgang();
    }
  }
  public ArrayList<Spelare> getSpelare(){
    return spelare;
  }

  public Tarningar getTarningar(){
    return tarningar;
  }

  /*public void spela () {
    while (kastOmgang < 16) {

      for (int i = 0; i < spelare.size(); i++) {
        kasta();
        int radIProtokoll = getResultatTyp(); // ofärdig metod, ska få input från spelaren vad resultatet ska sparas som
        int summa = tarningar.kontrolleraResultat(radIProtokoll);
        spelare.get(i).sparaResultat(radIProtokoll, summa);
      }
      kastOmgang++;

    }
  }*/

  public void kasta (int[] positioner) {


      if (positioner.length == 0) {
        tarningar.kasta();
      } else {
        tarningar.sparaKast(positioner);
      }

  }


  //Ta emot input från spelaren på vilka tärningar som ska sparas. Positionerna
  // på tärningarna skickas vidare i en int-array
  public int[] getInput () {
    int[] sparadeTarningar = {1, 2};
    return getInput(); // måste ha med return för att inte programmet ska krascha, ingen färdig metod
  }


  // Tar emot input om vilken sorts resultat spelaren vill spara
  // (Ettor, tvåor, kåk...)
  // Skickas som en int motsvarande raden i protokollet
  public int getResultatTyp () {
    return 1; // måste ha med return för att inte programmet ska krascha, ingen färdig metod
  }


}

