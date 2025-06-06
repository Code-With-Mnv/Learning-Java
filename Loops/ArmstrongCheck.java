package Loops;
import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = s.nextInt();

        int temp=num;
        double sum=0;

        int count = 0;

        while (temp > 0) {
            int rem = temp % 10;
            temp = temp / 10;
            count++;
        }

        int temp2 = num;

        while(temp2>0){
            int rem = temp2%10;
            sum = sum+(Math.pow(rem, count));
            temp2 = temp2/10;
        }

        if (num==sum){
            System.out.println("Armstrong!");
        } else{
            System.out.println("No!");
        }
    }
}
