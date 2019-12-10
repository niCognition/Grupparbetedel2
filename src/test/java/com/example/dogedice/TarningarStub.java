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
}
