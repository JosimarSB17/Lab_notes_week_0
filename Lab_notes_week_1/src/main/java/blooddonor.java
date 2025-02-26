import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class blooddonor {
    public static void main(String[] args) {
        // meeting two conditions at once
        System.out.println("what is your weight?");
        double weight = doubleInput();

        System.out.println("how old are you?");
        int age = intInput();
        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to donate blood");
        }
        else {
            System.out.println("You are not eligible to donate blood");
            if (weight < 110){
                System.out.println("You do not weigh enough, you must weigh 110 pounds or more ");
            }
            if (age < 17){
                System.out.println("You are not old enough, you must be 17 years or more ");
            }
        }
    }
}
