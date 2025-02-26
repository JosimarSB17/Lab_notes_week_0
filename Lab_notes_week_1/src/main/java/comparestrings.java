import static input.InputUtils.stringInput;

public class comparestrings {
    public static void main(String[] args) {
        String college = stringInput("what college do you go to? ");

        if (college.equalsIgnoreCase("MCTC")){
            System.out.println("Yay, MCTC!");
        }
        else {
            System.out.println("You should go to MCTC");
        }
    }
}
