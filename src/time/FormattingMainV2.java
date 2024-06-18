package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMainV2 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 8, 1, 17, 30, 50);
        System.out.println("localDateTime = " + localDateTime); //2024-08-01T17:30:50

        // 1. format()
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedLocalDateTime = localDateTime.format(formatter);
        System.out.println("formattedLocalDateTime = " + formattedLocalDateTime); //2024-08-01 17:30:50

        // 2.parse()
        LocalDateTime parsedLocalDateTime = LocalDateTime.parse(formattedLocalDateTime, formatter);
        System.out.println("parsedLocalDateTime = " + parsedLocalDateTime); //2024-08-01T17:30:50
    }
}
