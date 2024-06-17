package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now = " + now); //2024-06-17T16:06:30.988124+09:00[Asia/Seoul] -> ZoneId.systemDefault()

        LocalDateTime localDateTime = LocalDateTime.of(2024, 8, 1, 17, 30, 30);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
        System.out.println("zonedDateTime = " + zonedDateTime); //2024-08-01T17:30:30+09:00[Asia/Seoul]

        ZonedDateTime utcZonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZonedDateTime = " + utcZonedDateTime); //2024-08-01T08:30:30Z[UTC]

        ZonedDateTime nowUtcZonedDateTime = now.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("now = " + now); //2024-06-17T16:13:33.796906+09:00[Asia/Seoul]
        System.out.println("nowUtcZonedDateTime = " + nowUtcZonedDateTime); //2024-06-17T07:13:33.796906Z[UTC]
        System.out.println("now.isEqual(nowUtcZonedDateTime) = " + now.isEqual(nowUtcZonedDateTime)); //true
        System.out.println("now.equals(nowUtcZonedDateTime) = " + now.equals(nowUtcZonedDateTime)); //false
    }
}
