package CalendarData;

import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {

        LocalDateTime prizeCeremony = LocalDateTime.parse("2050-06-05T14:00:00");
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println(currentDateTime);

        if (prizeCeremony.getMonthValue() == 6)
            System.out.println("Can't invite President");
        else
            System.out.println("President invited");

LocalDateTime chiefGuestDeparture = LocalDateTime.parse("2050-06-05T14:30:00");

        if (prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture))
            System.out.println("Chief guest will leave");

















    }
}
