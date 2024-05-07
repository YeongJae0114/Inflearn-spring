package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 3);

        ofTime = ofTime.plusSeconds(10);
        System.out.println("지정 초 + 10d = " + ofTime);
    }
}
