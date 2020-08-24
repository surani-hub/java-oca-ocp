package ExceptionHandling;

import java.time.LocalTime;

public class Trip {
    void goTrekking(LocalTime startTime) throws FeelingHungryException {
        int hrs = LocalTime.now().getHour() - startTime.getHour();
        if (hrs>=2) throw new FeelingHungryException();

    }
}
