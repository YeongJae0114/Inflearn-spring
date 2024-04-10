package lang.immutable.address;

public class MemberV1Main {
    public static void main(String[] args) {
        Address address = new Address("서울");
        MemberV1 memberA = new MemberV1("A", address);
        MemberV1 memberB = new MemberV1("B", address);

        System.out.println("memberA = "+memberA);
        System.out.println("memberB = "+memberB);

        memberB.getAddress().setValue("부산");
        System.out.println("memberA = "+memberA);
        System.out.println("memberB = "+memberB);
    }
}
