package Loops;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for number of terms
        System.out.print("Enter the number of terms: ");
        int numTerms = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}