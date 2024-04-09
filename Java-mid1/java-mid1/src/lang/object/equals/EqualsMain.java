package lang.object.equals;

public class EqualsMain {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("asd-1");
        UserV1 user2 = new UserV1("asd-1");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));
    }
}
