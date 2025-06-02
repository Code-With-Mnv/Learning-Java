import java.util.Scanner;

public class Cuboid
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);

        int length = s.nextInt();
        int breadth = s.nextInt();
        int height = s.nextInt();

        int volume = length * breadth * height;

        System.out.println("Volume is: " + volume);

    }
}
