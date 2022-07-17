

package Chap02_VariablesDataTypes;


import javax.swing.JOptionPane;	

/* Listing 2_4 */

public class DialogApp
{
    public static void main(String[] args)
    {
        String s;
        s = JOptionPane.showInputDialog	//pop up dialog box created and accessed
                ("Enter an integer:");	
        int x = Integer.parseInt(s); //parseInt method used in order to convert String entered by user into an integer
        System.out.println("You entered " + x + "."); //integer value entered by user is displayed and confirmed
    }
}
