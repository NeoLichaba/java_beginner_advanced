package Chap07_Classes_LambdaExpressions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 *
 * 
 */
public class TickTockAnonymous {

    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) //Anonymous classes won't work in static context
    {
        TickTockAnonymous t = new TickTockAnonymous();
        t.go();
    }

    private void go() {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, //Instance of timer class created
                new ActionListener() //Second parameter creates a new instance of event listener
        {                                                                       //beginning of body of the anonymous class        
                                                                                
 private boolean tick = true;

            public void actionPerformed(
                    ActionEvent event) //actionPerformed method Called every second by the timer    
            {
                if (tick) {
                    System.out.println(tickMessage);
                } else {
                    System.out.println(tockMessage);
                }
                tick = !tick;
            }
        });                                                                           //end of body of anonymous class. Right parenthesis marks end of the parameter for Timer constructor
        t.start();
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }
}
