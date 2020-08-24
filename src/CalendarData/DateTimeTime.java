package CalendarData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeTime {
    public static void main(String[] args) {

        ZonedDateTime time = ZonedDateTime.now();
        System.out.println(time.toString());


        //DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
       //DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
       // DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        String timeFormat1 = formatter2.format(time);
        //String timeFormat1 = formatter3.format(time);
        System.out.println(timeFormat1);

        //System.out.println(DateTimeFormatter. );
        //System.out.println(DateTimeFormatter.ISO_DATE_TIME);
        //System.out.println(DateTimeFormatter.ISO_LOCAL_DATE);
       // System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
       // System.out.println(DateTimeFormatter.ISO_LOCAL_TIME);



    }
}
