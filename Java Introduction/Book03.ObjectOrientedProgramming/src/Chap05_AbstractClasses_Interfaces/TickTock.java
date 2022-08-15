package Chap05_AbstractClasses_Interfaces;

import java.awt.event.*;                                                        

import javax.swing.*;

/*
'* Program demonstrates common use of callbacks by using the Timer class, a part of the swing package
 * Swing - event listeners (first object) are created that handle user-interface events (event source/second objects - (i.e could be through a click of the mouse))
 * Timer class implements basic timer that generates events at regular intervals 
*/

public class TickTock {

    public static void main(String[] args) {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, new Ticker());                                //new Timer object created; new instance of Ticker (listener object) class passed in second parameter
                                                                                //int value represents how often timer event will occur
        t.start();                                                              //start method, part of the API (which is in the Timer class) called to kick timer into action
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");                                    //user given the option to end program using JOptionPane class
    }
}

class Ticker implements ActionListener                                          //Ticker class/object created implements ActionListener interface
                                                                                //ActionListener event defined in .event package
{

    private boolean tick = true;                                                //Keeps track of whether Ticker displays Tick or Tock

    @Override
    public void actionPerformed(ActionEvent event)                              //actionPerformed method called at each timer interval
                                                                                //ActionEvent received - user-interface event
    {
        if (tick) {
            System.out.println("Tick...");
        } else {
            System.out.println("Tock...");
        }
        tick = !tick;                                                          //If tick is true, set to false and vice versa
    }
}
