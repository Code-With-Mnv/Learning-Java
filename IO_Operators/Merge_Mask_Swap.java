package IO_Operators;

public class Merge_Mask_Swap
{
    public static void main(String[] arg)
    {
        int a = 10, b = 15;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);
    }
}
