import static input.InputUtils.doubleInput;

public class Abouvefreezing {
    public static void main(String[] args) {
        System.out.println("Enter today's temperature in Fahrenheit:");
        double temp = doubleInput();

        if (temp > 32){
            // runs if conditional statement is true
            System.out.println("You are above freezing temperature");
        }
    }
}
