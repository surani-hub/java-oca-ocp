package CalendarData;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.parse("2020-08-16");


        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

        //String formatDate1 = formatter1.format(new Date());
        //System.out.println(formatDate1);

        String formatDate2 = formatter2.format(date1);
        System.out.println(formatDate2);

        String formatDate3 = formatter3.format(date1);
        System.out.println(formatDate3);

        String formatDate4 = formatter4.format(date1);
        System.out.println(formatDate4);

        System.out.println( DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(date1));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(date1));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(date1));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(date1));


        System.out.println("***********************************************");


        LocalTime time1 = LocalTime.of(3,58,12,500);

        /*System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL).format(time1));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).format(time1));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(time1));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(time1));*/

















    }
}
