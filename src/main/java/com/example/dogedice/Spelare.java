package com.example.dogedice;

public class Spelare {

  private String namn;
  private int id;

  public Spelare(String namn, int id){
    this.namn = namn;
    this.id = id;
  }

  public String getNamn(){return namn;}

  public int getId(){return id;}

}
