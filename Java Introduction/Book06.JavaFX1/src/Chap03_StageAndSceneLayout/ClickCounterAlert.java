package Chap03_StageAndSceneLayout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/* Listing 3.2, P612
 * Program demonstrates displaying a message box using Alert class - how many times a user clicked a button
 * Alert dialogs 
    » AlertType.CONFIRMATION, which prompts the user to confirm an action.
    » AlertType.ERROR, which display an error message.
    » AlertType.INFORMATION, which displays an information dialog box.
    » AlertType.WARNING, which displays a warning message.
    » AlertType.NONE, which display a generic alert dialog
 * Control buttons that appear on Alert box, using optional ButtonType parameter
 * showAndWait method used to determine which button the user clicked.
    - value returned is an object of type Optional
    - test whether user clicked a button ny calling isPresent method, then call get method to retrieve the result
 *
 * @author Neo
 */
public class ClickCounterAlert extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    Button btn;
    Label lbl;
    int iClickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        // Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());
        // Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 250, 150);
        // Add the scene to the stage, set the title
        // and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();
    }

    public void buttonClick() {                                                 //Alert box used to display number of times button has been clicked
        iClickCount++;
        if (iClickCount == 1) {
            Alert a = new Alert(Alert.AlertType.INFORMATION,                    //Alert dialogue prompts user to confirm an actiobe
                    "You have clicked once.");
            a.showAndWait();                                                    //showAndWait method called - determines which button user clicked and tests value returned 
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked "
                    + iClickCount + " times.");
            a.showAndWait();
        }
    }
}
