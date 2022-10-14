package Chap03_StageAndSceneLayout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/* Scenes from ClickCounter and AddSubtract are combined
 * SceneSwitcher program run - displays ClickCounter scene
 * Switch scene - switches to AddSubtract scene. Call stage's setScene method to switch the scene
 * When a JavaFX application is launched, a stage known as the primary stage is automatically created. A reference to this stage is passed to the application’s start
   method via the primaryStage parameter:
   publci void start(Stage primaryStage){}
 * @author Neo
 */
public class SceneSwitcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    // class fields for Click-Counter scene →15                                 
    int iClickCount = 0;                                                        //counts the number of times user clicks the button 
    Label lblClicks;                                                            //counts displayed in label
    Button btnClickMe;                                                          //clickMe btn
    Button btnSwitchToScene2;                                                   //btn to switch btwn scened
    Scene scene1;                                                               //references clickCounter scene
    // class fields for Add-Subtract scene →22
    int iCounter = 0;
    Label lblCounter;
    Button btnAdd;                                                              //btn to increment
    Button btnSubtract;                                                         //btn to decrement
    Button btnSwitchToScene1;                                                   //btn to switch btwn scenes
    Scene scene2;
    // class field for stage
    Stage stage; //→31                                                          holds ref to primary stage 

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage; //→35                                             holds ref to primary stage 
        // Build the Click-Counter scene →37
        lblClicks = new Label();
        lblClicks.setText("You have not clicked the button.");
        btnClickMe = new Button();
        btnClickMe.setText("Click me please!");
        btnClickMe.setOnAction(
                e -> btnClickMe_Click());
        btnSwitchToScene2 = new Button();
        btnSwitchToScene2.setText("Switch!");
        btnSwitchToScene2.setOnAction(
                e -> btnSwitchToScene2_Click());
        VBox pane1 = new VBox(10);                                              //VBox layout pane, controls laid out in a vertical stack
        pane1.getChildren().addAll(lblClicks, btnClickMe,                       //labels and buttons added to the pane
                btnSwitchToScene2);
        scene1 = new Scene(pane1, 250, 150);
        // Build the Add-Subtract scene →59                                     
        lblCounter = new Label();                                               //label created
        lblCounter.setText(Integer.toString(iCounter));
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(
                e -> btnAdd_Click());
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(
                e -> btnSubtract_Click());
        btnSwitchToScene2 = new Button();
        btnSwitchToScene2.setText("Switch!");
        btnSwitchToScene2.setOnAction(
                e -> btnSwitchToScene1_Click());
        HBox pane2 = new HBox(10);                                              //set up in HBox
        pane2.getChildren().addAll(lblCounter, btnAdd,
                btnSubtract, btnSwitchToScene2);                                
        scene2 = new Scene(pane2, 300, 75);                                     //scene created with HBox as root
        // Set the stage with scene 1 and show the stage →84
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene Switcher");
        primaryStage.show();
    }
    // Event handlers for scene 1 →91

    public void btnClickMe_Click() {
        iClickCount++;                                                          //clickCount increments 
        if (iClickCount == 1) {
            lblClicks.setText("You have clicked once.");                        //msg displayed
        } else {
            lblClicks.setText("You have clicked "
                    + iClickCount + " times.");
        }
    }

    private void btnSwitchToScene2_Click() {
        stage.setScene(scene2);                                                 //handler switches to scene to primary stage
    }
    // Event handlers for scene 2 →112                                          //event handlers either increment/decrement counter

    private void btnAdd_Click() {
        iCounter++;
        lblCounter.setText(Integer.toString(iCounter));                         //appropriate text displayed in string format
    }

    private void btnSubtract_Click() {
        iCounter--;
        lblCounter.setText(Integer.toString(iCounter));
    }

    private void btnSwitchToScene1_Click() {                                    //handler switches back to scene1
        stage.setScene(scene1);
    }
}

