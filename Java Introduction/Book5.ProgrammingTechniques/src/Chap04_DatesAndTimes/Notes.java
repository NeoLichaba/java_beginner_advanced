
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
    
    Using the ZoneId class (refer to P547 for example code)
    -------------------------------------------------------
    * To create ZonedDateTime, create a time zone object by using the ZoneId class
    * Know standard name of the time zone you want to create

    
    Using the ZoneOffSet class 
    ------------------------------------------------------------
    *The of method OffsetTime and OffsetDateTime classes use an additional class 
     named ZoneOffset to indicate the offset from UTC. You can create a ZoneOffset
    by using any of the following methods of the ZoneOffset class:
        » of(String offsetId)
        » ofHours(int hours)
        » ofHoursMinutes(int hours, int minutes)
        » ofHoursMinutesSeconds(int hours, int minutes, int seconds)
        » ofTotalSeconds(int totalSeconds)

    * For example, you can create a ZoneOffset of -8 hours like this:
      ZoneOffset z = ZoneOffset.ofHours(-8)
    * Note that when you use a string offset, you must provide two digits for the hours, 
      minutes, and (optionally) seconds
    * Once you have a ZoneOffset object, you can use it to create an OffsetTime, as in 
      this example:
      OffsetTime time = OffsetTime.of(10, 30, 0, 0, z);
    
    Looking Closer at the LocalDate Class (P548)
    ------------------------------------------------------------
    
    Extracting Information About a Date (P550)
    ----------------------------------------------------
    LocalDate date = LocalDate.now();
    int year = date.getYear();
    int month = date.getMonthValue();
    int day = date.getDayOfMonth();

    If you need to know how many days into the year a particular date is, you can use 
    this code:
    LocalDate date = LocalDate.parse("2016-04-09");
    System.out.println(date.getDayOfYear());
    
    getDayOfWeek method returns a value of type DayOfWeek
    System.out.println(date.getDayOfWeek());

    Comparing Dates (P551)
    --------------------------------------------------------
    Use isEquals() method
    if (LocalDate.now().isEqual(LocalDate.now()))
    System.out.println("All is right in the universe.");

    Note that you can use built-in operators with methods that return integer results. 
    Thus, the following code will work just as you would expect:
        if (LocalDate.now().getDayOfMonth() < 15)
        System.out.println("It is not yet the 15th.");
    Because the getDayOfMonth method returns an integer, you can use the < operator 
    to determine if the 15th of the month has yet arrived

    Calculating with Dates (P552, refer to CalculatingDates example)
    ------------------------------------------------------------------
    Use until method. Calculates difference btwn a date and the date passed as the first parameter,
    measured in the units indicated by the second parameter

* @author Neo
 */
public class Notes {
    
}
