package Arrays;

import java.util.*;
import java.lang.*;

public class SumOElements {
    public static void main(String[] arg) {
        int array[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int sum = 0;

        for (int x : array) {
            sum = sum + x;
        }

        System.out.println(sum);
    }
}
