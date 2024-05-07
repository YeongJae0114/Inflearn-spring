package time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt= LocalDateTime.of(2030,1,1,12,30,50);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime = " + zonedDateTime);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0,
                ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        ZonedDateTime utc = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utc = " + utc);

    }
}
