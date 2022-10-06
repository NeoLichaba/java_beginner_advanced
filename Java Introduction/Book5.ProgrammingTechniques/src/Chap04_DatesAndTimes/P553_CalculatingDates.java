package Chap04_DatesAndTimes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 *
 * @author User
 */
public class P553_CalculatingDates {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();                                      //calling the now method
        LocalDate invDate = LocalDate.of(today.getYear(),
                today.getMonthValue(), 15);
        if (today.getDayOfMonth() > 15) {
            invDate = invDate.plusMonths(1);
        }
        long daysToInvoice = today.until(invDate,
                ChronoUnit.DAYS);
        System.out.println(daysToInvoice
                + " until next invoice date.");

        LocalDate date1 = LocalDate.parse("2014-05-16");
        LocalDate date2 = LocalDate.parse("2014-12-15");
        System.out.println(date1.until(date2, ChronoUnit.DAYS));
    }
}
