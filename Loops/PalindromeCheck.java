package Loops;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = s.nextInt();
        String str = ""+num;
        String revstr = "";

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            revstr = revstr + rem;
        }

        if(str.equals(revstr)){
            System.out.println("Palindrome!");
        } else{
            System.out.println("No.");
        }
    }
}
