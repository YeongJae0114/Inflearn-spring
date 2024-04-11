package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] parts = email.split("@");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
    }
}
