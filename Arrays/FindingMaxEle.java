package Arrays;

import java.lang.*;

public class FindingMaxEle {
    public static void main(String[] arg) {
        int[] array = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int max = 0;

        for (int x : array) {
            if (x >= max) {
                max = x;
            }
        }

        System.out.println(max);
    }
}
