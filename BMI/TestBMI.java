package BMI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.geometry.HPos;
import javafx.scene.control.TextField;


import java.awt.*;

public class TestBMI extends Application {

    BMI bmi = new BMI();
    private TextField weight = new TextField();

    private TextField height = new TextField();
    private TextField BMI = new TextField();
    private TextField statue = new TextField();
    private Button btCalculate = new Button("Calculate");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setHgap(4);
        gridPane.setVgap(4);

        gridPane.add(new Label("weight:"),0,0);
        gridPane.add(weight,1,0);
        gridPane.add(new Label("height:"),0,1);
        gridPane.add(height,1,1);
        gridPane.add(new Label("BMI"),0,2);
        gridPane.add(BMI,1,2);
        gridPane.add(new Label("statue"),0,3);
        gridPane.add(statue,1,3);

        gridPane.add(btCalculate,1,4);

        gridPane.setAlignment(Pos.CENTER);
        weight.setAlignment(Pos.BOTTOM_RIGHT);
        GridPane.setHalignment(btCalculate,HPos.RIGHT);

        btCalculate.setOnAction(e -> calculateBMI());

        Scene scene = new Scene(gridPane,400,250);
        primaryStage.setTitle("BMI Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculateBMI(){

        double weight1 = Double.parseDouble(weight.getText());
        double height1 = Double.parseDouble(height.getText());

        BMI b = new BMI(weight1,height1);

        BMI.setText(Double.toHexString(b.getBMI()));

        statue.setText(b.fetch());
    }


}
