

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

public class MyDate{
    public static void main(String[] args){

        // reading dates and time
        System.out.println(LocalDate.now()); // contains just the date with no time and timeZone
        System.out.println(LocalTime.now()); // contains just the time with no date and timeZone
        System.out.println(LocalDateTime.now()); // contains date and time with no timeZone
        System.out.println(ZonedDateTime.now().minusDays(1).plusYears(1) + " method chaining using the ZonedDateTime object"); // contains date, time and timezone.

        // writing dates and time
        LocalDate date1 = LocalDate.of(2005, 2, 20);
        LocalDate date2 = LocalDate.of(2024, Month.MAY, 07);
        System.out.println(date1);
        System.out.println(date2);

        // customizing time creation
        LocalTime time1 = LocalTime.of(13, 04); // prints the hour and minutes
        LocalTime time2 = LocalTime.of(13, 05, 12); // prints the hour, minutes and seconds
        LocalTime time3 = LocalTime.of(13, 06, 30, 200); // prints the hour, minutes, seconds and nano seconds
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        // combining date and time
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 05, 07, 13, 9, 30, 30000);
        LocalDateTime dateTime2 = LocalDateTime.of(2024, Month.MAY, 07, 13, 9, 30, 30000);
        LocalDateTime dateTime3 = LocalDateTime.of(date1, time3).minusDays(13).plusMonths(3).plusYears(19);
        LocalDateTime dateTime4 = LocalDateTime.of(LocalDate.of(2024, Month.MAY, 07), LocalTime.of(13, 05, 12));
        
        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3 + " method chaining example using date and time");
        System.out.println(dateTime4);

        // old way of creating dates
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.set(2024, Calendar.MAY, 07);
        d = c.getTime();
        System.out.println(d + " old way of using dates in java");
        System.out.println();

        // manipulating dates and times
        LocalDate d1 = LocalDate.of(2024, 05, 07);
        System.out.println(d1);
        // the Date and Time class are immutable like the String class
        d1 = d1.plusDays(2); // add  two days to the reference variable d1
        d1 = d1.minusDays(1); // subtracting one day
        d1 = d1.plusWeeks(3); // adding 3 weeks
        d1 = d1.plusMonths(1); // adding 1 month
        d1 = d1.plusYears(1);
        System.out.println(d1);

        System.out.println(LocalDate.ofEpochDay(20000)); // ofEpochDay() simple means number of days since 1970.
        // LocalTime don't have an epoch method.
        Period p1 = Period.ofMonths(2);
        Period p2 = Period.ofWeeks(3);
        Period p3 = Period.ofYears(3);
        Period p4 = Period.ofDays(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        // Periods does not support method chaining
        // example
        Period p5 = Period.ofDays(2).ofMonths(4); // this will execute just the last method of the chain and ignore the others so the output will be P4M
        System.out.println(p5); // prints P4M

        // the above code is equivalent to the code below:
        Period p6 = Period.ofDays(2);
        p6 = p6.ofMonths(4);
        System.out.println(p6);

        LocalDate dd = LocalDate.of(2024, 05, 07);
        LocalTime tt = LocalTime.of(14, 55);
        LocalDateTime dt = LocalDateTime.of(dd, tt);
        Period pp = Period.ofMonths((1));
        System.out.println(dd.plus(pp));
        System.out.println(dt.plus(pp));
        // System.out.println(tt.plus(pp)); // the LocalTime object doesn't support period meaning with can't add a period to a time.

        // formatting date and time
        LocalDate dd1 = LocalDate.of(2024, 05, 07);
        System.out.println(dd1.getDayOfMonth());
        System.out.println(dd1.getDayOfWeek());
        System.out.println(dd1.getYear());
        System.out.println(dd1.getDayOfYear());

        // to facilitate our work on formatting dates java provides us with a class DateTimeFormatter that we can use to format any type of date and/or time.
        // this class DateTimeFormatter is in the package java.time.format.
        // example
        LocalDate dd2 = LocalDate.of(2024, 05, 07);
        LocalTime tt1 = LocalTime.of(15, 9, 34);
        LocalDateTime dt1 = LocalDateTime.of(dd2, tt1);
        System.out.println(dd2.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(tt1.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dt1));
        // 1/20/20
        System.out.println(shortDateTime.format(dd2));
        // 1/20/20
       // System.out.println(
        //shortDateTime.format(tt1)); // UnsupportedTemporalTypeException


        // formatting using SHORT and MEDIUM
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(shortFormat.format(dateTime));
        System.out.println(mediumFormat.format(dateTime));

        // if you don't want to use the predefined formats you can create your own as seen below:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm:ss:nn");
        System.out.println(dateTime.format(dtf));

        // In java 7 and below the class used for formatting dates was the SimpleDateFormat class.

        // parsing dates and times (e.g converting a string to a date or time)
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date3 = LocalDate.parse("2024-05-07", dtf1);
        LocalTime time4 = LocalTime.parse("15:41:30");
        System.out.println(date3);
        System.out.println(time4);
    }
}