package Loops;
import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = s.nextInt();

        while(num>0){
            int rem = num%10;
            System.out.println(rem);
            num = num/10;
        }
    }
}
