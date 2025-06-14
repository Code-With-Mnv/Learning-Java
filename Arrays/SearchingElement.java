package Arrays;

import java.util.*;
import java.lang.*;

public class SearchingElement {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        int array[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int elementToSearch = s.nextInt();

        for (int x : array) {
            if(x==elementToSearch){
                System.out.println("Element Found!");
            }
        }
    }
}
