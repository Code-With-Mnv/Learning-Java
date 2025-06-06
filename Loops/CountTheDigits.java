package Loops;
import java.util.Scanner;

public class CountTheDigits {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            count++;
        }

        System.out.println(count);
    }
}
