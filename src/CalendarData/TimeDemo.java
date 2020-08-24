package CalendarData;

import java.time.LocalTime;

public class TimeDemo {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(12,12);

        LocalTime time3 = LocalTime.now();

        System.out.println(time1);
        System.out.println(time3);

        System.out.println(LocalTime.MIN.equals(LocalTime.MIDNIGHT));

        System.out.println("********************************888");
        LocalTime time4 = LocalTime.of(12,30,59,300);

        System.out.println(time4.getHour());
        System.out.println(time4.getMinute());
        System.out.println(time4.getSecond());
        System.out.println(time4.getNano());

        System.out.println("*******************************************************");

        LocalTime sudhaFinishTime = LocalTime.of(16,54,30);
        LocalTime paakFinishTime = LocalTime.of(16,54,40);

        if (sudhaFinishTime.isBefore(paakFinishTime))
            System.out.println("Sudha wins");
        else
            System.out.println("Paak wins");


        System.out.println("***********************************************");

        int finishTime = 35;
        System.out.println(sudhaFinishTime.minusMinutes(finishTime)); // 16:19:30

        int finishSeconds = 31;
        System.out.println(sudhaFinishTime.plusSeconds(finishSeconds)); // 16:55:01



















    }
}
