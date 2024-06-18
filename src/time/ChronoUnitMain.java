package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value); //Hours···
        }

        System.out.println("HOURS.getDuration().toMinutes() = " + ChronoUnit.HOURS.getDuration().toMinutes()); //60
        System.out.println("HOURS.getDuration().getSeconds() = " + ChronoUnit.HOURS.getDuration().getSeconds()); //3600

        LocalTime localTime1 = LocalTime.of(1, 0);
        LocalTime localTime2 = LocalTime.of(1, 30);
        long minutesBetween = ChronoUnit.MINUTES.between(localTime1, localTime2);
        System.out.println("minutesBetween = " + minutesBetween); //30
        long secondsBetween = ChronoUnit.SECONDS.between(localTime1, localTime2);
        System.out.println("secondsBetween = " + secondsBetween); //1800
    }
}
