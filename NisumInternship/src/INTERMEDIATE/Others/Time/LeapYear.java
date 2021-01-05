package INTERMEDIATE.Others.Time;

import java.time.Year;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Year : ");
        int yearInput = input.nextInt();

        Year year = Year.of(yearInput);
        System.out.println(year.isLeap());
    }
}
