package lang.enumeration.ex1;

public class DiscountService {
    public  int discount(String grade, int price){
        int discountPercent = 0;
        if (grade.equals(StringGradle.BASIC)){
            discountPercent = 10;
        } else if (grade.equals(StringGradle.GOLD)) {
            discountPercent = 20;
        }else if (grade.equals(StringGradle.DIAMOND)){
            discountPercent = 30;
        }else {
            System.out.println(grade + ": 할인 X");
        }
        return price * discountPercent / 100;
    }
}
