package Methods;

public class MaxOfArray {
    static int findMax(int[] arr) {
        int max = 0;

        for (int x : arr) {
            if (x >= max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = findMax(arr);

        System.out.println(max);
    }
}
