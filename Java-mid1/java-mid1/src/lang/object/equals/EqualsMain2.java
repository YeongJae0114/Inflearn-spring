package lang.object.equals;

public class EqualsMain2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("asd-1");
        UserV2 user2 = new UserV2("asd-1");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));
    }
}
