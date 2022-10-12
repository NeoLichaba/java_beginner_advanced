package Chap01_HelloJavaFX;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/* Listing 1.2, P578
 * Program displays the amount of time a user clicks a button
 * @author Neo
 */
public class ClickCounter extends Application                                   //JavaFX application
{

    public static void main(String[] args)                                      
    {
        launch(args);                                                           //instance of ClickCounter is created
                                                                                //calling start method
    }
    Button btn;                                                                 //Button declared a clas variable
    Label lbl;                                                                  //Label control
    int iClickCount = 0;                                                        //iClickCount keeps track number of times user clicks button
                                
    @Override                                                                   //start method overriden 
    public void start(Stage primaryStage)                                       //parameters accepted - primary stage = window presented to user 
    {
        // Create the button
        btn = new Button();                                                     //button created with btn variable
        btn.setText("Click me please!");                                        //setText method called and displays message to user
        btn.setOnAction(e -> buttonClick());                                    ////method setOnAction called of btn class when btnClicked (event Handler)
                                                                                //e - object of ActionEvent
        // Create the Label
        lbl = new Label();                                                      //new Label created
        lbl.setText("You have not clicked the button.");                        //setText method called and set to initial value - message displayed
        // Add the label and the button to a layout pane
        BorderPane pane = new BorderPane();                                     //borderpane created by calling constructor of bp class, variable pane
                                                                                //bp = used to control layout of controls of displayed on screen
        pane.setTop(lbl);                                                       //setTop method from bp class - called to add label to the top of the bp
        pane.setCenter(btn);                                                    //setCenter - adds button to the center region of bp
        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 250, 150);                                //scene object created - calling constructor of Scene class
                                                                                //parameters passed: pane - root node of scene
                                                                                //250 - width, 150 - height (pixels)
        // Add the scene to the stage, set the title
        // and show the stage
        primaryStage.setScene(scene);                                           //setScene method adds scene to primary stage
        primaryStage.setTitle("Click Counter");                                 //setTitle method called - text displayed in primary stage bar
        primaryStage.show();                                                    //show method displays primary stage 
    }

    public void buttonClick()                                                   //called whenever user clicks a button
    {
        iClickCount++;                                                          //iClickCount increments everytime user clicks button
        if (iClickCount == 1)                                                   //if statement verifies if button clicked
        {
            lbl.setText("You have clicked once.");                              //label text set to message accepted    
        } else {
            lbl.setText("You have clicked "                                     //label text set to number of times btn clicked
                    + iClickCount + " times.");
        }
    }
}
         