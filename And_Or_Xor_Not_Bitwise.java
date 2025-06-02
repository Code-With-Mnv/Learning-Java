public class And_Or_Xor_Not_Bitwise
{
    public static void main(String[] arg)
    {
        int x = 0b0011;
        int y = 0b1010;
        int z1 = x&y;
        int z2 = x|y;
        int z3 = x^y;
        int z4 = x<<2;
        int z5 = y>>2;
        boolean z6 = x!=y;

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z4);
        System.out.println(z5);
        System.out.println(z6);
    }
}
