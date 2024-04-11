package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello Java";
        String str2 = "hello Java";
        String str3 = "Hello world";

        System.out.println("str1 equals str2 : " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2 : " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a' "+ "b".compareTo("a"));
        System.out.println("'str1' compareTo 'str3' "+ str1.compareTo(str3));
        System.out.println("'str1' compareToIgnoreCase 'str3' "+ str1.compareToIgnoreCase(str2));

        System.out.println("'str1' startsWith 'hello' "+ str1.startsWith("Hello"));
        System.out.println("'str1' endsWith 'Java' "+ str1.endsWith("Java"));

    }
}
