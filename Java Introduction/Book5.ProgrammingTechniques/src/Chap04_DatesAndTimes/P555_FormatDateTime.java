package Chap04_DatesAndTimes;

import java.time.LocalDateTime;                                                 //implements ChronoLocalDateTime interface
import java.time.format.DateTimeFormatter;

/*
/* Program will print out current date in several formats
 *
 * @author Neo
 */
public class P555_FormatDateTime {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();                                //now method of LocalDateTime used to obtain current time
        printDate(now, "YYYY-MM-dd");
        printDate(now, "MM-dd-YYYY");
        printDate(now, "dd MMM YYYY");
        printDate(now, "MMMM d, YYYY");
        printDate(now, "HH:mm");
        printDate(now, "h:mm a");
    }

    public static void printDate(LocalDateTime date, String pattern) {
        DateTimeFormatter f;                                                    //variable f stored in custom format created in DateFormatter class 
        f = DateTimeFormatter.ofPattern(pattern);                               //f is created using the static ofPattern method, passing pattern in it's parameter
        pattern = (pattern + "              ").substring(0, 14);                //spaces added to pattern string and 11 character-long substring is taken starting at the first character (for alignment)
        System.out.println(pattern + " " + date.format(f));                     //date formated using specified formatter
    }
}
