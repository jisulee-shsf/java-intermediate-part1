package time;

import java.time.ZoneId;
import java.time.zone.ZoneRules;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println("zoneId = " + zoneId);
        }

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId); //Asia/Seoul

        ZoneRules seoulRules = seoulZoneId.getRules();
        System.out.println("seoulRules = " + seoulRules); //ZoneRules[currentStandardOffset=+09:00]

        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println("defaultZoneId = " + defaultZoneId); //Asia/Seoul
    }
}
