package Methods;

import java.util.Scanner;

public class GCD {
    static int calculateGCD(int a, int b) {
        int gcd = 1;
        if (a <= 0 || b <= 0) {
            System.out.println("Invalid inputs.");
            return -1;
        } else {
            for (int i = 1; i <= Math.min(a, b); i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number2: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        if (gcd != -1) {
            System.out.println(gcd);
        }
    }
}
