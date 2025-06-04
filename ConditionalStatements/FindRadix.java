package ConditionalStatements;
import java.util.*;

public class FindRadix {

    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number string: ");
        String num = s.nextLine();

        String binary = "^[01]+$";
        String octal = "^[0-7]+$";
        String decimal = "^[0-9]+$";
        String hexadecimal = "^[0-9a-fA-F]+$";

        if (num.matches(binary)){
            System.out.println("Binary!");
        } else if (num.matches(octal)) {
            System.out.println("Octal!");
        } else if (num.matches(decimal)) {
            System.out.println("Decimal!");
        } else if (num.matches(hexadecimal)) {
            System.out.println("Hexadecimal!");
        } else {
            System.out.println("Invalid Input!");
        }
    }
}
