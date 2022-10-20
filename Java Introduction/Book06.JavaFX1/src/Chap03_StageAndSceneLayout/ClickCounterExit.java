package Chap03_StageAndSceneLayout;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/* Listing 3.3, P622
 * Program demonstrates how to exit the stage
 * » Adding a button, menu command, or other way for the user to signal that she wishes to close the program.
    Many programs include a button labeled Exit or Close, and programs that use 
    a menu usually have an Exit command.
    » Optionally displaying a confirmation box that verifies whether the 
    user really wants to close the program. You can do that by using the 
    ConfirmationBox class 
 * » If the user really does want to close the program, the program should 
     perform any necessary clean-up work, such as
        • Saving changes to documents, databases, or other files.
        • Properly closing databases and other resources.
   » After you’ve done any necessary clean-up work, you can close the 
     application by calling the primary stage’s close method.
   » The verification and clean-up steps should be taken whether the user 
    attempts to close the program by using a button or menu command you’ve 
    provided in your user interface or by clicking the built-in window close button.

 * Handling the CloseRequest event
   ----------------------------------------
    - Provide user with Close button but can exit app using X button
    - This terminates the app
    - To prevent this, generate CloseRequest event which is sent to the stage

 * @author Neo
 */
public class ClickCounterExit extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    Stage stage;
    int iClickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        // Create the Click Me button
        Button btnClickMe = new Button();
        btnClickMe.setText("Click me please!");
        btnClickMe.setOnAction(e -> btnClickMe_Click());
        // Create the Close button                                  
        Button btnClose = new Button();
        btnClose.setText("Close");                          
        btnClose.setOnAction(e -> btnClose_Click());                            //btnClose method
        // Add the buttons to a layout pane
        VBox pane = new VBox(10);
        pane.getChildren().addAll(btnClickMe, btnClose);
        pane.setAlignment(Pos.CENTER);
        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 250, 150);
        // Finish and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.setOnCloseRequest                                          //setOnCloseRequest event handler method of Stage class    
        (e                                                                      //CloseRequest event object = e
                -> {                                                                    
            e.consume();                                                        //consume method of CloseRequest event object. Consuming event
                                                                                //causes stopped in its tracks within the event handler, 
                                                                                //automatically closing the stage when the event handler ends is prevented
            btnClose_Click();
        });
        primaryStage.show();
    }

    public void btnClickMe_Click() {
        iClickCount++;
        if (iClickCount == 1) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked once.");
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked "
                    + iClickCount + " times.");
            a.showAndWait();
        }
    }

    public void btnClose_Click() {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION,
                "Are you sure you want to quit?",
                ButtonType.YES, ButtonType.NO);                                 //btn type to be selected by user included in alert dialog box
        Optional<ButtonType> confirm = a.showAndWait();                         //type Optional, with element ButtonType returns value from showAndWait method
        if (confirm.isPresent() && confirm.get()                                //isPresent from Optional class - determine value present in Optional Instance
                                                                                //get method finds specific method of this class
                == ButtonType.YES) {
            stage.close();                                                      //event handler calls primary stage to close the app
        }
    }
}