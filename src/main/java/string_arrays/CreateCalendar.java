package string_arrays;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by ryandesmond on 7/10/17.
 */


/*
    Write the code to create, parse modify and format a variety of dates and DateFormats.
 */
public class CreateCalendar {
    public static void main(String[] args) {

        GregorianCalendar c = new GregorianCalendar();


        c.setTimeInMillis(1498842000000L);
        System.out.println(format(c, "MMMM dd, yyyy HH:mm"));


        int fourHoursInMillis=1000*60*60*4;

        c.setTimeInMillis(c.getTimeInMillis()-fourHoursInMillis);
        System.out.println(format(c, "MMMM dd, yyyy HH:mm"));

        int oneWeekInMillis=1000*60*60*24*7;

        c.setTimeInMillis(c.getTimeInMillis()+oneWeekInMillis);
        System.out.println(format(c, "MMMM dd, yyyy HH:mm"));

        System.out.println(format(c, "yyyy-MM-dd"));

        System.out.println(format(c, "dd.MM.yyyy HH:mm"));

        System.out.println(c.getTime());


    }

    public static String format(GregorianCalendar c, String pattern){
        SimpleDateFormat fmt = new SimpleDateFormat(pattern);
        fmt.setCalendar(c);
        String dateFormatted = fmt.format(c.getTime());
        return dateFormatted;
    }

    // Create a Calendar object and set it's date to July 1, 2017.

    // sout(date)

    // Subtract 4 hours from Calendar

    // sout(date)

    // add 1 week to the date

    // sout(date)

    // Format the date to show yyyy-MM-dd (ie, "2017-06-26") using SimpleDateFormat class

    // sout(date)

    // demostrate modifying the format of the date at least two other ways, (ie, "07-04-2017" or "Wed March 26 00:00:00 EST 2017")

    // sout(date)
}

