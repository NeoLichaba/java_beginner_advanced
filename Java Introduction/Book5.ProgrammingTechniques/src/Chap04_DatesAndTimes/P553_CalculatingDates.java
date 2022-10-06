package Chap04_DatesAndTimes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;                                           

/* Program displays a business that prepares invoices on the 15th of each month
 *
 * @author Neo
 */
public class P553_CalculatingDates {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();                                      //current date obtained, calling now method of the LocalDate class
        LocalDate invDate = LocalDate.of(today.getYear(),                       //invoice created displaying/retrieving Year and Month value, setting current date to the 15th
                today.getMonthValue(), 15);                                     
        if (today.getDayOfMonth() > 15) {                                       //if today's date of the year is after the 15th, add 1 month to invoicing date
                                                                                //i.e. invoice date is the next month
            invDate = invDate.plusMonths(1);                                    //+1 month added to invoice date
        }
        long daysToInvoice = today.until(invDate,                               //until method used to determine number of dates between current date and next invoice date
                ChronoUnit.DAYS);                                               //ChronoUnit- enum defines units of time 
        System.out.println(daysToInvoice
                + " until next invoice date.");

        LocalDate date1 = LocalDate.parse("2022-10-01");                        
        LocalDate date2 = LocalDate.parse("2022-12-31");
        System.out.println(date1.until(date2, ChronoUnit.DAYS));                //number of days between date1 and date2 printed
                                                                                
    }
}
