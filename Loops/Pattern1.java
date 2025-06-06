package Loops;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        for(int i = 0; i<num; i++){
            for(int j = 1; j<num+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
