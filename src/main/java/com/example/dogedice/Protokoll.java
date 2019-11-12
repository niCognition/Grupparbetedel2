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

  private Stage myStage;
  private Scene scene;
  private Text text0;
  private Text text01;
  private Text text02;
  private Text text03;
  private Text text04;
  private Text text05;
  private Text text1;
  private Text text2;
  private Text text3;
  private Text text4;
  private Text text5;
  private Text text6;
  private Text text7;
  private Text text8;
  private Text text9;
  private Text text10;
  private Text text11;
  private Text text12;
  private Text text13;
  private Text text14;
  private Text text15;
  private Text text16;
  private Text text17;
  private Text text18;

  private Text summa1;
  private Text summa2;
  private Text summa3;
  private Text summa4;
  private Text summa5;

  private Text bonus1;
  private Text bonus2;
  private Text bonus3;
  private Text bonus4;
  private Text bonus5;

  private Text tot1;
  private Text tot2;
  private Text tot3;
  private Text tot4;
  private Text tot5;

  private Text handelse;

  private Text tarning1;
  private Text tarning2;
  private Text tarning3;
  private Text tarning4;
  private Text tarning5;

  private Button button1;
  private Button button2;
  private Button button3;
  private Button button4;
  private Button button5;
  private Button button6;
  private Button button7;
  private Button button8;
  private Button button9;
  private Button button10;

  private Button button11;
  private Button button12;
  private Button button13;
  private Button button14;
  private Button button15;
  private Button button16;
  private Button button17;
  private Button button18;
  private Button button19;
  private Button button20;

  private Button button21;
  private Button button22;
  private Button button23;
  private Button button24;
  private Button button25;
  private Button button26;
  private Button button27;
  private Button button28;
  private Button button29;
  private Button button30;

  private Button button31;
  private Button button32;
  private Button button33;
  private Button button34;
  private Button button35;
  private Button button36;
  private Button button37;
  private Button button38;
  private Button button39;
  private Button button40;

  private Button button41;
  private Button button42;
  private Button button43;
  private Button button44;
  private Button button45;
  private Button button46;
  private Button button47;
  private Button button48;
  private Button button49;
  private Button button50;

  private Button button51;
  private Button button52;
  private Button button53;
  private Button button54;
  private Button button55;
  private Button button56;
  private Button button57;
  private Button button58;
  private Button button59;
  private Button button60;

  private Button button61;
  private Button button62;
  private Button button63;
  private Button button64;
  private Button button65;
  private Button button66;
  private Button button67;
  private Button button68;
  private Button button69;
  private Button button70;

  private Button button71;
  private Button button72;
  private Button button73;
  private Button button74;
  private Button button75;

  private CheckBox checkBox1;
  private CheckBox checkBox2;
  private CheckBox checkBox3;
  private CheckBox checkBox4;
  private CheckBox checkBox5;

  private Button kasta;

  public Protokoll(Stage myStage){
    this.myStage = myStage;
    setUpSida();

  }

  public void setUpSida() {

    GridPane protoKoll = new GridPane();

    //creating label email
    text0 = new Text("Spelare: ");
    text01 = new Text("Spelare 1 ");
    text02 = new Text("Spelare 2 ");
    text03 = new Text("Spelare 3 ");
    text04 = new Text("Spelare 4 ");
    text05 = new Text("Spelare 5 ");
    text1 = new Text("Ettor");
    text2 = new Text("Tvåor");
    text3 = new Text("Treor");
    text4 = new Text("Fyror");
    text5 = new Text("Femmor");
    text6 = new Text("Sexor");
    text7 = new Text("SUMMA: ");
    text8 = new Text("BONUS(50) ");
    text9 = new Text("Par");
    text10 = new Text("Två Par");
    text11 = new Text("Triss");
    text12 = new Text("Fyrtal");
    text13 = new Text("Kåk");
    text14 = new Text("Liten Stege");
    text15 = new Text("Stor Stege");
    text16 = new Text("Chans");
    text17 = new Text("Yatzy(50)");
    text18 = new Text("SUMMA: ");
    summa1 = new Text(" test");
    summa2 = new Text(" test");
    summa3 = new Text(" test");
    summa4 = new Text(" test");
    summa5 = new Text(" test");
    bonus1 = new Text(" test");
    bonus2 = new Text(" test");
    bonus3 = new Text(" tes");
    bonus4 = new Text(" test");
    bonus5 = new Text(" test");
    tot1 = new Text(" test");
    tot2 = new Text(" test");
    tot3 = new Text(" test");
    tot4 = new Text(" test");
    tot5 = new Text(" test");

    //Label för händelse
    handelse = new Text("Spelaren 3 ska kasta tärningar ");

    //Tärningars label
    tarning1 = new Text("tärning 1");
    tarning2 = new Text("tärning2");
    tarning3 = new Text("tärning3");
    tarning4 = new Text("tärning4");
    tarning5 = new Text("tärning5");


    //Creating Buttons
    button1 = new Button(" ");
    button2 = new Button(" ");
    button3 = new Button(" ");
    button4 = new Button(" ");
    button5 = new Button(" ");
    button6 = new Button(" ");
    button7 = new Button(" ");
    button8 = new Button(" ");
    button9 = new Button(" ");
    button10 = new Button(" ");
    button11 = new Button(" ");
    button12 = new Button(" ");
    button13 = new Button(" ");
    button14 = new Button(" ");
    button15 = new Button(" ");
    button16 = new Button(" ");
    button17 = new Button(" ");
    button18 = new Button(" ");
    button19 = new Button(" ");
    button20 = new Button(" ");
    button21 = new Button(" ");
    button22 = new Button(" ");
    button23 = new Button(" ");
    button24 = new Button(" ");
    button25 = new Button(" ");
    button26 = new Button(" ");
    button27 = new Button(" ");
    button28 = new Button(" ");
    button29 = new Button(" ");
    button30 = new Button(" ");
    button31 = new Button(" ");
    button32 = new Button(" ");
    button33 = new Button(" ");
    button34 = new Button(" ");
    button35 = new Button(" ");
    button36 = new Button(" ");
    button37 = new Button(" ");
    button38 = new Button(" ");
    button39 = new Button(" ");
    button40 = new Button(" ");
    button41 = new Button(" ");
    button42 = new Button(" ");
    button43 = new Button(" ");
    button44 = new Button(" ");
    button45 = new Button(" ");
    button46 = new Button(" ");
    button47 = new Button(" ");
    button48 = new Button(" ");
    button49 = new Button(" ");
    button50 = new Button(" ");
    button51 = new Button(" ");
    button52 = new Button(" ");
    button53 = new Button(" ");
    button54 = new Button(" ");
    button55 = new Button(" ");
    button56 = new Button(" ");
    button57 = new Button(" ");
    button58 = new Button(" ");
    button59 = new Button(" ");
    button60 = new Button(" ");
    button61 = new Button(" ");
    button62 = new Button(" ");
    button63 = new Button(" ");
    button64 = new Button(" ");
    button65 = new Button(" ");
    button66 = new Button(" ");
    button67 = new Button(" ");
    button68 = new Button(" ");
    button69 = new Button(" ");
    button70 = new Button(" ");
    button71 = new Button(" ");
    button72 = new Button(" ");
    button73 = new Button(" ");
    button74 = new Button(" ");
    button75 = new Button(" ");

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
    gridPane.add(handelse, 0, 19, 6, 1);

    //Tärningars utskrift
    gridPane.add(tarning1, 1, 20);
    gridPane.add(tarning2, 2, 20);
    gridPane.add(tarning3, 3, 20);
    gridPane.add(tarning4, 4, 20);
    gridPane.add(tarning5, 5, 20);

    //Create checkbox
    checkBox1 = new CheckBox("");
    checkBox2 = new CheckBox("");
    checkBox3 = new CheckBox("");
    checkBox4 = new CheckBox("");
    checkBox5 = new CheckBox("");


    gridPane.add(checkBox1, 1, 21);
    gridPane.add(checkBox2, 2, 21);
    gridPane.add(checkBox3, 3, 21);
    gridPane.add(checkBox4, 4, 21);
    gridPane.add(checkBox5, 5, 21);

    //Kasta knapp
    kasta = new Button("Kasta tärningarna");

    gridPane.add(kasta, 3, 22, 3, 1);

    //Creating a scene object
    scene = new Scene(gridPane);

    //Setting title to the Stage
    myStage.setTitle("Protokoll");
  }

  public void visaProtokoll(Stage myStage){

      //Adding scene to the stage
      myStage.setScene(scene);

      //Displaying the contents of the stage
      myStage.show();
    }

}
