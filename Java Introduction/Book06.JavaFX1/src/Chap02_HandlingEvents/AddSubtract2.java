package Chap02_HandlingEvents;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/* Program demonstrates handling an event with inner classes - commonly used for event handlers
 * 
 * @author Neo
 */
public class AddSubtract2 extends Application {                                 //doesn't implement eventHandler

    public static void main(String[] args) {
        launch(args);
    }
    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) {
        // Create a ClickHandler instance
        ClickHandler ch = new ClickHandler();                                   //instance of ClickHandler created
        // Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(ch);                                                 //setOnAction method called - accepts ch event handler for Add btn
        // Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");                        
        btnSubtract.setOnAction(ch);                                            //ch - event handler for subtract button set
        // Create the Label
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));
        // Add the buttons and label to an HBox pane
        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 200, 75);
        // Add the scene to the stage, set the title
        // and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/Sub");
        primaryStage.show();
    }

    private class ClickHandler                                                  //inner class, placed within the AddSubtract class
            implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e)                                       //handle method inner class
        {
            if (e.getSource() == btnAdd) {
                iCounter++;
            } else {
                if (e.getSource() == btnSubtract) {
                    iCounter--;
                }
            }
            lbl.setText(Integer.toString(iCounter));
        }
    }
}
