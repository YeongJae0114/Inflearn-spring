package enumeration.ex2;


public class DiscountService {
    public int discount(ClassGrade classGrade, int price){
        int discountPercent = 0;
        if (classGrade == classGrade.BASIC){
            discountPercent = 10;
        } else if (classGrade == classGrade.GOLD) {
            discountPercent =20;
        } else if (classGrade==classGrade.DIAMOND) {
            discountPercent = 30;
        }else {
            discountPercent = 0 ;
        }
        return price * discountPercent / 100;
    }
}
