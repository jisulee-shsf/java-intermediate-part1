package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {

    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println("now = " + now); //2024-06-17T16:23:45.570384+09:00

        LocalDateTime localDateTime = LocalDateTime.of(2024, 8, 1, 17, 30, 30);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.of("+03:00"));
        System.out.println("offsetDateTime = " + offsetDateTime); //2024-08-01T17:30:30+03:00
    }
}
