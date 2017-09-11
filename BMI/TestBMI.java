package BMI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Scene;

import java.awt.*;

public class TestBMI extends Application {

    BMI bmi = new BMI();
    private TextField weitht = new TextField();
    private TextField getWeitht = new TextField();
    private TextField height = new TextField();
    private TextField getHeight = new TextField();
    private Button btCalculate = new Button("Calculate");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(new Label("weight:"),0,0);
        gridPane.add(new Label("height:"),0,1);
        gridPane.add(btCalculate,1,5);

        gridPane.setAlignment(Pos.CENTER);
       weight.setAlignment(Pos.BOTTOM_RIGHT);

    }


}
