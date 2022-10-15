
package Chap04_LayoutPanesArrangeScenes;

/* Layout panes, determine where each component appears in its frame or panel

 * Working with Layout Panes
   ----------------------------
 » HBox: This layout pane arranges nodes horizontally, one next to the other. You 
    use it to create controls arranged neatly in rows.
 » VBox: This layout pane arranges nodes vertically, one above the other. You 
    use it to create controls arranged neatly in columns.
 » FlowPane: This layout pane arranges nodes next to each other until it runs 
    out of room; then, it wraps to continue layout nodes. You can configure a 
    FlowPane to arrange nodes horizontally in rows or vertically in columns.
 » Border: This layout pane divides the pane into five regions: Top, Left, Center, 
    Right, and Bottom. When you add a node, you can specify which region you 
    want to place the node in.
 » GridPane: This layout pane divides the pane into a grid, affording you 
    complete control of the arrangement of elements in rows and columns. 

    Creating layout panes
    ----------------------------------
 1. Create the controls or other nodes you want to add to the pane.
 2. Create a layout pane by calling its constructor.
    For example:
    HBox pane = new HBox();
 3. Fine-tune the optional settings used by the layout pane.
    Each type of layout pane has a unique assortment of optional parameters that 
    govern the details of how nodes are laid out within the pane
 4. Add each of the nodes that will appear in the layout pane.
    Each type of layout pane provides a method for adding nodes to the pane
 5. Create the scene, specifying the layout pane as the scene’s root node.


 * @author Neo
 */
public class Notes {
    
}
