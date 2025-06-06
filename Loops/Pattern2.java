package Loops;
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        for(int i = 1; i<num+1; i++){
            for(int j = 1; j < i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
