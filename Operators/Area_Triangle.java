package Operators;

import java.util.*;

public class Area_Triangle
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of the sides:");

        int a,b,c;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        float sp = (float) (a + b + c) /2;

        double area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));

        System.out.println("Area of Triangle: " + area);
    }
}
