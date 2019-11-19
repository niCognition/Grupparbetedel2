package com.example.dogedice;

import java.util.ArrayList;


public class Tarningar {

  private ArrayList<Tarning> tarningar;

  public Tarningar() {

    tarningar = new ArrayList<Tarning>();
    for (int i = 0; i < 5; i++) {
      tarningar.add(new Tarning());
    }
  }

  public int[] getVarden() {
    int[] varden = new int[tarningar.size()];
    for (int i = 0; i < tarningar.size(); i++) {
      Tarning tarning = tarningar.get(i);

      varden[i] = tarning.getVarde();

    }
    return varden;
  }

    public void kasta() {
      for (Tarning tarning : tarningar) {
        tarning.kasta();
      }
    }

    public void sparaKast(int[] positioner){

      int sparatVarde = 0;
      int[] nuvarandeVarden = getVarden();
      for (int i = 0; i < positioner.length; i++){
        int positionAttSpara = positioner[i];
        sparatVarde = nuvarandeVarden[positionAttSpara];
        tarningar.get(i).setVarde(sparatVarde);
      }
      for (int i = positioner.length; i < tarningar.size(); i++){
        tarningar.get(i).kasta();
      }
    }

  public int kontrolleraResultat(int radIProtokoll){
    switch(radIProtokoll){
      case 0:
        return kontrolleraEttor(getVarden());

      case 1:
        return kontrolleraTvaor(getVarden());

      case 2:
        return kontrolleraTreor(getVarden());

      case 3:
        return kontrolleraFyror(getVarden());

      case 4:
        return kontrolleraFemmor(getVarden());

      case 5:
        return kontrolleraSexor(getVarden());

      case 6:
        return kontrolleraPar(getVarden());

      case 7:
        return kontrolleraTvaPar(getVarden());

      case 8:
        return kontrolleraTretal(getVarden());

      case 9:
        return kontrolleraFyrtal(getVarden());

      case 10:
        return kontrolleraKak(getVarden());

      case 11:
        return kontrolleraLitenStege(getVarden());

      case 12:
        return kontrolleraStorStege(getVarden());

      case 13:
        return kontrolleraChans(getVarden());

      case 14:
        return kontrolleraYatzy(getVarden());

      default:
        return 0;
    }
  }

  private int kontrolleraEttor(int[] kast){

    return antal(kast, 1);

  }

  private int kontrolleraTvaor(int[] kast){

    return 2 * antal(kast, 2);

  }

  private int kontrolleraTreor(int[] kast){

    return 3 * antal(kast, 3);
  }

  private int kontrolleraFyror(int[] kast){

    return 4 * antal(kast, 4);
  }

  private int kontrolleraFemmor(int[] kast){

    return 5 * antal(kast, 5);
  }

  private int kontrolleraSexor (int[] kast){

    return 6 * antal(kast, 6);
  }


  private int kontrolleraPar(int[]kast) {

    kast = sortera(kast);

    for (int i = 0; i < (tarningar.size()-1); i++) {
      if (kast[i] == kast[i + 1]) {
        return 2 * kast[i];
      }
    }
    return 0;
  }

  private int kontrolleraTvaPar(int[] kast){

    kast = sortera(kast);

    for (int i = 0; i < (tarningar.size()-3); i++){
      if (kast[i] == kast[i + 1]){
        for (int j = i+2; j<(tarningar.size()-1); j++){
          if (kast[j] == kast[j + 1]){
            return (2 * kast[i] + 2 * kast[j]);
          }
        }
      }
    }
    return 0;
  }

  private int kontrolleraTretal(int[] kast){

    kast = sortera(kast);

    for (int i = 0; i < (tarningar.size()-2); i++){
      if (kast[i] == kast [i+1]){
        if (kast[i+1] == kast[i+2]){
          return 3 * kast[i];
        }
      }
    }
    return 0;
  }

  private int kontrolleraFyrtal(int[] kast){

    kast = sortera(kast);

    for (int i = 0; i < (tarningar.size()-3); i++){
      if (kast[i] == kast [i+1]){
        if (kast[i+1] == kast[i+2]){
          if (kast[i+2] == kast[i+3]){
            return 4 * kast[i];
          }
        }
      }
    }
    return 0;
  }

  private int kontrolleraKak(int[] kast){

    kast = sortera(kast);

    if (((kast[0] == kast[1]) && (kast[1] == kast[2])) && (kast[3] == kast[4])
        && (kast[2] != kast[3])){
      return (3 * kast[0] + 2 * kast[4]);
    } else if (((kast[2] == kast[3]) && (kast[3] == kast[4])) && (kast[0] == kast[1])
        && (kast[1] != kast[2])) {
      return (2 * kast[0] + 3 * kast[4]);
    }
    return 0;
  }

  private int kontrolleraLitenStege(int[] kast){

    kast = sortera(kast);

      if ((kontrolleraPar(kast) == 0) && (kast[0] == 5)){
        return 15;
      }
    return 0;
  }

  private int kontrolleraStorStege(int[] kast){

    kast = sortera(kast);

      if ((kontrolleraPar(kast) == 0) && (kast[4] == 2)){
        return 20;
      }
    return 0;
  }

  private int kontrolleraChans(int[] kast){

    int resultat = 0;
    for (int i = 0; i < tarningar.size(); i++){
      resultat += kast[i];
    }
    return resultat;
  }

  private int kontrolleraYatzy(int[] kast){

    kast = sortera(kast);

    if (kast[0] == kast[4]){
      return 50;
    }
    return 0;
  }

  private int antal( int[] kast, int eftersoktNummer){

    int resultat = 0;

    for (int i : kast){
      if (i == eftersoktNummer){
        resultat += 1;
      }
    }
    return resultat;
  }

  private int[] sortera(int[] vardenAttSortera) {
    int len = vardenAttSortera.length;

    for (int i = 0; i < len; i++) {
      for (int j = len - 1; j > i; j--) {
        if (vardenAttSortera[j] > vardenAttSortera[j - 1]) {
          int tmp = vardenAttSortera[j];
          vardenAttSortera[j] = vardenAttSortera[j - 1];
          vardenAttSortera[j - 1] = tmp;
        }
      }
    }
    return vardenAttSortera;
  }
}


