package Loops;
import java.util.Scanner;

public class NumToWord {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        String num_str = ""+num;
        String to_word = "";

        for (int i = 0; i<num_str.length(); i++){
            char charr = num_str.charAt(i);

            switch(charr){
                case '0':
                    to_word = to_word + "Zero ";
                    break;
                case '1':
                    to_word = to_word + "One ";
                    break;
                case '2':
                    to_word = to_word + "Two ";
                    break;
                case '3':
                    to_word = to_word + "Three ";
                    break;
                case '4':
                    to_word = to_word + "Four ";
                    break;
                case '5':
                    to_word = to_word + "Five ";
                    break;
                case '6':
                    to_word = to_word + "Six ";
                    break;
                case '7':
                    to_word = to_word + "Seven ";
                    break;
                case '8':
                    to_word = to_word + "Eight ";
                    break;
                case '9':
                    to_word = to_word + "Nine ";
                    break;
            }
        }
        System.out.println(to_word);
    }
}
