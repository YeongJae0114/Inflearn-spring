package lang.enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        //ClassGrade newClassGrade = new ClassGrade(); // 생성자 private 로 막아야함.

        int result = discountService.discount(ClassGrade.DIAMOND,price);
        System.out.println(result);
    }
}
