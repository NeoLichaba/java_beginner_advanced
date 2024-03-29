
package Chap04_LayoutPanesArrangeScenes;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/* Program demonstrates a pizza order application
 * Listing 4.1, P652
 * @author Neo
 */
public class PizzaOrder extends Application {

    public static void main(String[] args) {
        launch(args);                                                           //instance of Pizza Order created, subsequently calling the start method
    }
    Stage stage;                                                                //all objects of our application are contained. Represented by Stage class
    TextField txtName;                                                          //components of the order form declared 
    TextField txtPhone;
    TextField txtAddress;
    RadioButton rdoSmall;                                                       //Radio buttons only one can be selected at a time
    RadioButton rdoMedium;
    RadioButton rdoLarge;
    RadioButton rdoThin;
    RadioButton rdoThick;
    CheckBox chkPepperoni;                                                      //Checkbox control for user to check/clear. created - checked, unchecked and undefined
    CheckBox chkMushrooms;
    CheckBox chkAnchovies;

    @Override
    public void start(Stage primaryStage) {                                     //start method passes stage object created
        stage = primaryStage;                                                   //primary stage created by the Stage class
        // Create the name label and text field →32                             //label and text field created for customer name
        Label lblName = new Label("Name:");
        txtName = new TextField();
        txtName.setMinWidth(100);                                               //min width for the field
        txtName.setPrefWidth(200);                                              //pref width for the field
        txtName.setMaxWidth(300);                                               //max width for the field
        txtName.setPromptText("Enter the name here");                           //field's prompt value
        // Create the phone number label and text field →40                     //label and text field for phone number created
        Label lblPhone = new Label("Phone Number:");
        txtPhone = new TextField();
        txtPhone.setMinWidth(60);
        txtPhone.setPrefWidth(120);
        txtPhone.setMaxWidth(180);
        txtPhone.setPromptText("Enter the phone number here");
        // Create the address label and text field →48                          //label and text field for address is created
        Label lblAddress = new Label("Address:");
        txtAddress = new TextField();
        txtAddress.setMinWidth(100);
        txtAddress.setPrefWidth(200);
        txtAddress.setMaxWidth(300);
        txtAddress.setPromptText("Enter the address here");                     //field's prompt value
        // Create the size pane →56                                             //label and 3 radio buttons created for pizza's size
        Label lblSize = new Label("Size");
        rdoSmall = new RadioButton("Small"); 
        rdoMedium = new RadioButton("Medium");
        rdoLarge = new RadioButton("Large");
        rdoMedium.setSelected(true);                                            //checks the check box if parameter is true, unchecks if false
        ToggleGroup groupSize = new ToggleGroup();                              //Toggle group class contains ref to all toggles. Only 1 Toggle within a a group can be selected at any time
                                                                                //toggle group to group radio buttons together instantiated with ToggleGroup constructor called
        rdoSmall.setToggleGroup(groupSize);                                     //toggle group for each radio button  set
        rdoMedium.setToggleGroup(groupSize);
        rdoLarge.setToggleGroup(groupSize);
        VBox paneSize = new VBox(lblSize, rdoSmall, rdoMedium, rdoLarge);       //radio buttons are added to a VBox names paneSize
        paneSize.setSpacing(10);
        // Create the crust pane →70                                            //label and 2 radio buttons are created for crust style
        Label lblCrust = new Label("Crust");                                    
        rdoThin = new RadioButton("Thin");
        rdoThick = new RadioButton("Thick");
        rdoThin.setSelected(true);
        ToggleGroup groupCrust = new ToggleGroup();
        rdoThin.setToggleGroup(groupCrust);
        rdoThick.setToggleGroup(groupCrust);
        VBox paneCrust = new VBox(lblCrust, rdoThin, rdoThick);                 //label and radio buttons are added to VBox paneCrust
        paneCrust.setSpacing(10);
        // Create the toppings pane →82                                         //label and checkboxes are created for pizza toppings
        Label lblToppings = new Label("Toppings");
        chkPepperoni = new CheckBox("Pepperoni");
        chkMushrooms = new CheckBox("Mushrooms");
        chkAnchovies = new CheckBox("Anchovies");
        VBox paneToppings = new VBox(lblToppings, chkPepperoni,
                chkMushrooms, chkAnchovies);                                    //label and check boxes are added to VBox names paneToppings
        paneToppings.setSpacing(10);
        // Create the buttons →92                                               //OK and Cancel button created and added to HBox paneButton
        Button btnOK = new Button("OK");
        btnOK.setPrefWidth(80);
        btnOK.setOnAction(e -> btnOK_Click());                                  //setOnAction method passes event handler which calls on btnOK_Click method
        Button btnCancel = new Button("Cancel");
        btnCancel.setPrefWidth(80);
        btnCancel.setOnAction(e -> btnCancel_Click());
        HBox paneButtons = new HBox(10, btnOK, btnCancel);                      //HBox created with specified spacing and the child nodes added
        
        // Create the GridPane layout →103                                      //grid pane layout is created
                                                                                //padding,horizontal and vertical gaps are set to 10
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));                                        //setPadding method adds space around the perimeter of layout pane
                                                                                //object type Insets passed received in parameter - represents size of padding
                                                                                //for top, right, bottom and left edge of an object.
                                                                                //uniform madding set
        grid.setHgap(10);                                                       //gaps between columns set
        grid.setVgap(10);                                                       //gap between rows appears
        grid.setMinWidth(500);                                                  //min width of grid pane
        grid.setPrefWidth(500);                                                 //preferred width of grid pane
        grid.setMaxWidth(800);                                                  //max width
        // Add the nodes to the pane →112                                       //nodes are added to the pane
        grid.addRow(0, lblName, txtName);                                       //name added to row 0
        grid.addRow(1, lblPhone, txtPhone);                                     //phoneNumber added to row 1
        grid.addRow(2, lblAddress, txtAddress);                                 //address added to row 2
        grid.addRow(3, paneSize, paneCrust, paneToppings);                      //size, crust and toppings added to row 3
        grid.add(paneButtons, 2, 4);                                            //Hbox contains buttons added to column 2 of row 4
        // Set alignments and spanning →119                                     //layout within our grid pane constructed
        grid.setHalignment(lblName, HPos.RIGHT);                                //horizontal alignment for the node set - lblName placed right
        grid.setHalignment(lblPhone, HPos.RIGHT);
        grid.setHalignment(lblAddress, HPos.RIGHT);
        grid.setColumnSpan(txtName, 2);                                         //column span for node (txtName) set. Specify the number of columns node should span
        grid.setColumnSpan(txtPhone, 2);
        grid.setColumnSpan(txtAddress, 2);
        // Set column widths →127                                               //columns constraints created, column widths evenly distributed
        ColumnConstraints col1 = new ColumnConstraints();                       //constraint for each column created
        col1.setPercentWidth(33);                                               //width set as % of the total width of grid pane
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(33);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(33);                                               //each column fills 33% of the grid
        grid.getColumnConstraints().addAll(col1, col2, col3);                   //to the grid, get all the Column constraints and addAll columns
        // Create the scene and the stage →136                                  //scene is created and stage displayed
        Scene scene = new Scene(grid);                                          //container for all content
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pizza Order");
        primaryStage.setMinWidth(500);
        primaryStage.setMaxWidth(900);
        primaryStage.show();
    }

    public void btnOK_Click() //→146                                            //when user clicks OK, summary of order is created
    {
        // Create a message string with the customer information
        String msg = "Customer:\n\n";
        msg += "\t" + txtName.getText() + "\n";
        msg += "\t" + txtPhone.getText() + "\n\n";
        msg += "\t" + txtAddress.getText() + "\n";
        msg += "You have ordered a ";
        // Add the pizza size
        if (rdoSmall.isSelected()) {
            msg += "small ";
        }
        if (rdoMedium.isSelected()) {
            msg += "medium ";
        }
        if (rdoLarge.isSelected()) {
            msg += "large ";
        }
        // Add the crust style
        if (rdoThin.isSelected()) {
            msg += "thin crust pizza with ";
        }
        if (rdoThick.isSelected()) {
            msg += "thick crust pizza with ";
        }
        // Add the toppings
        String toppings = "";                                                   //toppings initialised as an empty string
        toppings = buildToppings(chkPepperoni, toppings);                       //toppings initilaised, accepts different type of topping from topping
        toppings = buildToppings(chkMushrooms, toppings);
        toppings = buildToppings(chkAnchovies, toppings);
        if (toppings.equals("")) {
            msg += "no toppings.";
        } else {
            msg += "the following toppings:\n"
                    + toppings;
        }
        // Display the message
        Alert a = new Alert(Alert.AlertType.INFORMATION, msg);                  //Alert dialog box with the order details displayed
        a.setTitle("Order Details");
        a.showAndWait();                                                        //showAndWait method called - determines which btns user called
    }

    public String buildToppings(CheckBox chk, String msg) //→187                //helper method assists in construction of message string
    {
        // Helper method for displaying the list of toppings
        if (chk.isSelected()) {
            if (!msg.equals("")) {
                msg += ", ";
            }
            msg += chk.getText();
        }
        return msg;
    }

    public void btnCancel_Click() //→201
    {
        stage.close();                                                          //stage closed when user clicks Close button
    }
}
