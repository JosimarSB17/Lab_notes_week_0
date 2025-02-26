import static input.InputUtils.*;

public class newPrices {
    public static void main(String[] args) {
        String productname = stringInput("What is the product name?");
        double price = doubleInput("What does " + productname + " cost?");
        int quantity = intInput("How many " + productname + " to sell?");
        double newPrice = price * quantity;
        System.out.println(quantity + " of " + productname + " at $" + price + " each costs $" + newPrice);
        System.out.printf("%d of %s at $%.2f each costs $%.2f", quantity, productname, price, newPrice);
    }
}
