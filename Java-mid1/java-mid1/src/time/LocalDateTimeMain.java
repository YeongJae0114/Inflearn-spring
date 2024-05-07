package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016,8,16,8,10,1);
        System.out.println("nowDt = " + nowDt);
        System.out.println("ofDt = " + ofDt);

        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDt = LocalDateTime.of(localDate, localTime);
        System.out.println("localDt = " + localDt);

        //계산
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus = " + ofDtPlus);
        LocalDateTime ofDtPlus1 = ofDt.plusYears(1);
        System.out.println("ofDtPlus1 = " + ofDtPlus1);

        //비교
        System.out.println("현재가 지정 날짜 시간보다 이전인가?"+ nowDt.isBefore(ofDt));
        System.out.println("현재가 지정 날짜 시간보다 이후인가?"+ nowDt.isAfter(ofDt));
        System.out.println("현재가 지정 날짜 시간과 같은가?"+ nowDt.equals(ofDt));
    }
}
