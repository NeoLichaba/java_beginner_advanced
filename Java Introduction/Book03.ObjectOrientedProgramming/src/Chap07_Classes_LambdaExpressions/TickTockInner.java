package Chap07_Classes_LambdaExpressions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Program implements Ticker class as an inner class
 *
 *
 */
public class TickTockInner {

    private String tickMessage = "Tick...";                                        //Variables consist within outer class - accessible by inner class Ticker
    private String tockMessage = "Tock...";

    public static void main(String[] args) {
        TickTockInner t = new TickTockInner();                                         //New instance of application class created (TickTockInner)
        t.go();                                                                        //go method of the new instance of TickTockInner
    }

    private void go() //go method called
    {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, new Ticker());                                       //Instance of timer class created with timer interval
        t.start();
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null, //JOptionPane class used to give code time to run
                "Click OK to exit program");
        System.exit(0);                                                                //exit method called - immediate shut down of JVM
    }

    class Ticker implements ActionListener //Inner class - Ticker. Implements ActionListener interface
    {

        private boolean tick = true;

        @Override
        public void actionPerformed(ActionEvent event) //actionPerformed method called every 1 second
        {
            if (tick) {
                System.out.println(tickMessage);                                               //Inner class directly accesses a field of the outer class
            } else {
                System.out.println(tockMessage);
            }
            tick = !tick;
        }
    }
}
