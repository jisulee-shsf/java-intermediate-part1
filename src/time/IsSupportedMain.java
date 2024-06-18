package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 8, 1);
        System.out.println("localDate = " + localDate); //2024-08-01

        boolean supported = localDate.isSupported(ChronoField.MINUTE_OF_HOUR);
        System.out.println("supported = " + supported); //false

        if (supported) {
            int minuteOfHour = localDate.get(ChronoField.MINUTE_OF_HOUR);
            System.out.println("minuteOfHour = " + minuteOfHour);
        }
    }
}
