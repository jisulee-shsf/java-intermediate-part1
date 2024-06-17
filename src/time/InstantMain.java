package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        Instant nowInstant = Instant.now();
        System.out.println("nowInstant = " + nowInstant); //2024-06-17T08:11:23.462964Z

        ZonedDateTime nowZonedDateTime = ZonedDateTime.now();
        Instant instant = Instant.from(nowZonedDateTime);
        System.out.println("instant = " + instant); //2024-06-17T08:11:23.501155Z

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart); //1970-01-01T00:00:00Z

        Instant epochStartPlusSeconds = epochStart.plusSeconds(3600);
        System.out.println("epochStartPlusSeconds = " + epochStartPlusSeconds); //1970-01-01T01:00:00Z

        long epochSecond = epochStartPlusSeconds.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond); //3600
    }
}
