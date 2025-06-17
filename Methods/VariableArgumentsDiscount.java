package Methods;

public class VariableArgumentsDiscount {
    static double discountedPrice(int... prices) {
        double pricePostdiscount = 0;
        int totalPrice = 0;

        for (int x : prices) {
            totalPrice += x;
        }

        if (totalPrice > 100 && totalPrice < 500) {
            pricePostdiscount = totalPrice * 0.9;
        } else if (totalPrice > 1000 && totalPrice < 5000) {
            pricePostdiscount = totalPrice * 0.8;
        } else {
            pricePostdiscount = totalPrice * 0.6;
        }
        return pricePostdiscount;
    }

    public static void main(String[] args) {
        double pricePostdiscount = discountedPrice(250, 800, 1500, 420, 1100, 750, 300, 950, 2000, 600, 1800, 500, 1300, 1000, 700);

        System.out.println(pricePostdiscount);
    }
}
