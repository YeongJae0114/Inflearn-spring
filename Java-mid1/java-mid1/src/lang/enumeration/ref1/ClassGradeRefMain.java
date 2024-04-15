package lang.enumeration.ref1;


public class ClassGradeRefMain {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        int BASIC = discountService.discount(ClassGrade.BASIC, price);
        int GOLD = discountService.discount(ClassGrade.GOLD, price);
        int DIAMOND = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC = " + BASIC);
        System.out.println("GOLD = " + GOLD);
        System.out.println("DIAMOND = " + DIAMOND);
    }
}
