package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 8, 1, 17, 30, 50);
        System.out.println("localDateTime = " + localDateTime); //2024-08-01T17:30:50

        LocalDateTime withLocalDateTime1 = localDateTime.with(ChronoField.YEAR, 2020);
        System.out.println("withLocalDateTime1 = " + withLocalDateTime1); //2020-08-01T17:30:50

        LocalDateTime withLocalDateTime2 = localDateTime.withYear(2022);
        System.out.println("withLocalDateTime2 = " + withLocalDateTime2); //2022-08-01T17:30:50

        LocalDateTime withLocalDateTime3 = localDateTime.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("withLocalDateTime3 = " + withLocalDateTime3); //2024-08-05T17:30:50

        LocalDateTime withLocalDateTime4 = localDateTime.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println("withLocalDateTime4 = " + withLocalDateTime4); //2024-08-30T17:30:50
    }
}
