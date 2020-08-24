package ExceptionHandling;

import java.time.LocalTime;

public class TestTrip {
    public static void main(String[] args) throws FeelingHungryException {
        Trip trip = new Trip();
        trip.goTrekking(LocalTime.of(11,24));
    }
}
