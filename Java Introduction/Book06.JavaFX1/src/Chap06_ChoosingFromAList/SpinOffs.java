package Chap06_ChoosingFromAList;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

/* Lising 6.1, P704
 * This program lets the user select a show from the tree and displays 
   the title of the selected show in a label below the tree.
 * Creating a choice box - from drop down 
 * Listening for selection changes - choice box don't generate an event listener when user changes selection
 * Event listener = change listener
 * Tree view displays listed data in outline form - referred to as a tree. 
 * Picture the folder structure of your disk drive = tree
 * Tree control used to represent favorite TV series - along with series that were spun off from them
 * Elements of a tree:
    » Node: Each element in the tree is a node. Each node in a tree is created from 
            TreeItem class. The TreeItem class is a generic class, so you can associate a 
            type with it. Thus, you can create a tree using objects of any type you wish, 
            including types you create yourself.
    » Root node: A root node is the starting node for a tree. Every tree must have 
                one — and only one — root node. When you create a tree component, you 
                pass the root node to the TreeView constructor.
    » Child node: The nodes that appear immediately below a given node are that 
                  node’s child nodes. A node can have more than one child.
    » Parent node: The node immediately above a given node is that node’s parent 
                   node. Every node except the root node must have one — and only one — 
                   parent.
    » Sibling nodes: Sibling nodes are children of the same parent.
    » Leaf node: A leaf node is one that doesn’t have any children.
    » Path: A path contains the node and all its ancestors — that is, its parent, its 
            parent’s parent, and so on — all the way back to the root.
    » Expanded node: An expanded node is one whose children are visible.
    » Collapsed node: A collapsed node is one whose children are hidden
    
 * @author Neo
 */
public class SpinOffs extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    TreeView<String> tree; //→15                                                
    Label lblShowName;                                                          

    @Override
    public void start(Stage primaryStage) {
        TreeItem<String> root, andy, archie, //→20                               TreeItem variables are declared for the root node and each show that has 
                                                                                //spinoff shows.
                happy, george, maude;
        root = new TreeItem<String>("Spin Offs");//→23                          root (start) node is created with the text Spin-Offs
        root.setExpanded(true);                                                 //TreeItem/Drop down menu initially expanded - set to true
        
        andy = makeShow(                                //→26                   create the nodes for The Andy Griffith Show and its spinoffs
                "The Andy Griffith Show", root);                                
        makeShow("Gomer Pyle, U.S.M.C.", andy);
        makeShow("Mayberry R.F.D", andy);
        
        archie = makeShow("All in the Family", root); //→31                     create the nodes for The All in the family Show and its spinoffs
        george = makeShow("The Jeffersons", archie);
        makeShow("Checking In", george);
        maude = makeShow("Maude", archie);
        makeShow("Good Times", maude);
        makeShow("Gloria", archie);
        makeShow("Archie Bunker's Place", archie);
       
        happy = makeShow("Happy Days", root); //→39                             create the nodes for Happy Days Show and its spinoffs
        makeShow("Mork and Mindy", happy);
        makeShow("Laverne and Shirley", happy);
        makeShow("Joanie Loves Chachi", happy);
        tree = new TreeView<String>(root); //→44                                TreeView control, specifying root as the root node 
                                                                                //for the tree. 
        tree.setShowRoot(false);                                                //The next line hides the root node
                                                                                
        tree.getSelectionModel().selectedItemProperty() //→46                   getSelectionModel, returns control's selection model, event listener created for the selectedItemProperty
                .addListener((v, oldValue, newValue)
                        -> tree_SelectionChanged(newValue));                    //tree_SelectionChanged method called whenever the selection status of the TreeView
                                                                                //control changes.
        lblShowName = new Label();
        VBox pane = new VBox(10);
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.getChildren().addAll(tree, lblShowName); //→54                     TreeView control and the label are added to a VBox layout pane, 
                                                                                //which is then added to the scene just before the stage is shown
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Favorite Spin Offs");
        primaryStage.show();
    }

    public TreeItem<String> makeShow(String title, //→64                        makeShow method creates a node from a string and adds the node to 
                                                                                //the node passed as the parent parameter
            TreeItem<String> parent) {
        TreeItem<String> show = new TreeItem<String>(title);
        show.setExpanded(true);
        parent.getChildren().add(show);
        return show;
    }

    public void tree_SelectionChanged(TreeItem<String> item) //→73              tree_SelectionChanged method is called whenever the selected 
                                                                                //node changes.
                                                                                //title of the selected show in the 
                                                                                
    {
        if (item != null) {                                                     //if statement used to ensure item is not null
            lblShowName.setText(item.getValue());                               //lblShowName is updated to display the value of the newly selected item
        }
    }
}
