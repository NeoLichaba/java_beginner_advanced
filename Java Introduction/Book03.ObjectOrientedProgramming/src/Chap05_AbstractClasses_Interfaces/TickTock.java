package Chap05_AbstractClasses_Interfaces;

import java.awt.event.*;

import javax.swing.*;

public class TickTock {

    public static void main(String[] args) {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, new Ticker());                                    //new Timer object created; new instance of Ticker class passed in second parameter
        t.start();                                                           //start method called to kick timer into action
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");                                               //user given the option to end program using JOptionPane class
    }
}

class Ticker implements ActionListener //Ticker class implements ActionListener interface
{

    private boolean tick = true;                                         //Keeps track of whether Ticker displays Tick or Tock

    public void actionPerformed(ActionEvent event) //Called at each timer interval
    {
        if (tick) {
            System.out.println("Tick...");
        } else {
            System.out.println("Tock...");
        }
        tick = !tick;                                                          //If tick is true, set to false and vice versa
    }
}
