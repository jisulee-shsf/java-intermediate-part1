package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        Period period = Period.ofDays(31);
        System.out.println("period = " + period); //P31D

        LocalDate currentDate = LocalDate.of(2024, 8, 1);
        LocalDate plusPeriodDate = currentDate.plus(period);
        System.out.println("plusPeriodDate = " + plusPeriodDate); //2024-09-01

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 2, 15);
        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between); //P1M14D
        System.out.println(between.getMonths() + "개월 " + between.getDays() + "일"); //1개월 14일
    }
}
