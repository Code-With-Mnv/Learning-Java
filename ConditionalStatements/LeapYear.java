package ConditionalStatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = s.nextInt();

        if(year%4==0 && year%100!=0){
            System.out.println("Leap.");
        }
        else if(year%4 == 0 && year%100 == 0){
            if (year%400 == 0){
                System.out.println("Leap.");
            }
            else{
                System.out.println("Not Leap.");
            }
        }
        else{
            System.out.println("Not Leap.");
        }
    }
}
