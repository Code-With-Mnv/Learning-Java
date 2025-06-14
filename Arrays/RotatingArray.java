package Arrays;

public class RotatingArray {
    public static void main(String[] arg) {
        int[] array = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int[] revArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0 && j < array.length; i--, j++) {
            revArray[j] = array[i];
        }

        for (int x : revArray){
            System.out.print(x+" ");
        }
    }
}
