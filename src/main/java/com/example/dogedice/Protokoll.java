package com.example.dogedice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Protokoll {

  private Spel spel;

  private Stage myStage;
  private Scene scene;
  private GridPane gridPane;

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

  private Button quit;
  private Button spara;
  private Button kasta;

  public Protokoll(Stage myStage, Spel spel){
    this.myStage = myStage;
    this.spel = spel;
    setUpSida(spel.getSpelare());

  }

  public void setUpSida(ArrayList<Spelare> spelare) {


    //creating label email
    text0 = new Text("Spelare: ");
    text01 = new Text(" ");
    text02 = new Text(" ");
    text03 = new Text(" ");
    text04 = new Text(" ");
    text05 = new Text(" ");
    text1 = new Text("Ettor");
    text2 = new Text("Tv"+(char) 229+"or");
    text3 = new Text("Treor");
    text4 = new Text("Fyror");
    text5 = new Text("Femmor");
    text6 = new Text("Sexor");
    text7 = new Text("SUMMA: ");
    text8 = new Text("BONUS(50) ");
    text9 = new Text("Par");
    text10 = new Text("Tv"+(char) 229+" Par");
    text11 = new Text("Triss");
    text12 = new Text("Fyrtal");
    text13 = new Text("K"+(char) 229+"k");
    text14 = new Text("Liten Stege");
    text15 = new Text("Stor Stege");
    text16 = new Text("Chans");
    text17 = new Text("Yatzy(50)");
    text18 = new Text("SUMMA: ");
    summa1 = new Text("0");
    summa2 = new Text("0");
    summa3 = new Text("0");
    summa4 = new Text("0");
    summa5 = new Text("0");
    bonus1 = new Text("0");
    bonus2 = new Text("0");
    bonus3 = new Text("0");
    bonus4 = new Text("0");
    bonus5 = new Text("0");
    tot1 = new Text("0");
    tot2 = new Text("0");
    tot3 = new Text("0");
    tot4 = new Text("0");
    tot5 = new Text("0");

    //Label för händelse
    handelse = new Text(spelare.get(0).getNamn() + " spelar");

    quit = new Button();
    quit.setStyle("-fx-padding: 5 13 5 13; -fx-background-image: url('http://pluspng.com/img-png/exit-button-png-open-2000.png'); -fx-background-size: 60px 60px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    quit.setAlignment(Pos.BOTTOM_LEFT);
    quit.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        Avslut avslut = new Avslut(myStage);
        avslut.visaAvslut(myStage);
      }
    });

    spara = new Button("Spara nu");
    kasta = new Button("Kasta t" + (char) 228 + "rningarna");

    HBox quitKastaSpara = new HBox();
    quitKastaSpara.setSpacing(60);
    quitKastaSpara.setAlignment(Pos.CENTER);
    quitKastaSpara.getChildren().addAll(quit, kasta, spara);


    //Tärningars label
    tarning1 = new Text("");
    tarning2 = new Text("");
    tarning3 = new Text("");
    tarning4 = new Text("");
    tarning5 = new Text("");


    //Creating Buttons
    button1 = new Button("  ");
    button2 = new Button("  ");
    button3 = new Button("  ");
    button4 = new Button("  ");
    button5 = new Button("  ");
    button6 = new Button("  ");
    button7 = new Button("  ");
    button8 = new Button("  ");
    button9 = new Button("  ");
    button10 = new Button("  ");
    button11 = new Button("  ");
    button12 = new Button("  ");
    button13 = new Button("  ");
    button14 = new Button("  ");
    button15 = new Button("  ");
    button16 = new Button("  ");
    button17 = new Button("  ");
    button18 = new Button("  ");
    button19 = new Button("  ");
    button20 = new Button("  ");
    button21 = new Button("  ");
    button22 = new Button("  ");
    button23 = new Button("  ");
    button24 = new Button("  ");
    button25 = new Button("  ");
    button26 = new Button("  ");
    button27 = new Button("  ");
    button28 = new Button("  ");
    button29 = new Button("  ");
    button30 = new Button("  ");
    button31 = new Button("  ");
    button32 = new Button("  ");
    button33 = new Button("  ");
    button34 = new Button("  ");
    button35 = new Button("  ");
    button36 = new Button("  ");
    button37 = new Button("  ");
    button38 = new Button("  ");
    button39 = new Button("  ");
    button40 = new Button("  ");
    button41 = new Button("  ");
    button42 = new Button("  ");
    button43 = new Button("  ");
    button44 = new Button("  ");
    button45 = new Button("  ");
    button46 = new Button("  ");
    button47 = new Button("  ");
    button48 = new Button("  ");
    button49 = new Button("  ");
    button50 = new Button("  ");
    button51 = new Button("  ");
    button52 = new Button("  ");
    button53 = new Button("  ");
    button54 = new Button("  ");
    button55 = new Button("  ");
    button56 = new Button("  ");
    button57 = new Button("  ");
    button58 = new Button("  ");
    button59 = new Button("  ");
    button60 = new Button("  ");
    button61 = new Button("  ");
    button62 = new Button("  ");
    button63 = new Button("  ");
    button64 = new Button("  ");
    button65 = new Button("  ");
    button66 = new Button("  ");
    button67 = new Button("  ");
    button68 = new Button("  ");
    button69 = new Button("  ");
    button70 = new Button("  ");
    button71 = new Button("  ");
    button72 = new Button("  ");
    button73 = new Button("  ");
    button74 = new Button("  ");
    button75 = new Button("  ");

    gridPane = new GridPane();

    gridPane.setMinSize(400, 200);
    gridPane.setPadding(new Insets(10, 10, 10, 10));
    gridPane.setVgap(5);
    gridPane.setHgap(5);
    gridPane.setAlignment(Pos.CENTER);


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

    if (spelare.size() >= 1) {
      setUpSpelare1();
    }

    if (spelare.size() >=2){
      setUpSpelare2();
    }

    if (spelare.size() >=3){
      setUpSpelare3();
    }

    if (spelare.size() >=4){
      setUpSpelare4();
    }

    if (spelare.size() ==5){
      setUpSpelare5();

    }


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

    gridPane.add(quitKastaSpara, 0, 22, 6, 1);


    //Creating a scene object
    scene = new Scene(gridPane);

    //Setting title to the Stage
    myStage.setTitle("Protokoll");

    inaktiveraKnapparSpelare1();
    inaktiveraKnapparSpelare2();
    inaktiveraKnapparSpelare3();
    inaktiveraKnapparSpelare4();
    inaktiveraKnapparSpelare5();
    inaktiveraCheckboxar();
    spara.setDisable(true);

    kasta.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {

        
        ArrayList<Integer> kastAttSpara = new ArrayList<Integer>();
        if (checkBox1.isSelected()){
          kastAttSpara.add(0);
        }
        if (checkBox2.isSelected()){
          kastAttSpara.add(1);
        }
        if (checkBox3.isSelected()){
          kastAttSpara.add(2);
        }
        if (checkBox4.isSelected()){
          kastAttSpara.add(3);
        }
        if (checkBox5.isSelected()){
          kastAttSpara.add(4);
        }

        int[] sparadeKast = new int[kastAttSpara.size()];


        for (int i = 0; i < sparadeKast.length; i++) {
        sparadeKast[i] = kastAttSpara.get(i).intValue();
      }

        spel.kasta(sparadeKast);

      int[] kastResultat = spel.getTarningar().getVarden();
        tarning1.setText(String.valueOf(kastResultat[0]));
        tarning2.setText(String.valueOf(kastResultat[1]));
        tarning3.setText(String.valueOf(kastResultat[2]));
        tarning4.setText(String.valueOf(kastResultat[3]));
        tarning5.setText(String.valueOf(kastResultat[4]));

        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
        checkBox4.setSelected(false);
        checkBox5.setSelected(false);
        aktiveraCheckboxar();
        spara.setDisable(false);

        if (spel.getKast() == 3) {

          inaktiveraCheckboxar();
          spara.setDisable(true);
          kasta.setDisable(true);

          int aktivSpelare = spel.getAktivSpelare();

          switch (aktivSpelare) {
            case 1:
              aktiveraKnapparSpelare1();
              break;
            case 2:
              aktiveraKnapparSpelare2();
              break;
            case 3:
              aktiveraKnapparSpelare3();
              break;
            case 4:
              aktiveraKnapparSpelare4();
              break;
            case 5:
              aktiveraKnapparSpelare5();
              break;
          }

        }
        spel.okaKast();

        if (spel.getKast() == 1) {

        handelse.setText("Spara ditt resultat i valfri position");
      } else {
        int aktivSpelare = spel.getAktivSpelare();
        handelse.setText(spelare.get(aktivSpelare - 1).getNamn() + ", markera vilka kast som ska sparas");
      }

    }


    });

    spara.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {

        handelse.setText("Spara ditt resultat i valfri position");
        kasta.setDisable(true);
        spara.setDisable(true);
        inaktiveraCheckboxar();

        int aktivSpelare = spel.getAktivSpelare();

        switch(aktivSpelare){
          case 1:
            aktiveraKnapparSpelare1();
            break;
          case 2:
            aktiveraKnapparSpelare2();
            break;
          case 3:
            aktiveraKnapparSpelare3();
            break;
          case 4:
            aktiveraKnapparSpelare4();
            break;
          case 5:
            aktiveraKnapparSpelare5();
            break;
        }
        spel.nastaSpelare();
      }
    });
  }

  public void visaProtokoll(Stage myStage){

      //Adding scene to the stage
      myStage.setScene(scene);

      //Displaying the contents of the stage
      myStage.show();
    }

    private void setUpSpelare1(){

      text01.setText(spel.getSpelare().get(0).getNamn());

      gridPane.add(text01, 1, 0);
      gridPane.add(button1, 1, 1);
      gridPane.add(button6, 1, 2);
      gridPane.add(button11, 1, 3);
      gridPane.add(button16, 1, 4);
      gridPane.add(button21, 1, 5);
      gridPane.add(button26, 1, 6);
      gridPane.add(summa1, 1, 7);
      gridPane.add(bonus1, 1, 8);
      gridPane.add(button31, 1, 9);
      gridPane.add(button36, 1, 10);
      gridPane.add(button41, 1, 11);
      gridPane.add(button46, 1, 12);
      gridPane.add(button51, 1, 13);
      gridPane.add(button56, 1, 14);
      gridPane.add(button61, 1, 15);
      gridPane.add(button66, 1, 16);
      gridPane.add(button71, 1, 17);
      gridPane.add(tot1, 1, 18);

      button1.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(0);
          spel.getSpelare().get(0).sparaResultat(0, result);
          button1.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
          if (spel.getKastOmgang() > 15){
            ResultatSida resultatSida = new ResultatSida(myStage, spel.getSpelare());
            resultatSida.visaResultatSida(myStage);
          }
        }
      });

      button6.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(1);
          spel.getSpelare().get(0).sparaResultat(1, result);
          button6.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button11.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(2);
          spel.getSpelare().get(0).sparaResultat(2, result);
          button11.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button16.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(3);
          spel.getSpelare().get(0).sparaResultat(3, result);
          button16.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button21.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(4);
          spel.getSpelare().get(0).sparaResultat(4, result);
          button21.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button26.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(5);
          spel.getSpelare().get(0).sparaResultat(5, result);
          button26.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button31.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(6);
          spel.getSpelare().get(0).sparaResultat(6, result);
          button31.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button36.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(7);
          spel.getSpelare().get(0).sparaResultat(7, result);
          button36.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button41.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(8);
          spel.getSpelare().get(0).sparaResultat(8, result);
          button41.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button46.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(9);
          spel.getSpelare().get(0).sparaResultat(9, result);
          button46.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button51.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(10);
          spel.getSpelare().get(0).sparaResultat(10, result);
          button51.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button56.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(11);
          spel.getSpelare().get(0).sparaResultat(11, result);
          button56.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button61.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(12);
          spel.getSpelare().get(0).sparaResultat(12, result);
          button61.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button66.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(13);
          spel.getSpelare().get(0).sparaResultat(13, result);
          button66.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });

      button71.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          int result = spel.getTarningar().kontrolleraResultat(14);
          spel.getSpelare().get(0).sparaResultat(14, result);
          button71.setText(String.valueOf(result));
          inaktiveraKnapparSpelare1();
          Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
          handelse.setText(aktivSpelare.getNamn() + " spelar");
          kasta.setDisable(false);
          tarning1.setText("");
          tarning2.setText("");
          tarning3.setText("");
          tarning4.setText("");
          tarning5.setText("");
          summa1.setText(String.valueOf(spel.getSpelare().get(0).getOvreResultat()));
          bonus1.setText(String.valueOf(spel.getSpelare().get(0).getBonus()));
          tot1.setText(String.valueOf(spel.getSpelare().get(0).getTotalSumma()));
        }
      });
    }

  private void setUpSpelare2(){

    text02.setText(spel.getSpelare().get(1).getNamn());

    gridPane.add(text02, 2, 0);
    gridPane.add(button2, 2, 1);
    gridPane.add(button7, 2, 2);
    gridPane.add(button12, 2, 3);
    gridPane.add(button17, 2, 4);
    gridPane.add(button22, 2, 5);
    gridPane.add(button27, 2, 6);
    gridPane.add(summa2, 2, 7);
    gridPane.add(bonus2, 2, 8);
    gridPane.add(button32, 2, 9);
    gridPane.add(button37, 2, 10);
    gridPane.add(button42, 2, 11);
    gridPane.add(button47, 2, 12);
    gridPane.add(button52, 2, 13);
    gridPane.add(button57, 2, 14);
    gridPane.add(button62, 2, 15);
    gridPane.add(button67, 2, 16);
    gridPane.add(button72, 2, 17);
    gridPane.add(tot2, 2, 18);

    button2.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(0);
        spel.getSpelare().get(1).sparaResultat(0, result);
        button2.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button7.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(1);
        spel.getSpelare().get(1).sparaResultat(1, result);
        button7.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button12.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(2);
        spel.getSpelare().get(1).sparaResultat(2, result);
        button12.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button17.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(3);
        spel.getSpelare().get(1).sparaResultat(3, result);
        button17.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button22.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(4);
        spel.getSpelare().get(1).sparaResultat(4, result);
        button22.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button27.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(5);
        spel.getSpelare().get(1).sparaResultat(5, result);
        button27.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button32.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(6);
        spel.getSpelare().get(1).sparaResultat(6, result);
        button32.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button37.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(7);
        spel.getSpelare().get(1).sparaResultat(7, result);
        button37.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button42.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(8);
        spel.getSpelare().get(1).sparaResultat(8, result);
        button42.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button47.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(9);
        spel.getSpelare().get(1).sparaResultat(9, result);
        button47.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button52.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(10);
        spel.getSpelare().get(1).sparaResultat(10, result);
        button52.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button57.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(11);
        spel.getSpelare().get(1).sparaResultat(11, result);
        button57.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button62.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(12);
        spel.getSpelare().get(1).sparaResultat(12, result);
        button62.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button67.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(13);
        spel.getSpelare().get(1).sparaResultat(13, result);
        button67.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });

    button72.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(14);
        spel.getSpelare().get(1).sparaResultat(14, result);
        button72.setText(String.valueOf(result));
        inaktiveraKnapparSpelare2();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa2.setText(String.valueOf(spel.getSpelare().get(1).getOvreResultat()));
        bonus2.setText(String.valueOf(spel.getSpelare().get(1).getBonus()));
        tot2.setText(String.valueOf(spel.getSpelare().get(1).getTotalSumma()));
      }
    });
  }

  private void setUpSpelare3(){

    text03.setText(spel.getSpelare().get(2).getNamn());

    gridPane.add(text03, 3, 0);
    gridPane.add(button3, 3, 1);
    gridPane.add(button8, 3, 2);
    gridPane.add(button13, 3, 3);
    gridPane.add(button18, 3, 4);
    gridPane.add(button23, 3, 5);
    gridPane.add(button28, 3, 6);
    gridPane.add(summa3, 3, 7);
    gridPane.add(bonus3, 3, 8);
    gridPane.add(button33, 3, 9);
    gridPane.add(button38, 3, 10);
    gridPane.add(button43, 3, 11);
    gridPane.add(button48, 3, 12);
    gridPane.add(button53, 3, 13);
    gridPane.add(button58, 3, 14);
    gridPane.add(button63, 3, 15);
    gridPane.add(button68, 3, 16);
    gridPane.add(button73, 3, 17);
    gridPane.add(tot3, 3, 18);

    button3.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(0);
        spel.getSpelare().get(2).sparaResultat(0, result);
        button3.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button8.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(1);
        spel.getSpelare().get(2).sparaResultat(1, result);
        button8.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button13.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(2);
        spel.getSpelare().get(2).sparaResultat(2, result);
        button13.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button18.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(3);
        spel.getSpelare().get(2).sparaResultat(3, result);
        button18.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button23.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(4);
        spel.getSpelare().get(2).sparaResultat(4, result);
        button23.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button28.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(5);
        spel.getSpelare().get(2).sparaResultat(5, result);
        button28.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button33.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(6);
        spel.getSpelare().get(2).sparaResultat(6, result);
        button33.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button38.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(7);
        spel.getSpelare().get(2).sparaResultat(7, result);
        button38.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button43.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(8);
        spel.getSpelare().get(2).sparaResultat(8, result);
        button43.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button48.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(9);
        spel.getSpelare().get(2).sparaResultat(9, result);
        button48.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button53.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(10);
        spel.getSpelare().get(2).sparaResultat(10, result);
        button53.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button58.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(11);
        spel.getSpelare().get(2).sparaResultat(11, result);
        button58.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button63.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(12);
        spel.getSpelare().get(2).sparaResultat(12, result);
        button63.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button68.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(13);
        spel.getSpelare().get(2).sparaResultat(13, result);
        button68.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });

    button73.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(14);
        spel.getSpelare().get(2).sparaResultat(14, result);
        button73.setText(String.valueOf(result));
        inaktiveraKnapparSpelare3();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa3.setText(String.valueOf(spel.getSpelare().get(2).getOvreResultat()));
        bonus3.setText(String.valueOf(spel.getSpelare().get(2).getBonus()));
        tot3.setText(String.valueOf(spel.getSpelare().get(2).getTotalSumma()));
      }
    });
  }

  private void setUpSpelare4(){

    text04.setText(spel.getSpelare().get(3).getNamn());

    gridPane.add(text04, 4, 0);
    gridPane.add(button4, 4, 1);
    gridPane.add(button9, 4, 2);
    gridPane.add(button14, 4, 3);
    gridPane.add(button19, 4, 4);
    gridPane.add(button24, 4, 5);
    gridPane.add(button29, 4, 6);
    gridPane.add(summa4, 4, 7);
    gridPane.add(bonus4, 4, 8);
    gridPane.add(button34, 4, 9);
    gridPane.add(button39, 4, 10);
    gridPane.add(button44, 4, 11);
    gridPane.add(button49, 4, 12);
    gridPane.add(button54, 4, 13);
    gridPane.add(button59, 4, 14);
    gridPane.add(button64, 4, 15);
    gridPane.add(button69, 4, 16);
    gridPane.add(button74, 4, 17);
    gridPane.add(tot4, 4, 18);



    button4.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(0);
        spel.getSpelare().get(3).sparaResultat(0, result);
        button4.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button9.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(1);
        spel.getSpelare().get(3).sparaResultat(1, result);
        button9.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button14.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(2);
        spel.getSpelare().get(3).sparaResultat(2, result);
        button14.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button19.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(3);
        spel.getSpelare().get(3).sparaResultat(3, result);
        button19.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button24.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(4);
        spel.getSpelare().get(3).sparaResultat(4, result);
        button24.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button29.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(5);
        spel.getSpelare().get(3).sparaResultat(5, result);
        button29.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button34.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(6);
        spel.getSpelare().get(3).sparaResultat(6, result);
        button34.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button39.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(7);
        spel.getSpelare().get(3).sparaResultat(7, result);
        button39.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button44.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(8);
        spel.getSpelare().get(3).sparaResultat(8, result);
        button44.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button49.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(9);
        spel.getSpelare().get(3).sparaResultat(9, result);
        button49.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button54.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(10);
        spel.getSpelare().get(3).sparaResultat(10, result);
        button54.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button59.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(11);
        spel.getSpelare().get(3).sparaResultat(11, result);
        button59.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button64.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(12);
        spel.getSpelare().get(3).sparaResultat(12, result);
        button64.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button69.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(13);
        spel.getSpelare().get(3).sparaResultat(13, result);
        button69.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });

    button74.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(14);
        spel.getSpelare().get(3).sparaResultat(14, result);
        button74.setText(String.valueOf(result));
        inaktiveraKnapparSpelare4();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa4.setText(String.valueOf(spel.getSpelare().get(3).getOvreResultat()));
        bonus4.setText(String.valueOf(spel.getSpelare().get(3).getBonus()));
        tot4.setText(String.valueOf(spel.getSpelare().get(3).getTotalSumma()));
      }
    });
  }

  private void setUpSpelare5(){



    text05.setText(spel.getSpelare().get(4).getNamn());

    gridPane.add(text05, 5, 0);
    gridPane.add(button5, 5, 1);
    gridPane.add(button10, 5, 2);
    gridPane.add(button15, 5, 3);
    gridPane.add(button20, 5, 4);
    gridPane.add(button25, 5, 5);
    gridPane.add(button30, 5, 6);
    gridPane.add(summa5, 5, 7);
    gridPane.add(bonus5, 5, 8);
    gridPane.add(button35, 5, 9);
    gridPane.add(button40, 5, 10);
    gridPane.add(button45, 5, 11);
    gridPane.add(button50, 5, 12);
    gridPane.add(button55, 5, 13);
    gridPane.add(button60, 5, 14);
    gridPane.add(button65, 5, 15);
    gridPane.add(button70, 5, 16);
    gridPane.add(button75, 5, 17);
    gridPane.add(tot5, 5, 18);


    button5.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(0);
        spel.getSpelare().get(4).sparaResultat(0, result);
        button5.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button10.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(1);
        spel.getSpelare().get(4).sparaResultat(1, result);
        button10.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button15.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(2);
        spel.getSpelare().get(4).sparaResultat(2, result);
        button15.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button20.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(3);
        spel.getSpelare().get(4).sparaResultat(3, result);
        button20.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button25.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(4);
        spel.getSpelare().get(4).sparaResultat(4, result);
        button25.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button30.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(5);
        spel.getSpelare().get(4).sparaResultat(5, result);
        button30.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button35.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(6);
        spel.getSpelare().get(4).sparaResultat(6, result);
        button35.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button40.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(7);
        spel.getSpelare().get(4).sparaResultat(7, result);
        button40.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button45.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(8);
        spel.getSpelare().get(4).sparaResultat(8, result);
        button45.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button50.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(9);
        spel.getSpelare().get(4).sparaResultat(9, result);
        button50.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button55.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(10);
        spel.getSpelare().get(4).sparaResultat(10, result);
        button55.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button60.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(11);
        spel.getSpelare().get(4).sparaResultat(11, result);
        button60.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button65.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(12);
        spel.getSpelare().get(4).sparaResultat(12, result);
        button65.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button70.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(13);
        spel.getSpelare().get(4).sparaResultat(13, result);
        button70.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });

    button75.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        int result = spel.getTarningar().kontrolleraResultat(14);
        spel.getSpelare().get(4).sparaResultat(14, result);
        button75.setText(String.valueOf(result));
        inaktiveraKnapparSpelare5();
        Spelare aktivSpelare = spel.getSpelare().get(spel.getAktivSpelare()-1);
        handelse.setText(aktivSpelare.getNamn() + " spelar");
        kasta.setDisable(false);
        tarning1.setText("");
        tarning2.setText("");
        tarning3.setText("");
        tarning4.setText("");
        tarning5.setText("");
        summa5.setText(String.valueOf(spel.getSpelare().get(4).getOvreResultat()));
        bonus5.setText(String.valueOf(spel.getSpelare().get(4).getBonus()));
        tot5.setText(String.valueOf(spel.getSpelare().get(4).getTotalSumma()));
      }
    });
  }
  
  public void aktiveraKnapparSpelare1(){
    
    if (spel.getSpelare().get(0).getResultatLista().getResultat(0) == null) {
      button1.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(1) == null) {
      button6.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(2) == null) {
      button11.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(3) == null) {
      button16.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(4) == null) {
      button21.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(5) == null) {
      button26.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(6) == null) {
      button31.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(7) == null) {
      button36.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(8) == null) {
      button41.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(9) == null) {
      button46.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(10) == null) {
      button51.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(11) == null) {
      button56.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(12) == null) {
      button61.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(13) == null) {
      button66.setDisable(false);
    }
    if (spel.getSpelare().get(0).getResultatLista().getResultat(14) == null) {
      button71.setDisable(false);
    }
  }

  public void aktiveraKnapparSpelare2(){

    if (spel.getSpelare().get(1).getResultatLista().getResultat(0) == null) {
      button2.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(1) == null) {
      button7.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(2) == null) {
      button12.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(3) == null) {
      button17.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(4) == null) {
      button22.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(5) == null) {
      button27.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(6) == null) {
      button32.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(7) == null) {
      button37.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(8) == null) {
      button42.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(9) == null) {
      button47.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(10) == null) {
      button52.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(11) == null) {
      button57.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(12) == null) {
      button62.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(13) == null) {
      button67.setDisable(false);
    }
    if (spel.getSpelare().get(1).getResultatLista().getResultat(14) == null) {
      button72.setDisable(false);
    }
  }

  public void aktiveraKnapparSpelare3(){

    if (spel.getSpelare().get(2).getResultatLista().getResultat(0) == null) {
      button3.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(1) == null) {
      button8.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(2) == null) {
      button13.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(3) == null) {
      button18.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(4) == null) {
      button23.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(5) == null) {
      button28.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(6) == null) {
      button33.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(7) == null) {
      button38.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(8) == null) {
      button43.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(9) == null) {
      button48.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(10) == null) {
      button53.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(11) == null) {
      button58.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(12) == null) {
      button63.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(13) == null) {
      button68.setDisable(false);
    }
    if (spel.getSpelare().get(2).getResultatLista().getResultat(14) == null) {
      button73.setDisable(false);
    }
  }

  public void aktiveraKnapparSpelare4(){

    if (spel.getSpelare().get(3).getResultatLista().getResultat(0) == null) {
      button4.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(1) == null) {
      button9.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(2) == null) {
      button14.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(3) == null) {
      button19.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(4) == null) {
      button24.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(5) == null) {
      button29.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(6) == null) {
      button34.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(7) == null) {
      button39.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(8) == null) {
      button44.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(9) == null) {
      button49.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(10) == null) {
      button54.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(11) == null) {
      button59.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(12) == null) {
      button64.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(13) == null) {
      button69.setDisable(false);
    }
    if (spel.getSpelare().get(3).getResultatLista().getResultat(14) == null) {
      button74.setDisable(false);
    }
  }

  public void aktiveraKnapparSpelare5(){

    if (spel.getSpelare().get(4).getResultatLista().getResultat(0) == null) {
      button5.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(1) == null) {
      button10.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(2) == null) {
      button15.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(3) == null) {
      button20.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(4) == null) {
      button25.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(5) == null) {
      button30.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(6) == null) {
      button35.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(7) == null) {
      button40.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(8) == null) {
      button45.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(9) == null) {
      button50.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(10) == null) {
      button55.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(11) == null) {
      button60.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(12) == null) {
      button65.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(13) == null) {
      button70.setDisable(false);
    }
    if (spel.getSpelare().get(4).getResultatLista().getResultat(14) == null) {
      button75.setDisable(false);
    }
  }

  public void inaktiveraKnapparSpelare1(){

    button1.setDisable(true);
    button6.setDisable(true);
    button11.setDisable(true);
    button16.setDisable(true);
    button21.setDisable(true);
    button26.setDisable(true);
    button31.setDisable(true);
    button36.setDisable(true);
    button41.setDisable(true);
    button46.setDisable(true);
    button51.setDisable(true);
    button56.setDisable(true);
    button61.setDisable(true);
    button66.setDisable(true);
    button71.setDisable(true);

  }

  public void inaktiveraKnapparSpelare2(){

    button2.setDisable(true);
    button7.setDisable(true);
    button12.setDisable(true);
    button17.setDisable(true);
    button22.setDisable(true);
    button27.setDisable(true);
    button32.setDisable(true);
    button37.setDisable(true);
    button42.setDisable(true);
    button47.setDisable(true);
    button52.setDisable(true);
    button57.setDisable(true);
    button62.setDisable(true);
    button67.setDisable(true);
    button72.setDisable(true);

  }

  public void inaktiveraKnapparSpelare3(){

    button3.setDisable(true);
    button8.setDisable(true);
    button13.setDisable(true);
    button18.setDisable(true);
    button23.setDisable(true);
    button28.setDisable(true);
    button33.setDisable(true);
    button38.setDisable(true);
    button43.setDisable(true);
    button48.setDisable(true);
    button53.setDisable(true);
    button58.setDisable(true);
    button63.setDisable(true);
    button68.setDisable(true);
    button73.setDisable(true);

  }

  public void inaktiveraKnapparSpelare4(){

    button4.setDisable(true);
    button9.setDisable(true);
    button14.setDisable(true);
    button19.setDisable(true);
    button24.setDisable(true);
    button29.setDisable(true);
    button34.setDisable(true);
    button39.setDisable(true);
    button44.setDisable(true);
    button49.setDisable(true);
    button54.setDisable(true);
    button59.setDisable(true);
    button64.setDisable(true);
    button69.setDisable(true);
    button74.setDisable(true);

  }

  public void inaktiveraKnapparSpelare5(){

    button5.setDisable(true);
    button10.setDisable(true);
    button15.setDisable(true);
    button20.setDisable(true);
    button25.setDisable(true);
    button30.setDisable(true);
    button35.setDisable(true);
    button40.setDisable(true);
    button45.setDisable(true);
    button50.setDisable(true);
    button55.setDisable(true);
    button60.setDisable(true);
    button65.setDisable(true);
    button70.setDisable(true);
    button75.setDisable(true);

  }
  
  public void inaktiveraCheckboxar(){

    checkBox1.setDisable(true);
    checkBox2.setDisable(true);
    checkBox3.setDisable(true);
    checkBox4.setDisable(true);
    checkBox5.setDisable(true);

  }

  public void aktiveraCheckboxar(){

    checkBox1.setDisable(false);
    checkBox2.setDisable(false);
    checkBox3.setDisable(false);
    checkBox4.setDisable(false);
    checkBox5.setDisable(false);

  }
}
