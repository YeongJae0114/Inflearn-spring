package time;

import java.time.ZoneId;

public class ZonedIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);

            System.out.println("zoneId = " + zoneId.getRules());

        }
    }
}
