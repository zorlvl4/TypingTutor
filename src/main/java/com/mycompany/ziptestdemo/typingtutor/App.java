package com.mycompany.ziptestdemo.typingtutor;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    private int currentText = 0;
    private int correct = 0;
    private int incorrect = 0;
    
    @Override
    public void start(Stage stage) {
        TextField inputTextField = new TextField();
        inputTextField.setEditable(false);
        
        TextField typedTextField = new TextField();
        typedTextField.setEditable(false);
        
        Label keyPressedLabel = new Label("Key pressed: None");
        
        Label correctLabel = new Label("Correct: 0");
        Label incorrectLabel = new Label("Incorrect: 0");
        
        Button nextButton = new Button("Next");
        Button resetButton = new Button("Reset");
        
        HBox controlBox = new HBox(15, nextButton, resetButton);
        controlBox.setAlignment(Pos.CENTER);
        
        HBox statisticsBox = new HBox(30, correctLabel, incorrectLabel);
        statisticsBox.setAlignment(Pos.CENTER);
        
        Map<KeyCode, Button> keyboard = new HashMap<>();
        
        Button q = new Button("Q");
        Button w = new Button("W");
        Button e = new Button("E");
        Button r = new Button("R");
        Button t = new Button("T");
        Button y = new Button("Y");
        Button u = new Button("U");
        Button i = new Button("I");
        Button o = new Button("O");
        Button p = new Button("P");
        
        keyboard.put(KeyCode.Q, q);
        keyboard.put(KeyCode.W, w);
        keyboard.put(KeyCode.E, e);
        keyboard.put(KeyCode.R, r);
        keyboard.put(KeyCode.T, t);
        keyboard.put(KeyCode.Y, y);
        keyboard.put(KeyCode.U, u);
        keyboard.put(KeyCode.I, i);
        keyboard.put(KeyCode.O, o);
        keyboard.put(KeyCode.P, p);
    }

    public static void main(String[] args) {
        launch();
    }

}