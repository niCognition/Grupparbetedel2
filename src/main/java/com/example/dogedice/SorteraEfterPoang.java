package com.example.dogedice;

import java.util.Comparator;

public class SorteraEfterPoang implements Comparator<Spelare> {

  public int compare(Spelare a, Spelare b) {
    return b.getTotalSumma()-a.getTotalSumma();
  }
}
