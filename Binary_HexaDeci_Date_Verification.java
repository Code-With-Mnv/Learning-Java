import java.util.Scanner;

public class Binary_HexaDeci_Date_Verification
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the string to verify: ");
        String str = s.nextLine();

        String bin_regex = "^[01]+$";

        if (str.matches(bin_regex))
        {
            System.out.println("The string is a binary number.");
        }

        String hex_regex = "^[0-9a-fA-F]+$";

        if (str.matches(hex_regex))
        {
            System.out.println("The string is a hexadecimal number.");
        }

        String date_regex = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";

        if (str.matches(date_regex))
        {
            System.out.println("The string is a date.");
        }
    }
}
