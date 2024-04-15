package lang.enumeration.ex3;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int BASIC = discountService.discount(Grade.BASIC, price);
        int GOLD = discountService.discount(Grade.GOLD, price);
        int DIAMOND = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC = " + BASIC);
        System.out.println("GOLD = " + GOLD);
        System.out.println("DIAMOND = " + DIAMOND);
    }
}
