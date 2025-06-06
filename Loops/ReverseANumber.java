package Loops;
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = s.nextInt();
        String revstr = "";

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            revstr = revstr + rem;
        }

        System.out.println(revstr);
    }
}
