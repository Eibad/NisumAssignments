package INTERMEDIATE.Others.Time;

import java.util.Calendar;
import java.util.Date;

public class MilliSeconds {

    public static void main(String[] args) {

        Calendar previousDate = Calendar.getInstance();
        previousDate.set(1970,0,1);



        Calendar currentDate = Calendar.getInstance();


        System.out.println(previousDate.getTime());

        currentDate.add(Calendar.DATE,-1);
        System.out.println((currentDate.getTime()));

        System.out.println("Milliseconds : "+ (currentDate.getTimeInMillis()-previousDate.getTimeInMillis()));
        System.out.println("Seconds      : "+ (currentDate.getTimeInMillis()-previousDate.getTimeInMillis())/1000);

    }
}
