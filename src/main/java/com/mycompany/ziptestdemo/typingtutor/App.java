package com.mycompany.ziptestdemo.typingtutor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

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
    }

    public static void main(String[] args) {
        launch();
    }

}