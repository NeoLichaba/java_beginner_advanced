package Chap04_DatesAndTimes;

import java.time.*;



/* Program displays current time, using 10 Date-Time Classes creating an object of each class using now()
 *
 * @author User
 */
public class P543_TimeTester {

    public static void main(String[] args) {
        System.out.println("\nLocalTime: "                                      //A time
                + LocalTime.now().toString());
        System.out.println("\nLocalDateTime: "                                  //A date
                + LocalDateTime.now().toString());
        System.out.println("\nZonedDateTime: "                                  //A date and time associated with a particular time zone
                + ZonedDateTime.now().toString());
        System.out.println("\nOffsetTime: "                                     //A time and an offset from UTC
                + OffsetTime.now().toString());
        System.out.println("\nOffsetDateTime: "                                 //A date and time with an offset value from UTC
                + OffsetDateTime.now().toString());
        System.out.println("\nMonthDay: "                                       //Month and day with an associated year
                + MonthDay.now().toString());
        System.out.println("\nYearMonth: "                                      //Year and Month
                + YearMonth.now().toString());
        System.out.println("\nInstant: "                                        //A single point of time, represented as the number of nanoseconds that have elapsed since midnight
                + Instant.now().toString());
    }

}
