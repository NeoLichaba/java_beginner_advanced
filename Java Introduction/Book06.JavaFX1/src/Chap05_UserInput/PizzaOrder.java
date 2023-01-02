package Chap05_UserInput;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.text.*;

/* Listing 5.2, P675
 *
 * @author User
 */
public class PizzaOrder extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    Stage stage;
    // Customer name, phone and address fields
    TextField txtName;
    TextField txtPhone;
    TextField txtAddress;
    // Size radio buttons
    RadioButton rdoSmall;
    RadioButton rdoMedium;
    RadioButton rdoLarge;
    // Crust style radio buttons
    RadioButton rdoThin;
    RadioButton rdoThick;
    // Topping radio buttons
    CheckBox chkPepperoni;                                                      
    CheckBox chkSausage;
    CheckBox chkLinguica;
    CheckBox chkOlives;
    CheckBox chkMushrooms;
    CheckBox chkTomatoes;
    CheckBox chkAnchovies;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        // ----- Create the top pane -----
        Text textHeading = new Text("Order Your Pizza Now!");                   
        textHeading.setFont(new Font(20));
        HBox paneTop = new HBox(textHeading);
        paneTop.setPadding(new Insets(20, 10, 20, 10));                         //paneTop contains the title, displayed at the top of the border pane
                                                                                //setPadding method, sets padding around the inside edges of the pane
        // ---------- Create the customer pane ----------
        // Create the name label and text field
        Label lblName = new Label("Name:");
        lblName.setPrefWidth(100);
        txtName = new TextField();                                              //create a new textfield with empty contect
        txtName.setPrefColumnCount(20);                                         //preferred number of text columns set to 20
        txtName.setPromptText("Enter the customer's name here");
        txtName.setMaxWidth(Double.MAX_VALUE);
        HBox paneName = new HBox(lblName, txtName);                             //Contains the label and text box for the customer’s name, placed 
                                                                                //side-by-side.
        // Create the phone number label and text field
        Label lblPhone = new Label("Phone Number:");
        lblPhone.setPrefWidth(100);
        txtPhone = new TextField();
        txtPhone.setPrefColumnCount(20);
        txtPhone.setPromptText("Enter the customer's phone number here");
        HBox panePhone = new HBox(lblPhone, txtPhone);
        
        // Create the address label and text field
        Label lblAddress = new Label("Address:");
        lblAddress.setPrefWidth(100);
        txtAddress = new TextField();
        txtAddress.setPrefColumnCount(20);
        txtAddress.setPromptText("Enter the customer's address here");
        HBox paneAddress = new HBox(lblAddress, txtAddress);                    //contains label and txt box, placed side by side
        
        // Create the customer pane
        VBox paneCustomer = new VBox(10, paneName,
                panePhone, paneAddress);                                        //contains name, phone number and address, stacked vertically
        
        // ---------- Create the order pane ----------
        // Create the size pane
        Label lblSize = new Label("Size");
        rdoSmall = new RadioButton("Small");
        rdoMedium = new RadioButton("Medium");
        rdoLarge = new RadioButton("Large");
        rdoMedium.setSelected(true);
        ToggleGroup groupSize = new ToggleGroup();
        rdoSmall.setToggleGroup(groupSize);
        rdoMedium.setToggleGroup(groupSize);
        rdoLarge.setToggleGroup(groupSize);
        VBox paneSize = new VBox(lblSize, rdoSmall, rdoMedium, rdoLarge);       //Contains a label with the text “Size” and the three radio buttons that let 
                                                                                //the user choose the pizza size, stacked vertically.
        paneSize.setSpacing(10);                                                //spacing set at 10 pixel between the elements
        
        // Create the crust pane
        Label lblCrust = new Label("Crust");
        rdoThin = new RadioButton("Thin");
        rdoThick = new RadioButton("Thick");
        rdoThin.setSelected(true);
        ToggleGroup groupCrust = new ToggleGroup();
        rdoThin.setToggleGroup(groupCrust);
        rdoThick.setToggleGroup(groupCrust);
        VBox paneCrust = new VBox(lblCrust, rdoThin, rdoThick);                 //Contains a label with the text “Crust” and the two radio buttons that let 
                                                                                //the user choose the crust style, stacked vertically.
        paneCrust.setSpacing(10);
        
        // Create the toppings pane
        Label lblToppings = new Label("Toppings");                              //check boxes created  
        chkPepperoni = new CheckBox("Pepperoni");
        chkSausage = new CheckBox("Sausage");
        chkLinguica = new CheckBox("Linguica");
        chkOlives = new CheckBox("Olives");
        chkMushrooms = new CheckBox("Mushrooms");
        chkTomatoes = new CheckBox("Tomatoes");
        chkAnchovies = new CheckBox("Anchovies");
        FlowPane paneToppings = new FlowPane(Orientation.VERTICAL,              //within flowpane, toppings are contained
                chkPepperoni, chkSausage, chkLinguica, chkOlives,               //how the checkbox will be rearranged when window resized
                chkMushrooms, chkTomatoes, chkAnchovies);
        paneToppings.setPadding(new Insets(10, 0, 10, 0));
        paneToppings.setHgap(20);                                               //gap between the columns
        paneToppings.setVgap(10);                                               //gap between the rows
        paneToppings.setPrefWrapLength(100);
        VBox paneTopping = new VBox(lblToppings, paneToppings);
        
        // Add the size, crust, and toppings pane to the order pane
        HBox paneOrder = new HBox(50, paneSize, paneCrust, paneTopping);
        
        // Create the center pane
        VBox paneCenter = new VBox(20, paneCustomer, paneOrder);
        paneCenter.setPadding(new Insets(0, 10, 0, 10));
        
        // ---------- Create the bottom pane ----------
        Button btnOK = new Button("OK");
        btnOK.setPrefWidth(80);
        btnOK.setOnAction(e -> btnOK_Click());
        Button btnCancel = new Button("Cancel");
        btnCancel.setPrefWidth(80);
        btnCancel.setOnAction(e -> btnCancel_Click());
        Region spacer = new Region();                                           //spacer - forces buttons to right margin
        HBox paneBottom = new HBox(10, spacer, btnOK, btnCancel);               //paneBottom - displayed in bottom region of the border pane
        paneBottom.setHgrow(spacer, Priority.ALWAYS);                           //setHgrow determines whether column should grow if grid pane's overall width increases
        paneBottom.setPadding(new Insets(20, 10, 20, 10));
        
        // ---------- Finish the scene ----------
        BorderPane paneMain = new BorderPane();                                 //new empty border layout created                                 
        paneMain.setTop(paneTop);                                               //title text displayed in top region of border pane
        paneMain.setCenter(paneCenter);                                         //paneCenter set as the centre node
        paneMain.setBottom(paneBottom);                                         //paneBottom sets bottom node
        
        // Create the scene and the stage
        Scene scene = new Scene(paneMain);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pizza Order");
        primaryStage.show();
    }

    public void btnOK_Click() {
        // Create a message string with the customer information
        String msg = "Customer:\n\n";
        msg += "\t" + txtName.getText() + "\n";
        msg += "\t" + txtAddress.getText() + "\n";
        msg += "\t" + txtPhone.getText() + "\n\n";
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
        String toppings = "";
        toppings = buildToppings(chkPepperoni, toppings);
        toppings = buildToppings(chkSausage, toppings);
        toppings = buildToppings(chkLinguica, toppings);
        toppings = buildToppings(chkOlives, toppings);
        toppings = buildToppings(chkTomatoes, toppings);
        toppings = buildToppings(chkMushrooms, toppings);
        toppings = buildToppings(chkAnchovies, toppings);
        if (toppings.equals("")) {
            msg += "no toppings.";
        } else {
            msg += "the following toppings:\n"
                    + toppings;
        }
        // Display the message
        Alert a = new Alert(Alert.AlertType.INFORMATION, msg);
        a.setTitle("Order Details");
        a.showAndWait();
    }

    public String buildToppings(CheckBox chk, String msg) {
        // Helper method for displaying the list of toppings
        if (chk.isSelected()) {
            if (!msg.equals("")) {
                msg += ", ";
            }
            msg += chk.getText();
        }
        return msg;
    }

    public void btnCancel_Click() {
        stage.close();
    }
}
