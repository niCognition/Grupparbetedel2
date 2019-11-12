package com.example.dogedice;

import java.util.ArrayList;

public class Spel {
  private ArrayList<Spelare> spelare;
  private int kastOmgang;

  public Spel(ArrayList<Spelare> spelare) {
    this.spelare = spelare;
    this.kastOmgang = 1;

  }

  public int spela() {
    while (kastOmgang < 16) {
      for (int i = 0; i < 5; i++) {
        System.out.println(i);
      }
      return kastOmgang;

    }
    return 0;
  }
}
