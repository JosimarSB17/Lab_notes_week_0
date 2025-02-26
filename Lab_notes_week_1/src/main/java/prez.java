import static input.InputUtils.intInput;
import static input.InputUtils.yesNoInput;

public class prez {
    public static void main(String[] args) {
        System.out.println("Are you eligible to become president of the United States?");
        System.out.println("Please answer the following questions below:");

        boolean citizen = yesNoInput("Were you born in the USA?");
        int age = intInput("what is your age?");
        int inside = intInput("how many years have you live in the USA");

        if (citizen && age >= 35 && inside >= 14) {
            System.out.println("You are eligible to become president of the United States!");
        }
        else {
            System.out.println("sorry you don't meet the requirements!");
        }
    }
}
