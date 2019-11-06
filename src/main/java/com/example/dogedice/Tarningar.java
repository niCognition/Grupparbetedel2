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


  public int[] getSorterad() {
    int[] vardenAttSortera = getVarden();
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

    public void kasta() {
      for (Tarning tarning : tarningar) {
        tarning.kasta();
      }

    }


  }
