public class Prices {
    public static void main(String[] args) {
        String  productname = "packet of spaghetti";
        double price = 5.00;
        int quantity = 3;
        double total = price * quantity;
        System.out.println(quantity + " of " + productname + " at $" + price + " costs a total of $" + total);
        // string format with 2 decimal places
        System.out.printf("%d of %s  at %.2f each is a total of $%.2f\n", quantity, productname, price, total);
    }
}
