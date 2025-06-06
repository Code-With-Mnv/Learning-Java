package Loops;
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        for(int i =0; i<num; i++){
            for(int sp = 0; sp<i; sp++){
                System.out.print(" ");
            }
            for(int st = num-i; st>0; st--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
