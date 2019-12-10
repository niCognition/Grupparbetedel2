package com.example.dogedice;

public class TarningStub extends Tarning{

  public TarningStub(){
    super();
    setVarde(6);
  }

  public TarningStub(int varde){
    super();
    setVarde(varde);
  }

  @Override
  public void kasta() {
    setVarde(5);
  }

}
