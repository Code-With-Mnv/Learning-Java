package ConditionalStatements;
import java.util.*;

public class YoungOld {

    public static void main(String[] arg){

        Scanner s = new Scanner(System.in);

        int age = s.nextInt();

        if (age<=14){
            System.out.println("Too young!");
        } else if (age>14 && age<=55) {
            System.out.println("Young!");
        } else {
            System.out.println("Too Old!");
        }
    }
}
