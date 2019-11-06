package com.example.dogedice;

import java.util.ArrayList;


public class Tarningar<tarningar> {

  private ArrayList<Tarning> tarningar;

  public Tarningar() {
    tarningar = new ArrayList<Tarning>();
  }

  public int[] getVarden() {
    int[] varden = new int[5];
    for (int i = 0; i < 5; i++) {
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


  }
