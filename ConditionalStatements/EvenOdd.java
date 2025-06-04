package ConditionalStatements;
import java.util.*;

public class EvenOdd {

    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number here: ");
        int num = s.nextInt();

        if (num%2 == 0){
            System.out.println("It's Even!");
        }
        else{
            System.out.println("It's Odd!");
        }
    }
}
