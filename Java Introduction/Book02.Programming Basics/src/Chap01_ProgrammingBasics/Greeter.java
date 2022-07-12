
/* This class creates a Greeter object
 that displays a hello message in a dialog box
 Declared as a public class as HelloApp2 will require access to it
*/

package Chap01_ProgrammingBasics;

import javax.swing.JOptionPane;

public class Greeter
{
    public void sayHello()
    {
        JOptionPane.showMessageDialog(null,
            "Hello, World!", "Greeter", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}