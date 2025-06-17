package Methods;

import java.util.Scanner;

public class OverloadingReversal {
    static int[] reverse(int[] arr) {
        int[] revarr = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0 && j < arr.length; i--, j++) {
            revarr[j] = arr[i];
        }

        return revarr;
    }

    static String reverse(int num) {
        return new StringBuilder(String.valueOf(num)).reverse().toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] revarr = reverse(arr);
        String revnum = reverse(num);

        for (int x : revarr){
            System.out.print(x+" ");
        }
        System.out.println(revnum);
    }
}
