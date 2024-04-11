package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);
        System.out.println(str.substring(0,extIndex));
        System.out.println(str.substring(extIndex));
    }
}
