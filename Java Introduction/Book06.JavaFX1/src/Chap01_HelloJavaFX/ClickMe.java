
package Chap01_HelloJavaFX;

/*  Listing 1.1, P6
 *  Program demonstrates the user interface for a simple JavaFX program that includes 
    a single button. Initially, the text of this button says Click me please! When 
    you click it, the text of the button changes to You clicked me! If you click the 
    button again, the text changes back to Click me please! Thereafter, each time 
    you click the button, the text cycles between Click me please! and You clicked 
    me! To quit the program, simply click the Close button (the X at the upper-right 
    corner.)

 * @author Neo
 */
import javafx.application.Application;                                          //core class on which all JavaFX applications depend
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;                                                      //container that holds all UI elements displayed by program
import javafx.scene.control.Button;                                             //individual user interface controls defined
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;                                           //layout manager - determines position of each control displayed on UI
import javafx.stage.Stage;                                                      //top level container - application's UI elements are displayed

/* Listing 1.1
 * 
 *
 * @author User
 */
public class ClickMe extends Application {                                      //extends java.application.Application class

    public static void main(String[] args) {
        launch(args);                                                           //Application class' launch method called - starts JavaFX app
                                                                                //instance of Application class is created; JavaFX lifecycle is started
    }
    Button btn;                                                                 //btn with Button type created

    @Override
    public void start(Stage primaryStage) {                                     //start method called after launch of JavaFX application
                                                                                //start method accepts parameter on which app's UI will be displayed
                                                                                //when start method called, app passes through main stage (aka primary stage parameter)
        //UI created within start method                                                                        
        // Create the button
        btn = new Button();                                                     //btn ctrl created called btn
        btn.setText("Click me please!");                                        //btn text set
        btn.setOnAction(e -> buttonClick());                                    //method setOnAction called of btn class when btnClicked (event handler)
                                                                                //e - object of ActionEvent
        // Add the button to a layout pane
        BorderPane pane = new BorderPane();                                     //instance of layout pane created - border pane
                                                                                //contents arranged into 5 general regions 
                                                                                //Border pane ideal for layouts which you have elements - menu and toolbar, status,optional panes etc.
        pane.setCenter(btn);
        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 300, 250);                                //scene displays layout pane
                                                                                //scene class constructor called - accepts 3 arguments
                                                                                //pane - root node to be displayed by the scene; width and height of scene in pixels
        // Finalize and show the stage                                          represents nodes (ctls and layout panes) displayed in application
                                                                                //stage = window in which the scene is displayed     
        primaryStage.setScene(scene);                                           //setScene method of primary stage called to set the scene to be displayed
        primaryStage.setTitle("The Click Me App");                              //setTitle method - title set
        primaryStage.show();                                                    //show method called, displaying app window to user
    }

    public void buttonClick() {                                                 
        if (btn.getText() == "Click me please!") {                              //if statement uses to change text displayed by button
                                                                                //getText - returns text displayed by btn in string format
            btn.setText("You clicked me!");                                     //setText sets text displayed by the button
        } else {
            btn.setText("Click me please!");
        }
    }
}

