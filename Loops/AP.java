package Loops;
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for AP parameters
        System.out.print("Enter the first term: ");
        int firstTerm = sc.nextInt();

        System.out.print("Enter the common difference: ");
        int commonDiff = sc.nextInt();

        System.out.print("Enter the number of terms: ");
        int numTerms = sc.nextInt();

        System.out.println("Arithmetic Progression:");

        // Generate AP
        for (int i = 0; i < numTerms; i++) {
            System.out.print(firstTerm + (i * commonDiff) + " ");
        }

        sc.close();
    }
}