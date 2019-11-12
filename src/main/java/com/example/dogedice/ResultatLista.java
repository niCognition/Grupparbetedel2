package com.example.dogedice;

public class ResultatLista {

  private Resultat[] resultat;

  public ResultatLista(){
    resultat = new Resultat[15];
  }

  public Resultat getResultat(int position){
    return resultat[position];
  }

  public void setResultat(int position, int varde){
    resultat[position] = new Resultat(varde);
  }

  public int getOvreResultat(){

    int summa = 0;

    for (int i = 0; i < 6; i++){
      if(resultat[i] != null) {
        summa += resultat[i].getVarde();
      }
    }
    return summa;
  }

  public int getBonus(){
    if (getOvreResultat() > 62){
      return 50;
    }
    return 0;
  }

  public int getTotalSumma(){
    int summa = 0;
    for (Resultat delresultat: resultat){
      if (delresultat != null) {
        summa += delresultat.getVarde();
      }
    }
    summa += getBonus();
    return summa;
  }
}

