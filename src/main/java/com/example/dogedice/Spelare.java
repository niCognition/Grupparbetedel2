package com.example.dogedice;

public class Spelare {

  private String namn;
  private int id;
  private ResultatLista resultat;
  private int slutSumma;

  public Spelare(String namn, int id){
    this.namn = namn;
    this.id = id;
    this.resultat = new ResultatLista();
    this.slutSumma = 0;
  }

  public String getNamn(){return namn;}

  public int getId(){return id;}

  public ResultatLista getResultatLista(){
    return resultat;
  }


  public int getOvreResultat(){
    return resultat.getOvreResultat();
  }


  public int getBonus(){
    return resultat.getBonus();
  }


  public int getTotalSumma(){
    return resultat.getTotalSumma();
  }

  public int getSlutSumma() { return slutSumma; }

  public void setSlutSumma(int poang) {
    slutSumma = poang;
  }


  public void sparaResultat(int position, int summa){

    if (resultat.getResultat(position) == null) {
      resultat.setResultat(position, summa);
    }
    // else visa felmeddelande
  }

}
