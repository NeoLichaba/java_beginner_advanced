package Chap04_DatesAndTimes;

import java.time.*;                                                             //program uses classes from 3 different packages
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/* Listing 4.1
 * Program prompts the user to enter his or her birthday and then prints a variety of 
   interesting information deduced from the date, including:
    » The day of the week on which the user was born
    » The user’s age in years
    » The date of the user’s next birthday
    » The number of days until the user’s next birthday
    » The user’s half-birthday (six months from his or her birthday
 *
 * @author Neo
 */
public class P557_BirthdayFun {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            LocalDate birthDate;                                                //birthdate variable stores user input      
            DateTimeFormatter fullFormat
                    =                                                           //fullFormat - full text format, 
                    DateTimeFormatter.ofPattern("MMMM d, YYYY");
            DateTimeFormatter monthDayFormat                                    //monthDayFormat - formats as month and date
                    = DateTimeFormatter.ofPattern("MMMM d");
            System.out.println("Today is "                                      //current date displayed
                    + LocalDate.now().format(fullFormat) + ".");
            System.out.println();
            System.out.print("Please enter your birthdate "
                    + "(yyyy-mm-dd): ");
            String input = sc.nextLine();

            try {
                birthDate = LocalDate.parse(input);                             //parse method used to parse user input
                if (birthDate.isAfter(LocalDate.now()))                         //is statement checks if date entered is not in the future
                {
                    System.out.println("You haven't been born yet!");
                    continue;
                }
                System.out.println();
                System.out.println(birthDate.format(fullFormat)                 //date entered by user is displayed
                        + " was a very good day!");
                DayOfWeek birthDayOfWeek = birthDate.getDayOfWeek();            //day of the week is calculated and displayed
                System.out.println("You were born on a "
                        + birthDayOfWeek + ".");
                long years = birthDate.until(LocalDate.now(),                   //age is calculated by determining difference between current date and birthdate in years
                        ChronoUnit.YEARS);
                System.out.println("You are " + years + " years young.");
                LocalDate nextBDay = birthDate.plusYears(years + 1);            //date of user's nex birthday is calculated by adding age + 1
                System.out.println("Your next birthday is "
                        + nextBDay.format(fullFormat) + ".");
                long wait = LocalDate.now().until(nextBDay,                     //number of days until the next birthday is calculated
                        ChronoUnit.DAYS);
                System.out.println("That's just " + wait
                        + " days from now!");
                LocalDate halfBirthday = birthDate.plusMonths(6);               //half birthday is calculated by adding 6 months to original date 
                System.out.println("Your half-birthday is "
                        + halfBirthday.format(monthDayFormat) + ".");
            } catch (DateTimeParseException ex) {
                System.out.println("Sorry, that is not a valid date.");
            }
        } while (askAgain());
    }

    private static boolean askAgain() {
        System.out.println();
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
