package INTERMEDIATE.Others.Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//          Date Format1: Tue Aug 01 10:50:30 2017
//          Date Format2: 2017 Aug 01 10:50:30

public class DateFormat {

    public static void main(String[] args) {

        LocalDateTime dateObj = LocalDateTime.now();



        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E MMM dd kk:mm:ss yyyy");
        DateTimeFormatter dateTimeFormatterShort = DateTimeFormatter.ofPattern("yyyy MMM dd kk:mm:ss");


        System.out.println("Date without format \n"+dateObj);
        System.out.println("\nDate in formatted order \n"+dateObj.format(dateTimeFormatter));
        System.out.println("\nDate in another formatted order  \n"+dateObj.format(dateTimeFormatterShort));
        System.out.println("\nafter adding 1 month \n"+dateObj.plusMonths(1).format(dateTimeFormatterShort));
        System.out.println("\nafter subtracting 15 days \n"+dateObj.minusDays(15).format(dateTimeFormatterShort));

    }
}
