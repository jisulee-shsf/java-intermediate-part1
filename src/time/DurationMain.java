package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {

    public static void main(String[] args) {
        Duration duration = Duration.ofHours(3);
        System.out.println("duration = " + duration); //PT3H

        LocalTime localTime = LocalTime.of(17, 30);
        LocalTime plusDurationTime = localTime.plus(duration);
        System.out.println("plusDurationTime = " + plusDurationTime); //20:30

        LocalTime startTime = LocalTime.of(1, 0);
        LocalTime endTime = LocalTime.of(2, 30);
        Duration between = Duration.between(startTime, endTime);
        System.out.println("between = " + between); //PT1H30M
        System.out.println(between.toHours() + "분 " + between.toMinutesPart() + "분"); //1분 30분
    }
}
