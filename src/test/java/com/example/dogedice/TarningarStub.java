package com.example.dogedice;

import java.util.ArrayList;
import java.util.List;

public class TarningarStub extends Tarningar{

  private List<Tarning> tarningar;

 public TarningarStub(){
   tarningar = new ArrayList<Tarning>();
   for (int i = 0; i<5; i++){
     tarningar.add(new TarningStub());
   }
 }

 public TarningarStub(int value1, int value2, int value3, int value4, int value5){
   tarningar = new ArrayList<Tarning>();
   tarningar.add(new TarningStub(value1));
   tarningar.add(new TarningStub(value2));
   tarningar.add(new TarningStub(value3));
   tarningar.add(new TarningStub(value4));
   tarningar.add(new TarningStub(value5));
 }

  @Override
  public int[] getVarden() {
    int[] varden = new int[tarningar.size()];
    for (int i = 0; i < tarningar.size(); i++) {
      Tarning tarning = tarningar.get(i);

      varden[i] = tarning.getVarde();

    }
    return varden;
  }

  @Override
  public void kasta() {
   for (Tarning tarning : tarningar){
     tarning.setVarde(5);
   }
  }

  @Override
  public void sparaKast(int[] positioner) {
    int sparatVarde = 0;
    int[] nuvarandeVarden = getVarden();
    for (int i = 0; i < positioner.length; i++){
      int positionAttSpara = positioner[i];
      sparatVarde = nuvarandeVarden[positionAttSpara];
      tarningar.get(i).setVarde(sparatVarde);
    }
    for (int i = positioner.length; i < tarningar.size(); i++){
      tarningar.get(i).setVarde(5);
    }
  }
}
