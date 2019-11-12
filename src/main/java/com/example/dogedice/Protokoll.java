package com.example.dogedice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Protokoll {




  public class Main extends Application {

    @Override
    public void start(Stage stage)  {
      GridPane protoKoll = new GridPane();




      //creating label email
      Text text0 = new Text("Spelare: ");
      Text text01 = new Text("Spelare 1 ");
      Text text02 = new Text("Spelare 2 ");
      Text text03 = new Text("Spelare 3 ");
      Text text04 = new Text("Spelare 4 ");
      Text text05 = new Text("Spelare 5 ");
      Text text1 = new Text("Ettor");
      Text text2 = new Text("Tvåor");
      Text text3 = new Text("Treor");
      Text text4 = new Text("Fyror");
      Text text5 = new Text("Femmor");
      Text text6 = new Text("Sexor");
      Text text7 = new Text("SUMMA: ");
      Text text8 = new Text("BONUS(50) ");
      Text text9 = new Text("Par");
      Text text10 = new Text("Två Par");
      Text text11 = new Text("Triss");
      Text text12 = new Text("Fyrtal");
      Text text13 = new Text("Kåk");
      Text text14 = new Text("Liten Stege");
      Text text15 = new Text("Stor Stege");
      Text text16 = new Text("Chans");
      Text text17 = new Text("Yatzy(50)");
      Text text18 = new Text("SUMMA: ");
      Text summa1 = new Text(" test");
      Text summa2 = new Text(" test");
      Text summa3 = new Text(" test");
      Text summa4 = new Text(" test");
      Text summa5 = new Text(" test");
      Text bonus1 = new Text(" test");
      Text bonus2 = new Text(" test");
      Text bonus3 = new Text(" tes");
      Text bonus4 = new Text(" test");
      Text bonus5 = new Text(" test");
      Text tot1 = new Text(" test");
      Text tot2 = new Text(" test");
      Text tot3 = new Text(" test");
      Text tot4 = new Text(" test");
      Text tot5 = new Text(" test");

      //Label för händelse
      Text handelse =new Text("Spelaren 3 ska kasta tärningar ");

      //Tärningars label
      Text tarning1 = new Text("tärning 1");
      Text tarning2 = new Text("tärning2");
      Text tarning3 = new Text("tärning3");
      Text tarning4 = new Text("tärning4");
      Text tarning5 = new Text("tärning5");





      //Creating Buttons
      Button button1 = new Button(" ");
      Button button2 = new Button(" ");
      Button button3 = new Button(" ");
      Button button4 = new Button(" ");
      Button button5 = new Button(" ");
      Button button6 = new Button(" ");
      Button button7 = new Button(" ");
      Button button8 = new Button(" ");
      Button button9 = new Button(" ");
      Button button10 = new Button(" ");
      Button button11 = new Button(" ");
      Button button12 = new Button(" ");
      Button button13 = new Button(" ");
      Button button14 = new Button(" ");
      Button button15 = new Button(" ");
      Button button16 = new Button(" ");
      Button button17 = new Button(" ");
      Button button18 = new Button(" ");
      Button button19 = new Button(" ");
      Button button20 = new Button(" ");
      Button button21 = new Button(" ");
      Button button22 = new Button(" ");
      Button button23 = new Button(" ");
      Button button24 = new Button(" ");
      Button button25 = new Button(" ");
      Button button26 = new Button(" ");
      Button button27 = new Button(" ");
      Button button28 = new Button(" ");
      Button button29 = new Button(" ");
      Button button30 = new Button(" ");
      Button button31 = new Button(" ");
      Button button32 = new Button(" ");
      Button button33 = new Button(" ");
      Button button34 = new Button(" ");
      Button button35 = new Button(" ");
      Button button36 = new Button(" ");
      Button button37 = new Button(" ");
      Button button38 = new Button(" ");
      Button button39 = new Button(" ");
      Button button40 = new Button(" ");
      Button button41 = new Button(" ");
      Button button42 = new Button(" ");
      Button button43 = new Button(" ");
      Button button44 = new Button(" ");
      Button button45 = new Button(" ");
      Button button46 = new Button(" ");
      Button button47 = new Button(" ");
      Button button48 = new Button(" ");
      Button button49 = new Button(" ");
      Button button50 = new Button(" ");
      Button button51 = new Button(" ");
      Button button52 = new Button(" ");
      Button button53 = new Button(" ");
      Button button54 = new Button(" ");
      Button button55 = new Button(" ");
      Button button56 = new Button(" ");
      Button button57 = new Button(" ");
      Button button58 = new Button(" ");
      Button button59 = new Button(" ");
      Button button60 = new Button(" ");
      Button button61 = new Button(" ");
      Button button62 = new Button(" ");
      Button button63 = new Button(" ");
      Button button64 = new Button(" ");
      Button button65 = new Button(" ");
      Button button66 = new Button(" ");
      Button button67 = new Button(" ");
      Button button68 = new Button(" ");
      Button button69 = new Button(" ");
      Button button70 = new Button(" ");
      Button button71 = new Button(" ");
      Button button72 = new Button(" ");
      Button button73 = new Button(" ");
      Button button74 = new Button(" ");
      Button button75 = new Button(" ");


      //Creating a Grid Pane
      GridPane gridPane = new GridPane();


      //Setting size for the pane
      gridPane.setMinSize(400, 200);

      //Setting the padding
      gridPane.setPadding(new Insets(10, 10, 10, 10));

      //Setting the vertical and horizontal gaps between the columns
      gridPane.setVgap(5);
      gridPane.setHgap(5);

      //Setting the Grid alignment
      gridPane.setAlignment(Pos.CENTER);


      //Arranging all the nodes in the grid
      gridPane.add(text0, 0, 0);
      gridPane.add(text1, 0, 1);
      gridPane.add(text2, 0, 2);
      gridPane.add(text3, 0, 3);
      gridPane.add(text4, 0, 4);
      gridPane.add(text5, 0, 5);
      gridPane.add(text6, 0, 6);
      gridPane.add(text7, 0, 7);
      gridPane.add(text8, 0, 8);
      gridPane.add(text9, 0, 9);
      gridPane.add(text10, 0, 10);
      gridPane.add(text11, 0, 11);
      gridPane.add(text12, 0, 12);
      gridPane.add(text13, 0, 13);
      gridPane.add(text14, 0, 14);
      gridPane.add(text15, 0, 15);
      gridPane.add(text16, 0, 16);
      gridPane.add(text17, 0, 17);
      gridPane.add(text18, 0, 18);
      gridPane.add(text01, 1, 0);
      gridPane.add(text02, 2, 0);
      gridPane.add(text03, 3, 0);
      gridPane.add(text04, 4, 0);
      gridPane.add(text05, 5, 0);
      gridPane.add(summa1, 1, 7);
      gridPane.add(summa2, 2, 7);
      gridPane.add(summa3, 3, 7);
      gridPane.add(summa4, 4, 7);
      gridPane.add(summa5, 5, 7);
      gridPane.add(bonus1, 1, 8);
      gridPane.add(bonus2, 2, 8);
      gridPane.add(bonus3, 3, 8);
      gridPane.add(bonus4, 4, 8);
      gridPane.add(bonus5, 5, 8);
      gridPane.add(tot1, 1, 18);
      gridPane.add(tot2, 2, 18);
      gridPane.add(tot3, 3, 18);
      gridPane.add(tot4, 4, 18);
      gridPane.add(tot5, 5, 18);



      gridPane.add(button1, 1, 1);
      gridPane.add(button2, 2, 1);
      gridPane.add(button3, 3, 1);
      gridPane.add(button4, 4, 1);
      gridPane.add(button5, 5, 1);
      gridPane.add(button6, 1, 2);
      gridPane.add(button7, 2, 2);
      gridPane.add(button8, 3, 2);
      gridPane.add(button9, 4, 2);
      gridPane.add(button10, 5, 2);
      gridPane.add(button11, 1, 3);
      gridPane.add(button12, 2, 3);
      gridPane.add(button13, 3, 3);
      gridPane.add(button14, 4, 3);
      gridPane.add(button15, 5, 3);
      gridPane.add(button16, 1, 4);
      gridPane.add(button17, 2, 4);
      gridPane.add(button18, 3, 4);
      gridPane.add(button19, 4, 4);
      gridPane.add(button20, 5, 4);
      gridPane.add(button21, 1, 5);
      gridPane.add(button22, 2, 5);
      gridPane.add(button23, 3, 5);
      gridPane.add(button24, 4, 5);
      gridPane.add(button25, 5, 5);
      gridPane.add(button26, 1, 6);
      gridPane.add(button27, 2, 6);
      gridPane.add(button28, 3, 6);
      gridPane.add(button29, 4, 6);
      gridPane.add(button30, 5, 6);
      gridPane.add(button31, 1, 9);
      gridPane.add(button32, 2, 9);
      gridPane.add(button33, 3, 9);
      gridPane.add(button34, 4, 9);
      gridPane.add(button35, 5, 9);
      gridPane.add(button36, 1, 10);
      gridPane.add(button37, 2, 10);
      gridPane.add(button38, 3, 10);
      gridPane.add(button39, 4, 10);
      gridPane.add(button40, 5, 10);
      gridPane.add(button41, 1, 11);
      gridPane.add(button42, 2, 11);
      gridPane.add(button43, 3, 11);
      gridPane.add(button44, 4, 11);
      gridPane.add(button45, 5, 11);
      gridPane.add(button46, 1, 12);
      gridPane.add(button47, 2, 12);
      gridPane.add(button48, 3, 12);
      gridPane.add(button49, 4, 12);
      gridPane.add(button50, 5, 12);
      gridPane.add(button51, 1, 13);
      gridPane.add(button52, 2, 13);
      gridPane.add(button53, 3, 13);
      gridPane.add(button54, 4, 13);
      gridPane.add(button55, 5, 13);
      gridPane.add(button56, 1, 14);
      gridPane.add(button57, 2, 14);
      gridPane.add(button58, 3, 14);
      gridPane.add(button59, 4, 14);
      gridPane.add(button60, 5, 14);
      gridPane.add(button61, 1, 15);
      gridPane.add(button62, 2, 15);
      gridPane.add(button63, 3, 15);
      gridPane.add(button64, 4, 15);
      gridPane.add(button65, 5, 15);
      gridPane.add(button66, 1, 16);
      gridPane.add(button67, 2, 16);
      gridPane.add(button68, 3, 16);
      gridPane.add(button69, 4, 16);
      gridPane.add(button70, 5, 16);
      gridPane.add(button71, 1, 17);
      gridPane.add(button72, 2, 17);
      gridPane.add(button73, 3, 17);
      gridPane.add(button74, 4, 17);
      gridPane.add(button75, 5, 17);


      //Händelse utskrift
      gridPane.add(handelse, 0,19, 6,1);

      //Tärningars utskrift
      gridPane.add(tarning1, 1,20);
      gridPane.add(tarning2, 2,20);
      gridPane.add(tarning3, 3,20);
      gridPane.add(tarning4, 4,20);
      gridPane.add(tarning5, 5,20);





      //Create checkbox

      CheckBox checkBox1 = new CheckBox("");
      CheckBox checkBox2 = new CheckBox("");
      CheckBox checkBox3 = new CheckBox("");
      CheckBox checkBox4 = new CheckBox("");
      CheckBox checkBox5 = new CheckBox("");


      gridPane.add(checkBox1, 1, 21);
      gridPane.add(checkBox2, 2, 21);
      gridPane.add(checkBox3, 3,21);
      gridPane.add(checkBox4, 4, 21);
      gridPane.add(checkBox5, 5,21);

      //Kasta knapp

      Button kasta = new Button("Kasta tärningarna");

      gridPane.add(kasta, 3, 22, 3, 1);






      //Creating a scene object
      Scene scene = new Scene(gridPane);

      //Setting title to the Stage
      stage.setTitle("Protokoll");

      //Adding scene to the stage
      stage.setScene(scene);

      //Displaying the contents of the stage
      stage.show();
    }

  }

}
