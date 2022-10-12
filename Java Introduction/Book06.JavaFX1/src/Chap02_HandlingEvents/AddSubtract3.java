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

/* Listing 2.3, P594
 * Program demonstrates event handling with anon classes
 * anon class - one defined on the spot - as and when you need it
 *            - often used for event handlers
 * 
 * @author Neo
 */
public class AddSubtract3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) {
        // Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(
                new EventHandler<ActionEvent>()                                 //setOnAction method called of Add btn called
                                                                                //creates instance of EventHandler class, ActionEvent = type
        {
            @Override
            public void handle(ActionEvent e)                                   //handle method, defined within the body of the anon class
            {
                iCounter++;                                                     //increments counter variable
                lbl.setText(Integer.toString(iCounter));                        //label text displays new value of counter
            }
        });
        // Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(
                new EventHandler<ActionEvent>()                                 
        {
            @Override
            public void handle(ActionEvent e)                                   //handle method decrements iCounter variable
            {
                iCounter--;
                lbl.setText(Integer.toString(iCounter));                        //label updated to display counter value
            }
        });
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
}
