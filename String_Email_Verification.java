import java.util.*;

public class String_Email_Verification
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the email address: ");
        String email = s.nextLine();

        boolean isGmail = email.endsWith("gmail.com");
        String username = email.substring(0, email.indexOf('@'));
        System.out.println("The username is: " + username);

        if (isGmail)
        {
            System.out.println("The email address is on gmail.");
        }

        else
        {
            int pos = email.indexOf('@');
            String domain = email.substring(pos+1);

            System.out.println("The email address is not on gmail and the domain is: " + domain);
        }
    }
}
