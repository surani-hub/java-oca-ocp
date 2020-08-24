package CalendarData;

import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        Period period1 = Period.of(1,2,5);

        System.out.println(period1.getDays());
        System.out.println(period1.getMonths());
        System.out.println(period1.getYears());
        System.out.println(period1.getUnits());

        System.out.println("*****************************");

        System.out.println(Period.ofYears(2));
        System.out.println(Period.ofMonths(12));
        System.out.println(Period.ofWeeks(35));
        System.out.println(Period.ofDays(12));

        System.out.println(Period.ofDays(-15));

        System.out.println("***********************************************************");

        System.out.println(Period.parse("P5y"));
        System.out.println(Period.parse("p5y"));
        System.out.println(Period.parse("P5Y"));
        System.out.println(Period.parse("+P5Y"));
        System.out.println(Period.parse("P+5Y"));
        System.out.println(Period.parse("-P-5Y"));

        System.out.println("*******************************************************");

        System.out.println(Period.parse("-P2Y"));
        System.out.println(Period.parse("-P2M"));
        System.out.println(Period.parse("-P2W"));
        System.out.println(Period.parse("-P2D"));

        System.out.println("***********************************");

        System.out.println(Period.of(2019,12,23).isZero()); // false
        System.out.println(Period.of(0,0,12).isZero()); // false
        System.out.println(Period.of(0,0,0).isZero()); // true

        System.out.println(Period.of(2010, 8,-5).isNegative()); // true

        System.out.println("**********************************************************************");

        System.out.println(Period.of(0,0,10).minus(Period.of(0,1,0))); //P-1M10D
        System.out.println(Period.of(0,0,10).minusDays(5));
        System.out.println(Period.of(0,0,10).minusMonths(5));
        System.out.println(Period.of(0,0,10).minusYears(5));

        System.out.println("************************************************");

        System.out.println(Period.of(1,9,20).multipliedBy(2));
        System.out.println(Period.of(1,9,20).multipliedBy(-2));

        System.out.println("***********************************");

        System.out.println(Period.of(10,5,40).toTotalMonths());
        System.out.println(Period.of(10,5,40));











    }
}
