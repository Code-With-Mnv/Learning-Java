package Arrays;

import java.util.*;
import java.lang.*;

public class Practicing1DArrays {
    public static void main(String[] arg) {
        //creating an array
        int array1[] = new int[10];
        int array2[] = {2, 4, 6, 8, 4, 6, 7, 6, 4, 5};

        //length
        int len = array2.length;
        System.out.println(len);

        //printing the array
        //for loop
        for (int i = 0; i < len; i++) {
            System.out.print(array1[i]+",");
        }
        System.out.println();
        //for each loop
        for (int x : array2) {
            System.out.print(x+",");
        }
    }
}
