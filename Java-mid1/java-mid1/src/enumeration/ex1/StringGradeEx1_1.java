package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGradle.BASIC, price);
        int gold = discountService.discount(StringGradle.GOLD, price);
        int diamond = discountService.discount(StringGradle.DIAMOND, price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
