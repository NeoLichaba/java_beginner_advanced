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

/* Listing 2.4, P597
   Program makes use of lambda expressions to handle button clicks
 * A lambda expression lets you create an anonymous class that implements a specific type of interface — a 
   functional interface
 * parameter types are separated from the method body by a new operator — the arrow operator
 * No need to know the name of the interface being implemented
 * when lambda expression used in call to setOnAction, compiler will deduce that lambda expression will implement EventHandler interface
 * method body is an implementation of handle method
 * @author Neo
 */
public class AddSubtract4 extends Application {

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
        btnAdd.setOnAction
        (e                                                                      //lambda expression implements a functional interface - only 1 functionality to exhibit
                                                                                //single method accepts a single parameter, identified as e
                ->                                                              //event handler added to Add button
                {
                    iCounter++;                                                 //iCounter variable increments every time btn clicked
                    lbl.setText(Integer.toString(iCounter));                    //text in label set to reflect iCounter number
                });
        // Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction
        (e
                ->                                                              //
                {
                    iCounter--;                                                 //iCounter variable decrements
                    lbl.setText(Integer.toString(iCounter));
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
