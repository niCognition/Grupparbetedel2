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

  private void okaKastomgang(){
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

  public void kasta (int[] positioner) {

      if (positioner.length == 0) {
        tarningar.kasta();
      } else {
        tarningar.sparaKast(positioner);
      }

  }

}

