package com.example.dogedice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpelTest {

  List<Spelare> spelare = List.of(new Spelare("ibbe", 123),
      new Spelare("ronald", 122),
      new Spelare("moe", 1234),
      new Spelare("Tarik", 2333),
      new Spelare("mille", 14785)
  );


  @Test
  void okaKast() {
    //Arrange

    Spel spel = new Spel(spelare);
    int val = spel.getKast();
    //act
    spel.okaKast();

    //assert
    assertEquals(val +1, spel.getKast());
  }

  @Test
  void okaKastTillNastaSpelare() {
    //Arrange

    Spel spel = new Spel(spelare);
    int val = spel.getKast();
    //act
    spel.okaKast();
    spel.okaKast();
    spel.okaKast();


    //assert
    assertEquals(val  , spel.getKast());
  }

  @Test
  void nastaSpelare() {
    //Arrange
    Spel spel = new Spel(spelare);

    //Act
    spel.nastaSpelare();
    spel.nastaSpelare();
    spel.nastaSpelare();
    spel.nastaSpelare();
    spel.nastaSpelare();



    //Assert
    assertEquals(1,spel.getAktivSpelare());

  }


}