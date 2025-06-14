package Arrays;

import java.lang.*;

public class FindingSecondLargest {
    public static void main(String[] arg) {
        int[] array = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int max = 0, index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }

        array[index] = 0;
        max = 0;

        for (int x : array) {
            if (x >= max) {
                max = x;
            }
        }

        System.out.println(max);

    }
}
