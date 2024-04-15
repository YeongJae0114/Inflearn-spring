package lang.enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;


        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);


        System.out.println("vip = " + vip);
        System.out.println("diamondd = " + diamondd);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
