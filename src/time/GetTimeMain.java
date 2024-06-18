package time;

import java.time.LocalDateTime;

import static java.time.temporal.ChronoField.*;

public class GetTimeMain {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 8, 1, 17, 30, 50);
        System.out.println("YEAR = " + localDateTime.get(YEAR)); //2024
        System.out.println("MONTH_OF_YEAR = " + localDateTime.get(MONTH_OF_YEAR)); //8
        System.out.println("DAY_OF_MONTH = " + localDateTime.get(DAY_OF_MONTH)); //1
        System.out.println("HOUR_OF_DAY = " + localDateTime.get(HOUR_OF_DAY)); //17
        System.out.println("MINUTE_OF_HOUR = " + localDateTime.get(MINUTE_OF_HOUR)); //30
        System.out.println("SECOND_OF_MINUTE = " + localDateTime.get(SECOND_OF_MINUTE)); //50

        //1. 편의 메서드가 제공되는 경우
        System.out.println("YEAR = " + localDateTime.getYear()); //2024
        System.out.println("MONTH_OF_YEAR = " + localDateTime.getMonthValue()); //8
        System.out.println("DAY_OF_MONTH = " + localDateTime.getDayOfMonth()); //1
        System.out.println("HOUR_OF_DAY = " + localDateTime.getHour()); //17
        System.out.println("MINUTE_OF_HOUR = " + localDateTime.getMinute()); //30
        System.out.println("SECOND_OF_MINUTE = " + localDateTime.getSecond()); //50

        //2. 편의 메서드가 제공되지 않는 경우
        System.out.println("MINUTE_OF_DAY = " + localDateTime.get(MINUTE_OF_DAY)); //1050
        System.out.println("SECOND_OF_DAY = " + localDateTime.get(SECOND_OF_DAY)); //63050
    }
}
