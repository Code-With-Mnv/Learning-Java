package Strings;

import java.util.*;

public class String_Manipulation
{
    public static void main(String[] arg)
    {
        //Remove special characters from a string
        //Remove the extra spaces in a string
        //Find the number of words in a string

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the string to manipulate: ");
        String str = s.nextLine();

        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println(str.replaceAll("\\s+", " "));
        System.out.println(str.split("\\s+").length);
    }
}