package Operators;

import java.util.Scanner;

public class Quadratic
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);

        int a,b,c;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        float root1, root2;
        double determinant = Math.sqrt(b*b-4*a*c);
        root1 = (float)(-b+determinant)/2*a;
        root2 = (float)(-b-determinant)/2*a;

        System.out.println("The roots are: " + root1 + ", " + root2);
    }
}
