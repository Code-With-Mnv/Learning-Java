public class String_Methods
{
    public static void main(String[] arg)
    {
        String str = "IntelliJ IDEA";
        //or
        String str_alt = new String("IntelliJ IDEA");

        System.out.println(str.length());

        String str_upper = str.toUpperCase();
        String str_lower = str.toLowerCase();

        System.out.println(str_upper);
        System.out.println(str_lower);

        String str_replaced = str.replace('I', 'K');
        System.out.println(str_replaced);

        String str_untrimmed = "    " + str + "    ";
        System.out.println(str_untrimmed);
        String str_trimmed = str_untrimmed.trim();
        System.out.println(str_trimmed);

        String substr = str.substring(3, 9);
        System.out.println(substr);

        System.out.println(str.indexOf('l'));
        System.out.println(str.lastIndexOf('l'));

        System.out.println(str.startsWith("Intel"));
        System.out.println(str.endsWith("idea"));

        System.out.println(str.charAt(5));

        for(int i = 0; i < str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }

        String str_to_compare1 = "Java Jamaica";
        String str_to_compare2 = "Java Jamaica";
        System.out.println(str_to_compare1.equals(str_to_compare2));
        System.out.println(str_to_compare1 == str_to_compare2);

        str_to_compare2 = str.toLowerCase();
        System.out.println(str_to_compare1.equals(str_to_compare2));
        System.out.println(str.equalsIgnoreCase(str_to_compare2));
    }
}
