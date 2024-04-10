package lang.immutable.test;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableMyDate immutableMyDate = new ImmutableMyDate(2024,4,10);

        System.out.println("date"+immutableMyDate);

        ImmutableMyDate immutableMyDate1 = immutableMyDate.changeDate(2024,4,11);
        System.out.println("date"+immutableMyDate);
        System.out.println("date1"+immutableMyDate1);
    }
}
