package Loops;
import java.util.Scanner;

public class SumOfN {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to generate a sum: ");
        int n = s.nextInt();
        int sum = 0;

        for(int i = 1; i<n+1; i++){
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
