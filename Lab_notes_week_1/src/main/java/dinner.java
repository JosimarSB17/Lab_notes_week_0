import static input.InputUtils.stringInput;

public class dinner {
    public static void main(String[] args) {
        String dinner = stringInput("What should we have for dinner? ");

        if (dinner.equalsIgnoreCase("Pizza")) {
            System.out.println("Pizza sounds good!");
        }
        else if (dinner.equalsIgnoreCase("Tacos")) {
            System.out.println("Taco sounds good!");
        }
        else {
            System.out.println("How about pizza or tacos?");
        }
    }
}
