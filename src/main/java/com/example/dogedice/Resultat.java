package com.example.dogedice;

public class Resultat {


  public int visaPoang(Tarningar tarningar){

    return 0;
  }


  public int kontrolleraEttor(int[] kast){

    return antal(kast, 1);

  }

  public int kontrolleraTvaor(int[] kast){

    return 2 * antal(kast, 2);

  }

  public int kontrolleraTreor(int[] kast){

    return 3 * antal(kast, 3);
  }

  public int kontrolleraFyror(int[] kast){

    return 4 * antal(kast, 4);
  }

  public int kontrolleraFemmor(int[] kast){

    return 5 * antal(kast, 5);
  }

  public int kontrolleraSexor (int[] kast){

    return 6 * antal(kast, 6);
  }


  public int kontrolleraPar(int[]kast) {
    for (int i = 0; i < 4; i++) {
      if (kast[i] == kast[i + 1]) {
        return 2 * kast[i];
      }
    }
    return 0;
  }

  public int kontrolleraTvaPar(int[] kast){
    for (int i = 0; i < 2; i++){
      if (kast[i] == kast[i + 1]){
        for (int j = i+2; j<4; j++){
          if (kast[j] == kast[j + 1]){
            return (2 * kast[i] + 2 * kast[j]);
          }
        }
      }
    }
    return 0;
  }

  public int kontrolleraTretal(int[] kast){
    for (int i = 0; i < 3; i++){
      if (kast[i] == kast [i+1]){
        if (kast[i+1] == kast[i+2]){
          return 3 * kast[i];
        }
      }
    }
    return 0;
  }

  public int kontrolleraFyrtal(int[] kast){
    for (int i = 0; i < 2; i++){
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

  public int kontrolleraKåk(int[] kast){
    if ((kontrolleraTretal(kast) != 0)) {
      if ((kontrolleraTretal(kast)/3) != (kontrolleraPar(kast)/2)){
        return kontrolleraTretal(kast) + kontrolleraPar(kast);
      }
      else {
        int[] omväntKast = new int[5];
        omväntKast[0] = kast[5];
        omväntKast[1] = kast[4];
        omväntKast[2] = kast[2];
        omväntKast[3] = kast[1];
        omväntKast[4] = kast[0];
        if ((kontrolleraTretal(kast)/3) != (kontrolleraPar(omväntKast)/2)){
          return kontrolleraTretal(kast) + kontrolleraPar(omväntKast);
        }
      }
    }
    return 0;
  }

  public int kontrolleraLitenStege(int[] kast){
    for (int i = 4; i > 2; i--){
      if ((kontrolleraPar(kast) == 0) && (kast[0] == 5)){
        return 15;
      }
    }
    return 0;
  }

  public int kontrolleraStorStege(int[] kast){
    for (int i = 4; i > 2; i--){
      if ((kontrolleraPar(kast) == 0) && (kast[5] == 2)){
        return 20;
      }
    }
    return 0;
  }

  public int kontrolleraChans(int[] kast){
    int resultat = 0;
    for (int i = 0; i < 5; i++){
      resultat += kast[i];
    }
    return resultat;
  }

  public int kontrolleraYatzy(int[] kast){
    if (kast[0] == kast[5]){
      return 50;
    }
    return 0;
  }

  public int antal( int[] kast, int eftersoktNummer){

    int resultat = 0;

    for (int i : kast){
      if (i == eftersoktNummer){
        resultat += 1;
      }
    }
    return resultat;
  }

}
