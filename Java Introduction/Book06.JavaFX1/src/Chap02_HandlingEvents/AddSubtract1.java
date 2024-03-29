package Chap02_HandlingEvents;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

/* Listing 2.1, P587
 * Program demonstrates implementation of an EventHandler
 * Displays a label and 2 buttons (Add/Subtract)
 * Each time the user clicks, value is displayed
 * @author Neo
 */
public class AddSubtract1 extends Application
        implements EventHandler<ActionEvent>                                    //defines a handle method that will handle ActionEvent
                                                                                //events, actioned by buttons
{

    public static void main(String[] args)                                              
    {
        launch(args);                                                           //instance of AbstractClass created by launch method, subsequently calls start method        
    }
    Button btnAdd;                                                              //buttons and labels declared as class variables
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;                                                           //iCounter keeps track of value displayed by label

    @Override
    public void start(Stage primaryStage)                                       //start method called at start of app
    {
        // Create the Add button
        btnAdd = new Button();                                                  //instance of add Button created
        btnAdd.setText("Add");                                                  //Add button
        btnAdd.setOnAction(this);                                               //setOnAction - eventHandler for btnAdd button
                                                                                //this - AddSubtract1 class implements EventHandler
        // Create the Subtract button
        btnSubtract = new Button();                                             //instance of subtract button created
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(this);                                          //eventHandler for button
        // Create the Label                                                     label created
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));                                //setText method called, casted to an integer and sets string version of iCounter variable
        // Add the buttons and label to an HBox pane
        HBox pane = new HBox(10);                                               //HBox - layout pane; controls arranged horizontally
                                                                                //space of 10 pixels between each button
        pane.getChildren().addAll(lbl, btnAdd, btnSubtract);                    //label and buttons added to HBox;
        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 200, 75);                                 //scene displays layout pane
                                                                                //scene class constructor called - accepts 3 arguments
                                                                                //pane - root node to be displayed by the scene; width and height
        // Add the scene to the stage, set the title
        // and show the stage
        primaryStage.setScene(scene);                                           //scene created - primary stage of scene
        primaryStage.setTitle("Add/Sub");                                   
        primaryStage.show();                                                    //display stage
    }

    @Override
    public void handle(ActionEvent e)                                           //EventHandler interface implemented through handle method
                                                                                //ActionEvent - event generated by button click and passed
    {
        if (e.getSource() == btnAdd)                                            //getSource of ActionEvent called to det source 
        {
            iCounter++;                                                         //iCounter variable incremented if add btn clicked
        } else {
            if (e.getSource() == btnSubtract)                                   //getSource of ActionEvent called to det source
            {
                iCounter--;                                                     //oCounter variable decrements if so
            }
        }
        lbl.setText(Integer.toString(iCounter));                                //label's setText returns string of iCounter value
    }
}
