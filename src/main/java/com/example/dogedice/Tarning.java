package com.example.dogedice;

import java.util.Random;

public class Tarning {


  private int antalSidor;
  private int varde;

  public Tarning() {
    this.antalSidor = 6;
    this.varde = 0;
  }

  public  void kasta() {
    Random r = new Random();
    varde = 1 + r.nextInt(6);

  }


  public int getvarde() {
    return varde;
  }
}
