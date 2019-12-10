package com.example.dogedice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ResultatListaTest {

  private final ResultatLista resultatLista = new ResultatLista();



  @BeforeEach
  void setUp () {

  }

  @Test
  void getOvreResultat() {
    //Arrenge
    //ResultatLista resultatLista = new ResultatLista();

    //Act
    resultatLista.setResultat(0,2);
    
    //Assert
    assertEquals(2,resultatLista.getOvreResultat());
  }

  @Test
  void getBonusOver62 () {
    resultatLista.setResultat(0,63);

    resultatLista.getBonus();

    assertEquals(50,resultatLista.getBonus());
    System.out.println("Bonus");

  }

  @Test
  void getBonusUnder63 () {
    resultatLista.setResultat(0,62);

    resultatLista.getBonus();

    assertEquals(0, resultatLista.getBonus());
  }


  @Test // poäng för övre lista 63 och bonusen på 50 får vi in då. 63+50
  void getTotalSummaMedBonus () {
    resultatLista.setResultat(0,63);

    assertEquals(113,resultatLista.getTotalSumma());

  }
  @Test // poäng för övre lista 62 och bonusen på 50 får vi inte in. 62+0
  void getTotalSummaUtanBonus () {
    resultatLista.setResultat(0,62);

    assertEquals(62,resultatLista.getTotalSumma());

  }

  @Test // max poäng för hela listan 328p och så får vi med bonusen på 50p
  void getTotalSummaEfter15RundorMedMaxPoang () {
    resultatLista.setResultat(0,5);
    resultatLista.setResultat(1,10);
    resultatLista.setResultat(2,15);
    resultatLista.setResultat(3,20);
    resultatLista.setResultat(4,25);
    resultatLista.setResultat(5,30);
    resultatLista.setResultat(6,12);
    resultatLista.setResultat(7,24);
    resultatLista.setResultat(8,18);
    resultatLista.setResultat(9,24);
    resultatLista.setResultat(10,30);
    resultatLista.setResultat(11,15);
    resultatLista.setResultat(12,20);
    resultatLista.setResultat(13,30);
    resultatLista.setResultat(14,50);



    assertEquals(378,resultatLista.getTotalSumma());

  }

  @Test
  void ResultatEnskildPosition(){

    resultatLista.setResultat(0,5);

    assertEquals(5,resultatLista.getResultat(0).getVarde());
  }

}