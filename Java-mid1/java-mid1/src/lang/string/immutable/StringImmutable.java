package lang.string.immutable;

public class StringImmutable {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // `String` 클래스는 불변으로 설계되어서 이런 사이드 이펙트 문제가 발생하지 않는다.
    }
}
