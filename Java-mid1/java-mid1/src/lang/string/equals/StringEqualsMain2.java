package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("isSame : "  +isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("isSame : "  +isSame(str3, str4));
    }
    public static boolean isSame(String x, String y){
        //return x==y;
        return x.equals(y);
    }

}
