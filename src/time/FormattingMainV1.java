package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMainV1 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 8, 1);
        System.out.println("localDate = " + localDate); //2024-08-01

        // 1. format()
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = localDate.format(formatter);
        System.out.println("formattedDate = " + formattedDate); //2024년 08월 01일

        // 2.parse()
        LocalDate parsedDate = LocalDate.parse(formattedDate, formatter);
        System.out.println("parsedDate = " + parsedDate); //2024-08-01
    }
}
