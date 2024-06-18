package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 8, 1, 17, 30, 50);
        LocalDateTime plusLocalDateTime1 = localDateTime.plus(10, ChronoUnit.YEARS);
        LocalDateTime plusLocalDateTime2 = localDateTime.plusYears(10);
        LocalDateTime plusLocalDateTime3 = localDateTime.plus(Period.ofYears(10));
        System.out.println("plusLocalDateTime1 = " + plusLocalDateTime1); //2034-08-01T17:30:50
        System.out.println("plusLocalDateTime2 = " + plusLocalDateTime2); //2034-08-01T17:30:50
        System.out.println("plusLocalDateTime3 = " + plusLocalDateTime3); //2034-08-01T17:30:50
    }
}
