package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {

    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println("value = " + value + ", range = " + value.range()); //SecondOfMinute, range = 0 - 59···
        }

        System.out.println("DAY_OF_YEAR = " + ChronoField.DAY_OF_YEAR.range()); //1 - 365/366
        System.out.println("DAY_OF_MONTH = " + ChronoField.DAY_OF_MONTH.range()); //1 - 28/31
        System.out.println("DAY_OF_WEEK = " + ChronoField.DAY_OF_WEEK.range()); //1 - 7
    }
}
