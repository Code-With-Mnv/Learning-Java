package Loops;
import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to generate a sum: ");
        int n = s.nextInt();
        int fact = 1;

        for(int i = 1; i<n+1; i++){
            fact = fact * i;
        }

        System.out.println(fact);
    }
}