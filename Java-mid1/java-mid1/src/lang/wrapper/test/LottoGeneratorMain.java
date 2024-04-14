package lang.wrapper.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] num = lottoGenerator.generator();
        for (int i : num) {
            System.out.println(i);
        }
    }
}
