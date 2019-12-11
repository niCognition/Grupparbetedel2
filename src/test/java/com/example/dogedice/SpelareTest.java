package com.example.dogedice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class SpelareTest {

  //Arrange
  ResultatLista resultat = mock(ResultatLista.class);
  Spelare spelare = new Spelare("Anton", 1, resultat);

  @Test
  void testsparaResultatCalledWhenReturnValueEqualsNull() {

    //Act
    when(resultat.getResultat(0)).thenReturn(null);
    spelare.sparaResultat(0, 3);

    //Assert
    verify(resultat).setResultat(0, 3);
  }

  @Test
  void testsparaResultatNotCalledWhenReturnValueIsNotEqualNull(){

    //Act
    when(resultat.getResultat(0)).thenReturn(new Resultat(3));
    spelare.sparaResultat(0, 3);

    //Assert
    verify(resultat, times(0)).setResultat(0,3);
  }
}