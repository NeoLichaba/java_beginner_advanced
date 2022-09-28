package Chap04_DatesAndTimes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**Fix**/
/* Program will print out current date in several formats
 *
 * @author Neo
 */
public class P555_FormatDateTime {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        printDate(now, "YYYY-MM-dd");
        printDate(now, "MM-dd-YYYY");
        printDate(now, "dd MMM YYYY");
        printDate(now, "MMMM d, YYYY");
        printDate(now, "HH:mm");
        printDate(now, "h:mm a");
    }

    public static void printDate(LocalDateTime date, String pattern) {
        DateTimeFormatter f;
        f = DateTimeFormatter.ofPattern(pattern);
        pattern = (pattern + " ").substring(0, 11);
        System.out.println(pattern + " " + date.format(f));
    }
}
