package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        //1. 생성
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now); //2024-06-17T14:43:21.873730

        LocalDateTime localDateTime = LocalDateTime.of(2024, 8, 1, 17, 30, 30);
        System.out.println("localDateTime = " + localDateTime); //2024-08-01T17:30:30

        //2. 계산
        LocalDateTime localDateTimePlusDays = localDateTime.plusDays(31);
        System.out.println("localDateTimePlusDays = " + localDateTimePlusDays); //2024-09-01T17:30:30

        //3. 분리
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("localDate = " + localDate); //2024-08-01
        System.out.println("localTime = " + localTime); //17:30:30

        //4. 결합
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime2 = " + localDateTime2); //2024-08-01T17:30:30

        //5. 비교
        System.out.println("now.isBefore(localDateTime) = " + now.isBefore(localDateTime)); //true
        System.out.println("now.isAfter(localDateTime) = " + now.isAfter(localDateTime)); //false
        System.out.println("now.isEqual(localDateTime) = " + now.isEqual(localDateTime)); //false
    }
}
