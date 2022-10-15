package Chap05_UserInput;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.layout.*;


/*
 *
 * @author Neo
 */
public class RolePlayer extends Application //→8
{

    public static void main(String[] args) {
        launch(args);
    }
    TextField txtCharacter; //→15                                               //variables accessible to any RolePlayer class methods
    TextField txtActor;

    @Override
    public void start(Stage primaryStage) {
        // Create the Character →20                                             label created to identify Character text box
        Label lblCharacter = new Label("Character's Name:");
        lblCharacter.setMinWidth(100);                                          //min width set
        lblCharacter.setAlignment(Pos.BOTTOM_RIGHT);                            //right justified so taht labels for that identify two text fields
        // Create the Character text field →25                                  //Character text field created
        txtCharacter = new TextField();
        txtCharacter.setMinWidth(200);
        txtCharacter.setMaxWidth(200);
        txtCharacter.setPromptText(
                "Enter the name of the character here.");                       //prompt text is set and appears within text field
        // Create the Actor label →32
        Label lblActor = new Label("Actor's Name:");                            //label created to identify Actor text field.
        lblActor.setMinWidth(100);
        lblActor.setAlignment(Pos.BOTTOM_RIGHT);                                //right aligned
        // Create the Actor text field →37
        txtActor = new TextField();
        txtActor.setMinWidth(200);      
        txtActor.setMaxWidth(200);
        txtActor.setPromptText("Enter the name of the actor here.");
        // Create the OK button →43                                             //OK button created
        Button btnOK = new Button("OK");
        btnOK.setMinWidth(75);
        btnOK.setOnAction(e -> btnOK_Click());                                  //btnOK_Click method called when user clicks button
        // Create the Character pane →48                                        //Hbox pane created with character label and text box
        HBox paneCharacter = new HBox(20, lblCharacter, txtCharacter);
        paneCharacter.setPadding(new Insets(10));
        // Create the Actor pane →52                                            //Hbox pane created with actor label
        HBox paneActor = new HBox(20, lblActor, txtActor);
        paneActor.setPadding(new Insets(10));
        // Create the Button pane →56                                           //hbox pane holds the button
        HBox paneButton = new HBox(20, btnOK);
        paneButton.setPadding(new Insets(10));
        paneButton.setAlignment(Pos.BOTTOM_RIGHT);                              
        // Add the Character, Actor, and Button panes to a VBox →61
        VBox pane = new VBox(10, paneCharacter, paneActor, paneButton);
        // Set the stage →64
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Role Player");
        primaryStage.show();
    }

    public void btnOK_Click() //→71                                             //method called whenever the user clicks OK    
    {
        String errorMessage = ""; //→73                                         variable holds data informing user of missing data
        if (txtCharacter.getText().length() == 0) //→75                         ensures data entered into character text box; error msg created if not
        {
            errorMessage += "\nCharacter is a required field.";
        }
        if (txtActor.getText().length() == 0) //→80                             ensures data entered into actor box; error msg appended to errorMsg field
        {
            errorMessage += "\nActor is a required field.";
        }
        if (errorMessage.length() == 0) //→85                                   checks if data validation errors have occured by testing length of errorMsg field
                                                                                //If the length is zero, no error has been detected, so the program assembles the 
                                                                                //message variable to display which actor will be playing which character. 

        {
            String message = "The role of "
                    + txtCharacter.getText()
                    + " will be played by "
                    + txtActor.getText()
                    + ".";
            Alert a = new Alert(Alert.AlertType.INFORMATION, message);          //Then, an Alert box is used to display the msg
            a.setTitle("Cast");
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.WARNING, errorMessage); //→98   error msg displayed if user fails to enter data in charac or actor field
            a.setTitle("Missing Data");
            a.showAndWait();
        }
    }
}
