package com.example.dogedice;

//Niclas regel/info javafx

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.text.Text;

public class Info extends Application {
  public static void main(String[] args) {
    // Start the JavaFX application by calling launch().
    launch(args);
  }

  // Override the start() method.
  public void start(Stage myStage) {

    //Skapar en vertikal flowpane för att separera regler och info text
    FlowPane reglerInfo = new FlowPane(Orientation.VERTICAL);
    reglerInfo.setVgap(30);
    reglerInfo.setAlignment(Pos.CENTER);

    Label regelLabel = new Label("Regler");
    regelLabel.setStyle("-fx-font-size: 30pt");

    //Skapar ett text objekt för regel text.
    Text regelText = new Text();
    //Regeltext.
    regelText.setText("Yatzy g"+(char) 229+"r ut p"+(char) 229+" att med hj"+(char) 228+"lp av 5 t"+(char) 228+"rningar samla ihop " +
        "\ns"+(char) 229+" m"+(char) 229+"nga po"+(char) 228+"ng som m"+(char) 246+"jligt. " +
        "\nMan sl"+(char) 229+"r sina 5 t"+(char) 228+"rningar, alla p"+(char) 229+" en g"+(char) 229+"ng" +
        "\noch f"+(char) 229+"r upprepa detta maximalt 3ggr under ens tur. " +
        "\nEfter varje slag avg"+(char) 246+"r spelaren vilka av t"+(char) 228+"rningarna denne vill spara" +
        "\noch vilka som ska sl"+(char) 229+"s om." +
        "\nEfter varje slagomg"+(char) 229+"ng m"+(char) 229+"ste spelaren f"+(char) 246+"ra in sitt slag " +
        "\nn"+(char) 229+"gonstans p"+(char) 229+" sin yatzy spelplan. " +
        "\nMisslyckas man med detta "+(char) 228+"r man tvungen att stryka n"+(char) 229+"got " +
        "\nfr"+(char) 229+"n spelplanen, strykning = noll po"+(char) 228+"ng. " +
        "\nMan beh"+(char) 246+"ver inte f"+(char) 246+"lja spelplanen uppifr"+(char) 229+"n och ner, " +
        "\nutan man kan f"+(char) 246+"ra in sin slagomg"+(char) 229+"ng i valfri ruta. " +
        "\nSpelet "+(char) 228+"r slut n"+(char) 228+"r alla spelare har skrivit n"+(char) 229+"got i samtliga rutor." +
        "\nD"+(char) 229+" r"+(char) 228+"knas po"+(char) 228+"ngen samman och spelaren med flest po"+(char) 228+"ng vinner.");

    //Skapar ett text objekt för info text.
    Text infoText = new Text();
    //Info om oss.
    infoText.setText("Vi som skapat detta spel heter Karin, Niclas, Mohamed och Ronald");

    Scene infoSida = new Scene(reglerInfo, 400, 500);

    myStage.setTitle("YATZY");
    myStage.setScene(infoSida);

    //Bild eller Text "Tillbaka" på knappen.
    Button tillbaka = new Button();
    tillbaka.setStyle("-fx-padding: 10 50 10 50; -fx-background-image: url('https://www.searchpng.com/wp-content/uploads/2019/02/Back-Arrow-Icon-PNG-1024x1024.png'); -fx-background-size: 135px 65px; -fx-background-repeat: no-repeat; -fx-background-position: center");
    tillbaka.setAlignment(Pos.BOTTOM_LEFT);

    reglerInfo.getChildren().addAll(regelLabel, regelText, infoText, tillbaka);

    myStage.show();

  }
}

