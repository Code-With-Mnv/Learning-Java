package Loops;
import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to generate a table: ");
        int n = s.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
