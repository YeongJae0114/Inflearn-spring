package lang.wrapper.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNums;
    private int count;

    public int[]generator(){
        lottoNums = new int[6];
        count =0;
        while (count<6){
            int number = random.nextInt(45)+1;
            if (isUnique(number)){
                lottoNums[count] = number;
                count++;
            }
        }
        return lottoNums;
    }
    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNums[i] == number) {
                return false;
            }
        }
        return true;
    }
}
