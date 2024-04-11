package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String s = "hello java";
        StringBuilder str = new StringBuilder(s).reverse();

        System.out.println(str);
    }
}
