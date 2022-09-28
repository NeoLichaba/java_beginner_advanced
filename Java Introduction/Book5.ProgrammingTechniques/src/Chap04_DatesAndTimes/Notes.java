
package Chap04_DatesAndTimes;

/* Using the parse Method to Create a Date-Time Object
   -----------------------------------------------------
   * Creates a Date-Time object from a string that represents a specific date or time
   * e.g. LocalDateTime dt;
          dt = LocalDateTime.parse("2014-12-15T15:45"); - T separates the date from the time, time expressed in 24 hour format
   * If String not in correct format, parse method throws a DateTimeParseException. parse method must be enclosed in a try/catch block
   * parse Method useful for converting user input to a Date-Time object

*  Using the of Method to Create a Date-Time Object
   -----------------------------------------------------
    e.g. LocalDate date = LocalDate.of(2014,12,15);

    Using the Month enumeration
    ------------------------------
    * Month is an enumeration that represents the twelve months of the year
      LocalDate date = LocalDate.of(2014,Month.DECEMBER,15);

    * System.out.println("December hath "
        + Month.DECEMBER.length(false) + " days."); 
        - boolean argument in length method indicates whether calculation should be for a leap year

* @author Neo
 */
public class Notes {
    
}
