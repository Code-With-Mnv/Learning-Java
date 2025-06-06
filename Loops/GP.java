package Loops;
import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for GP parameters
        System.out.print("Enter the first term: ");
        int firstTerm = sc.nextInt();

        System.out.print("Enter the common ratio: ");
        int commonRatio = sc.nextInt();

        System.out.print("Enter the number of terms: ");
        int numTerms = sc.nextInt();

        System.out.println("Geometric Progression:");

        // Generate GP
        int term = firstTerm;
        for (int i = 0; i < numTerms; i++) {
            System.out.print(term + " ");
            term *= commonRatio;  // Multiply by common ratio to get the next term
        }

        sc.close();
    }
}