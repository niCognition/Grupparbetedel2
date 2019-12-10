package com.example.dogedice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TarningarTest {



  @Test
  void kastaChangeValueOfFiveDice(){
    Tarningar tarningar = new TarningarStub(6,6,6,6,6);

    tarningar.kasta();
    int[] expected = {5,5,5,5,5};
    int[] actual = tarningar.getVarden();


    assertArrayEquals(expected, actual);

  }
  @Test
  void kontrolleraResultatReturns3forThreeOnesOnRow0(){
    Tarningar tarningar = new TarningarStub(1, 1, 1, 6, 6);

    int result = tarningar.kontrolleraResultat(0);

    assertEquals(3, result);
  }

  @Test
  void kontrolleraResultatReturns6forThreeTwosOnRow1(){
    Tarningar tarningar = new TarningarStub(2, 2, 2, 6, 6);

    int result = tarningar.kontrolleraResultat(1);

    assertEquals(6, result);
  }

  @Test
  void kontrolleraResultatReturns9forThreeThreesOnRow2(){
    Tarningar tarningar = new TarningarStub(3, 3, 3, 6, 6);

    int result = tarningar.kontrolleraResultat(2);

    assertEquals(9, result);
  }

  @Test
  void kontrolleraResultatReturns12forThreeFoursOnRow3(){
    Tarningar tarningar = new TarningarStub(4, 4, 4, 6, 6);

    int result = tarningar.kontrolleraResultat(3);

    assertEquals(12, result);
  }

  @Test
  void kontrolleraResultatReturns15forThreeFivesOnRow4(){
    Tarningar tarningar = new TarningarStub(5, 5, 5, 6, 6);

    int result = tarningar.kontrolleraResultat(4);

    assertEquals(15, result);
  }

  @Test
  void kontrolleraResultatReturns18forThreeSixesOnRow5(){
    Tarningar tarningar = new TarningarStub(1, 1, 6, 6, 6);

    int result = tarningar.kontrolleraResultat(5);

    assertEquals(18, result);
  }

  @Test
  void kontrolleraResultatReturns12forPairOfSixesOnRow6(){
    Tarningar tarningar = new TarningarStub(1, 2, 3, 6, 6);

    int result = tarningar.kontrolleraResultat(6);

    assertEquals(12, result);
  }

  @Test
  void kontrolleraResultatReturns0ForASeriesOfNumbersWithoutAPairOnRow6(){
    Tarningar tarningar = new TarningarStub(1, 2, 3, 5, 6);

    int result = tarningar.kontrolleraResultat(6);

    assertEquals(0, result);
  }

  @Test
  void kontrolleraResultatReturns22forTwoPairOfSixesAndFivesOnRow7(){
    Tarningar tarningar = new TarningarStub(1, 5, 5, 6, 6);

    int result = tarningar.kontrolleraResultat(7);

    assertEquals(22, result);
  }

  @Test
  void kontrolleraResultatReturns0forASeriesOfNumbersWithoutTwoPairsOnRow7(){
    Tarningar tarningar = new TarningarStub(1, 4, 5, 6, 6);

    int result = tarningar.kontrolleraResultat(7);

    assertEquals(0, result);
  }

  @Test
  void kontrolleraResultatReturns18forThreeSixesOnRow8(){
    Tarningar tarningar = new TarningarStub(1, 5, 6, 6, 6);

    int result = tarningar.kontrolleraResultat(8);

    assertEquals(18, result);
  }

  @Test
  void kontrolleraResultatReturns0forASeriesOfNumbersWithoutThreeOfTheSameOnRow8(){
    Tarningar tarningar = new TarningarStub(1, 5, 5, 6, 6);

    int result = tarningar.kontrolleraResultat(8);

    assertEquals(0, result);
  }

  @Test
  void kontrolleraResultatReturns24forFourSixesOnRow9(){
    Tarningar tarningar = new TarningarStub(1, 6, 6, 6, 6);

    int result = tarningar.kontrolleraResultat(9);

    assertEquals(24, result);
  }

  @Test
  void kontrolleraResultatReturns0forASeriesOfNumbersWithoutFourOfTheSameOnRow9(){
    Tarningar tarningar = new TarningarStub(1, 5, 6, 6, 6);

    int result = tarningar.kontrolleraResultat(9);

    assertEquals(0, result);
  }

  @Test
  void kontrolleraResultatReturns28forFullHouseOfThreeSixesAndTwoFivesOnRow10(){
    Tarningar tarningar = new TarningarStub(5, 5, 6, 6, 6);

    int result = tarningar.kontrolleraResultat(10);

    assertEquals(28, result);
  }

  @Test
  void kontrolleraResultatReturns27forFullHouseOfTwoSixesAndThreeFivesOnRow10(){
    Tarningar tarningar = new TarningarStub(5, 5, 5, 6, 6);

    int result = tarningar.kontrolleraResultat(10);

    assertEquals(27, result);
  }

  @Test
  void kontrolleraResultatReturns0forASeriesOfNumbersThatIsNotAFullHouseOnRow10(){
    Tarningar tarningar = new TarningarStub(1, 5, 6, 6, 6);

    int result = tarningar.kontrolleraResultat(10);

    assertEquals(0, result);
  }

  @Test
  void kontrolleraResultatReturns15forSmallStraightOnRow11(){
    Tarningar tarningar = new TarningarStub(1, 2, 3, 4, 5);

    int result = tarningar.kontrolleraResultat(11);

    assertEquals(15, result);
  }

  @Test
  void kontrolleraResultatReturns0forASeriesOfNumbersThatIsNotASmallStraightOnRow11(){
    Tarningar tarningar = new TarningarStub(1, 1, 3, 4, 5);

    int result = tarningar.kontrolleraResultat(11);

    assertEquals(0, result);
  }

  @Test
  void kontrolleraResultatReturns20forLargeStraightOnRow12(){
    Tarningar tarningar = new TarningarStub(2, 3, 4, 5, 6);

    int result = tarningar.kontrolleraResultat(12);

    assertEquals(20, result);
  }

  @Test
  void kontrolleraResultatReturns0forASeriesOfNumbersThatIsNotALargeStraightOnRow12(){
    Tarningar tarningar = new TarningarStub(1, 2, 3, 4, 5);

    int result = tarningar.kontrolleraResultat(12);

    assertEquals(0, result);
  }

  @Test
  void kontrolleraResultatReturns15for22344OnRow13(){
    Tarningar tarningar = new TarningarStub(2, 2, 3, 4, 4);

    int result = tarningar.kontrolleraResultat(13);

    assertEquals(15, result);
  }

  @Test
  void kontrolleraResultatReturns50forASeriesOfNumbersThatIsNotFiveOfTheSameOnRow14(){
    Tarningar tarningar = new TarningarStub(5, 6, 6, 6, 6);

    int result = tarningar.kontrolleraResultat(14);

    assertEquals(0, result);
  }

  @Test
  void kontrolleraResultatReturns0forFiveSixesOnRow14(){
    Tarningar tarningar = new TarningarStub(6, 6, 6, 6, 6);

    int result = tarningar.kontrolleraResultat(14);

    assertEquals(50, result);
  }
}