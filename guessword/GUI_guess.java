package guessword;
/**
 * Created by lmsj0 on 9/18/2017.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Scanner;

public class GUI_guess extends Application {
    private TextField tinput = new TextField();
    private TextField tinput1 =  new TextField();
    private TextField tinput2 = new TextField();
    private Button bsubmit = new Button("submit");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(new Label("input a letter: "), 0, 0);

        gridPane.add(tinput, 1, 0);
        gridPane.add(tinput1,1,1);
        gridPane.add(tinput2,1,3);

        gridPane.add(bsubmit,1,5);



        gridPane.setAlignment(Pos.CENTER);

        bsubmit.setOnAction(event -> guessw());

        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("Guess");

        primaryStage.setScene(scene);
        primaryStage.show();

    }

        public void guessw(){
        Guess guess = new Guess();
        String input = tinput.getText();
        guess.setWord(input);
        String s = guess.getWord();

        String[] g = new String[s.length()];
        for (int i = 0; i < g.length; i++) {
            g[i] = s.substring(0 + i, i + 1);
            // System.out.print(g[i]);
        }

        String a = "";
        String b[] = new String[g.length];
        String c = "";


        for (int i = 0; i < s.length(); i++) {
            b[i] = "_";
            c = c + b[i];
        }


        for (int j = 0; j <= 10; j++) {
            guess.setAnswer(input);
            a = guess.getAnswer();
            tinput1.setText(a);
            for (int i = 0; i < g.length; i++) {
                if (g[i].equals(a)) {

                    b[i] = a;

                } else {

                }
            }
            Arrays.equals(b, g);

            print(b);
            if (Arrays.equals(b, g) == true) {
                //System.out.println();
                tinput2.setText("bingo, you win!");
                break;
            }

        }

    }

    private static void print(String[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }


}


