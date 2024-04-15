package lang.enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        // 아직 문자열로 입력 받을수 있기 때문에 완전히 오류에서 벗어날 수 없다.

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        // 오타
        int diamondd = discountService.discount(StringGradle.DIAMOND, price);

        System.out.println("vip = " + vip);
        System.out.println("diamondd = " + diamondd);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
