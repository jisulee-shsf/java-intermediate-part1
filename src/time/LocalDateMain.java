package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now); //2024-06-17

        LocalDate localDate = LocalDate.of(2024, 8, 1);
        System.out.println("localDate = " + localDate); //2024-08-01

        LocalDate localDatePlusDays = localDate.plusDays(31);
        System.out.println("localDatePlusDays = " + localDatePlusDays); //2024-09-01
    }
}
