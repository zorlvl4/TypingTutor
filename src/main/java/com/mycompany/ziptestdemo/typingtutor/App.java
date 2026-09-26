package com.mycompany.ziptestdemo.typingtutor;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

    private String currentText;
    private int correct = 0;
    private int incorrect = 0;

    private boolean shiftPressed = false;

    private String[] texts = {
        "Try typing this text. Do it as quickly and as accurately as you can.",
        "Next type another line of input data.",
        "The quick brown fox jumps over the lazy dog.",
        "Five big quacking zephyrs jolt my wax bed.",
        "Sympathizing would fix Quaker objectives.",
        "A large fawn jumped quickly over the white zinc boxes."
    };

    @Override
    public void start(Stage stage) {

        currentText = texts[0];

        Label textLabel = new Label("Text to type");
        TextField text = new TextField(currentText);
        text.setEditable(false);

        Label responseLabel = new Label("Your response");
        TextField response = new TextField();
        response.setEditable(false);

        Label counterLabel = new Label("1 of 6");
        Label keyPressedLabel = new Label("Key pressed: ");
        Label correctLabel = new Label("Correct: 0");
        Label incorrectLabel = new Label("Incorrect: 0");

        Button nextButton = new Button("Next");
        Button resetButton = new Button("Reset");

        VBox root = new VBox(10);
        root.setPadding(new Insets(15));
        root.setAlignment(Pos.CENTER);

        HBox information = new HBox(15);
        information.setAlignment(Pos.CENTER);

        information.getChildren().addAll(
                counterLabel,
                nextButton,
                resetButton,
                keyPressedLabel,
                correctLabel,
                incorrectLabel
        );

        /*
         * Map connects a physical keyboard key to its
         * matching virtual button.
         */
        Map<KeyCode, Button> keyboard = new HashMap<>();

        // First row
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

        HBox row1 = new HBox(5);
        row1.setAlignment(Pos.CENTER);
        row1.getChildren().addAll(q, w, e, r, t, y, u, i, o, p);

        // Second row
        Button a = new Button("A");
        Button s = new Button("S");
        Button d = new Button("D");
        Button f = new Button("F");
        Button g = new Button("G");
        Button h = new Button("H");
        Button j = new Button("J");
        Button k = new Button("K");
        Button l = new Button("L");

        HBox row2 = new HBox(5);
        row2.setAlignment(Pos.CENTER);
        row2.getChildren().addAll(a, s, d, f, g, h, j, k, l);

        // Third row
        Button shiftLeft = new Button("Shift");
        Button z = new Button("Z");
        Button x = new Button("X");
        Button c = new Button("C");
        Button v = new Button("V");
        Button b = new Button("B");
        Button n = new Button("N");
        Button m = new Button("M");
        Button shiftRight = new Button("Shift");

        HBox row3 = new HBox(5);
        row3.setAlignment(Pos.CENTER);
        row3.getChildren().addAll(
                shiftLeft, z, x, c, v, b, n, m, shiftRight
        );

        // Fourth row
        Button backspace = new Button("Backspace");
        Button space = new Button("Space");

        HBox row4 = new HBox(5);
        row4.setAlignment(Pos.CENTER);
        row4.getChildren().addAll(backspace, space);

        q.setPrefSize(50, 40);
        w.setPrefSize(50, 40);
        e.setPrefSize(50, 40);
        r.setPrefSize(50, 40);
        t.setPrefSize(50, 40);
        y.setPrefSize(50, 40);
        u.setPrefSize(50, 40);
        i.setPrefSize(50, 40);
        o.setPrefSize(50, 40);
        p.setPrefSize(50, 40);

        a.setPrefSize(50, 40);
        s.setPrefSize(50, 40);
        d.setPrefSize(50, 40);
        f.setPrefSize(50, 40);
        g.setPrefSize(50, 40);
        h.setPrefSize(50, 40);
        j.setPrefSize(50, 40);
        k.setPrefSize(50, 40);
        l.setPrefSize(50, 40);

        shiftLeft.setPrefSize(80, 40);
        shiftRight.setPrefSize(80, 40);

        z.setPrefSize(50, 40);
        x.setPrefSize(50, 40);
        c.setPrefSize(50, 40);
        v.setPrefSize(50, 40);
        b.setPrefSize(50, 40);
        n.setPrefSize(50, 40);
        m.setPrefSize(50, 40);

        backspace.setPrefSize(100, 40);
        space.setPrefSize(250, 40);

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

        keyboard.put(KeyCode.A, a);
        keyboard.put(KeyCode.S, s);
        keyboard.put(KeyCode.D, d);
        keyboard.put(KeyCode.F, f);
        keyboard.put(KeyCode.G, g);
        keyboard.put(KeyCode.H, h);
        keyboard.put(KeyCode.J, j);
        keyboard.put(KeyCode.K, k);
        keyboard.put(KeyCode.L, l);

        keyboard.put(KeyCode.Z, z);
        keyboard.put(KeyCode.X, x);
        keyboard.put(KeyCode.C, c);
        keyboard.put(KeyCode.V, v);
        keyboard.put(KeyCode.B, b);
        keyboard.put(KeyCode.N, n);
        keyboard.put(KeyCode.M, m);

        keyboard.put(KeyCode.SPACE, space);
        keyboard.put(KeyCode.BACK_SPACE, backspace);
        keyboard.put(KeyCode.SHIFT, shiftLeft);

        q.setFocusTraversable(false);
        w.setFocusTraversable(false);
        e.setFocusTraversable(false);
        r.setFocusTraversable(false);
        t.setFocusTraversable(false);
        y.setFocusTraversable(false);
        u.setFocusTraversable(false);
        i.setFocusTraversable(false);
        o.setFocusTraversable(false);
        p.setFocusTraversable(false);

        a.setFocusTraversable(false);
        s.setFocusTraversable(false);
        d.setFocusTraversable(false);
        f.setFocusTraversable(false);
        g.setFocusTraversable(false);
        h.setFocusTraversable(false);
        j.setFocusTraversable(false);
        k.setFocusTraversable(false);
        l.setFocusTraversable(false);

        z.setFocusTraversable(false);
        x.setFocusTraversable(false);
        c.setFocusTraversable(false);
        v.setFocusTraversable(false);
        b.setFocusTraversable(false);
        n.setFocusTraversable(false);
        m.setFocusTraversable(false);

        shiftLeft.setFocusTraversable(false);
        shiftRight.setFocusTraversable(false);
        backspace.setFocusTraversable(false);
        space.setFocusTraversable(false);
        
       q.setOnAction(event -> response.appendText(shiftPressed ? "Q" : "q")); 
       w.setOnAction(event -> response.appendText(shiftPressed ? "W" : "w")); 
       e.setOnAction(event -> response.appendText(shiftPressed ? "E" : "e")); 
       r.setOnAction(event -> response.appendText(shiftPressed ? "R" : "r")); 
       t.setOnAction(event -> response.appendText(shiftPressed ? "T" : "t")); 
       y.setOnAction(event -> response.appendText(shiftPressed ? "Y" : "y")); 
       u.setOnAction(event -> response.appendText(shiftPressed ? "U" : "u")); 
       i.setOnAction(event -> response.appendText(shiftPressed ? "I" : "i")); 
       o.setOnAction(event -> response.appendText(shiftPressed ? "O" : "o")); 
       p.setOnAction(event -> response.appendText(shiftPressed ? "P" : "p")); 
       a.setOnAction(event -> response.appendText(shiftPressed ? "A" : "a")); 
       s.setOnAction(event -> response.appendText(shiftPressed ? "S" : "s")); 
       d.setOnAction(event -> response.appendText(shiftPressed ? "D" : "d")); 
       f.setOnAction(event -> response.appendText(shiftPressed ? "F" : "f")); 
       g.setOnAction(event -> response.appendText(shiftPressed ? "G" : "g")); 
       h.setOnAction(event -> response.appendText(shiftPressed ? "H" : "h")); 
       j.setOnAction(event -> response.appendText(shiftPressed ? "J" : "j")); 
       k.setOnAction(event -> response.appendText(shiftPressed ? "K" : "k")); 
       l.setOnAction(event -> response.appendText(shiftPressed ? "L" : "l")); 
       z.setOnAction(event -> response.appendText(shiftPressed ? "Z" : "z")); 
       x.setOnAction(event -> response.appendText(shiftPressed ? "X" : "x")); 
       c.setOnAction(event -> response.appendText(shiftPressed ? "C" : "c")); 
       v.setOnAction(event -> response.appendText(shiftPressed ? "V" : "v")); 
       b.setOnAction(event -> response.appendText(shiftPressed ? "B" : "b")); 
       n.setOnAction(event -> response.appendText(shiftPressed ? "N" : "n")); 
       m.setOnAction(event -> response.appendText(shiftPressed ? "M" : "m"));
       
       space.setOnAction(event -> response.appendText(" "));
       
       backspace.setOnAction(event -> { 
           if (response.getText().length() > 0) { 
               response.deleteText( 
                       response.getText().length() - 1, 
                       response.getText().length() 
               ); 
           } 
       });
       
       shiftLeft.setOnAction(event -> { 
           shiftPressed = !shiftPressed; if (shiftPressed) { 
               shiftLeft.setStyle("-fx-background-color: lightblue;"); 
               shiftRight.setStyle("-fx-background-color: lightblue;"); 
           } else { 
               shiftLeft.setStyle(""); 
               shiftRight.setStyle(""); 
           } 
       });
       
       shiftRight.setOnAction(event -> { 
           shiftPressed = !shiftPressed; if (shiftPressed) { 
               shiftLeft.setStyle("-fx-background-color: lightblue;"); 
               shiftRight.setStyle("-fx-background-color: lightblue;"); } 
           else { 
               shiftLeft.setStyle(""); 
               shiftRight.setStyle(""); 
           } 
       });
       
       root.setOnKeyPressed(event -> {
           KeyCode key = event.getCode();
           
           if (keyboard.containsKey(key)) { 
               keyboard.get(key).setStyle( 
                       "-fx-background-color: lightblue;" 
               ); 
               
               keyPressedLabel.setText( 
                       "Key pressed: " + event.getText() 
               ); 
           } else { 
               keyPressedLabel.setText( 
                       "Key pressed: Not handled" 
               ); 
               keyPressedLabel.setStyle("-fx-text-fill: red;"); 
           }
           
           if (key == KeyCode.SHIFT) { 
               shiftPressed = true; 
               shiftLeft.setStyle("-fx-background-color: lightblue;"); 
               shiftRight.setStyle("-fx-background-color: lightblue;"); 
           }
           
           if (key == KeyCode.BACK_SPACE) {
               if (response.getText().length() > 0) { 
                   String removed = response.getText().substring( 
                           response.getText().length() - 1 
                   );
                   response.deleteText( 
                           response.getText().length() - 1, 
                           response.getText().length() 
                   ); 
                   
                   int position = response.getText().length(); 
                   
                    if (position < currentText.length()) { 
                       if (removed.equals( 
                               String.valueOf(currentText.charAt(position)))) { 
                           correct--;
                    } else { 
                           incorrect--;
                    }
                }
               
                correctLabel.setText("Correct: " + correct); 
                incorrectLabel.setText("Incorrect: " + incorrect);
            }
           
           return;
       }
           
           String character = event.getText();
       
            if (character != null 
                    && character.length() > 0 
                    && response.getText().length() < currentText.length()) { 
                 response.appendText(character);
                 int position = response.getText().length() - 1; 

                 if (character.charAt(0) == currentText.charAt(position)) { 
                     correct++;
                 } 
                 else { 
                     incorrect++;
                 } 

                 correctLabel.setText("Correct: " + correct); 
                 incorrectLabel.setText("Incorrect: " + incorrect); 
            }
        });
       
       nextButton.setOnAction(event -> {
            int next = 0;
            
            for (int i = 0; i < texts.length; i++) { 
                if (texts[i].equals(currentText)) { 
                    next = i + 1;
                    break; 
                } 
            } 
          
            if (next >= texts.length) { 
                next = 0;
            }
            
            currentText = texts[next]; 
            text.setText(currentText); 
            response.clear(); 
            correct = 0; 
            incorrect = 0; 
            correctLabel.setText("Correct: 0");
            incorrectLabel.setText("Incorrect: 0");
            
           counterLabel.setText( 
                   (next + 1) + " of " + texts.length 
           ); 
           
           keyPressedLabel.setText("Key pressed: "); 
           keyPressedLabel.setStyle(""); 
           shiftPressed = false; 
           shiftLeft.setStyle(""); 
           shiftRight.setStyle("");
           
           for (Button button : keyboard.values()) { 
               button.setStyle("");
           }  
           root.requestFocus();
        });
       
       resetButton.setOnAction(event -> {
           currentText = texts[0]; 
           text.setText(currentText); 
           response.clear(); 
           correct = 0; 
           incorrect = 0; 
           correctLabel.setText("Correct: 0"); 
           incorrectLabel.setText("Incorrect: 0"); 
           counterLabel.setText("1 of " + texts.length); 
           keyPressedLabel.setText("Key pressed: "); 
           keyPressedLabel.setStyle(""); 
           shiftPressed = false; 
           shiftLeft.setStyle(""); 
           shiftRight.setStyle("");
           
           for (Button button : keyboard.values()) { 
               button.setStyle("");
           } 
           
           root.requestFocus();
       });
       
       
    }
        
    public static void main(String[] args) {
        launch(args);
    }
}

