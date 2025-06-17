package Methods;

import java.util.Scanner;

public class PrimeNumber {
    void checkPrime(int num) {
        if (num == 0 || num == 1) {
            System.out.println("Neither Prime nor Composite.");
            return;
        } else if (num == 2) {
            System.out.println("Prime!");
            return;
        } else if (num % 2 == 0 && num > 2) {
            System.out.println("Not Prime.");
            return;
        } else {
            for (int i = 3; i < Math.sqrt(num); i = i + 2) {
                if (num % i == 0) {
                    System.out.println("Not prime");
                    return;
                }
            }
            System.out.println("Prime");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int num = scanner.nextInt();

        PrimeNumber primenumber = new PrimeNumber();
        primenumber.checkPrime(num);
    }
}
