package com.example.dogedice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;


//@ExtendWith(MockitoExtension.class)
class SpelareTest {

  @Test
  void testSparaResultatSeeIfsetResultatIsCalled() {

    //Arrange
    //ResultatLista resultat = mock(ResultatLista.class);
    //ResultatLista resultat = new ResultatLista();
    Spelare spelare = new Spelare("Anton", 1);
    //Act
    //when(resultat.getResultat(0)).thenReturn(null);
    spelare.sparaResultat(0, 3);
    //resultat.setResultat(0,3);
    //Assert
    //verify(resultat).setResultat(0, 3);
    assertEquals(3, spelare.getResultatLista().getResultat(0).getVarde());
  }
}