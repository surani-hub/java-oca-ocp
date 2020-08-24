package CalendarData;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2015,12,27);
        LocalDate date2 = LocalDate.of(2015, Month.DECEMBER,27);

        LocalDate date3 = LocalDate.now();

        LocalDate date4 = LocalDate.parse("2015-08-09");

        // LocalDate date5 = LocalDate.parse("2015-8-9");

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        // System.out.println(date5);

        System.out.println("************************************************************");

        System.out.println(date1.getDayOfMonth());  //
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getDayOfYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getYear());
        System.out.println(date1.getChronology());

        LocalDate chinniBday = LocalDate.parse("1998-09-15");
        LocalDate paakiBday = LocalDate.parse("1998-12-16");

        System.out.println(chinniBday.isAfter(paakiBday)); // false
        System.out.println(chinniBday.isBefore(paakiBday)); // true
        System.out.println(chinniBday.isBefore(chinniBday)); // false

        System.out.println(paakiBday.isBefore(chinniBday)); //false

        System.out.println("********************************************************");

        LocalDate bday= LocalDate.of(2052,03,10);

        System.out.println(bday.minusDays(10)); //
        System.out.println(bday.minusMonths(2));
        System.out.println(bday.minusWeeks(30));
        System.out.println(bday.minusYears(1));

        System.out.println("*********************************************");

        LocalDate firstDate = LocalDate.of(2036,02,28);
        System.out.println(firstDate.withDayOfMonth(1));
        System.out.println(firstDate.withDayOfYear(1));
        System.out.println(firstDate.withMonth(7));
        System.out.println(firstDate.withYear(1));


        System.out.println("**********************************************8");

        LocalDate interviewDate = LocalDate.parse("2020-08-31");

        System.out.println(interviewDate.atTime(16,32));
        System.out.println(interviewDate.atTime(16, 30,20));
        System.out.println(interviewDate.atTime(16,30,20,300));
        System.out.println(interviewDate.atTime(LocalTime.of(16,30)));

        System.out.println("********************************************");

        LocalDate aDate = LocalDate.of(1970, 2,5);
        LocalDate lunchBook = LocalDate.parse("1980-01-01");

        System.out.println(aDate.toEpochDay());
        System.out.println(lunchBook.toEpochDay());
    }
}
