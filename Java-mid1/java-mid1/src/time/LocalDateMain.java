package time;


import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate newDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("newDate = " + newDate);
        System.out.println("ofDate = " + ofDate);

        // 계산 (불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날자 + 10d = " + ofDate);
    }
}
