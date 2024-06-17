package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now); //14:27:24.763014

        LocalTime localTime = LocalTime.of(17, 30, 30);
        System.out.println("localTime = " + localTime); //17:30:30

        LocalTime localTimePlusSeconds = localTime.plusSeconds(30);
        System.out.println("localTimePlusSeconds = " + localTimePlusSeconds); //17:31
    }
}
