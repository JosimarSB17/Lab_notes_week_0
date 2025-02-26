public class Pizzarolls {
    public static void main(String[] args) {
        // sharing pizza rolls between people
        double pizzarolls = 42;
        int people = 7;

        double rollsperperson = pizzarolls / people;

        System.out.println("Each person gets " + rollsperperson + " pizza rolls");
        // format print
        System.out.printf("Each person gets %.2f pizza rolls", rollsperperson);
    }
}
