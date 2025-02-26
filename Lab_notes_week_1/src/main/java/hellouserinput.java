import static input.InputUtils.*;

public class hellouserinput {
    public static void main(String[] args) {
        String username = stringInput("Please enter your name: ");
        System.out.println("Welcome, " + username);

        int classes = positiveIntInput("Please enter the number of classes you are taking: ");

        String units = "classes";
        if (classes == 1) {
            units = "class";
        }
        System.out.println("You are taking " + classes + " " + units + " this semester");
    }
}
