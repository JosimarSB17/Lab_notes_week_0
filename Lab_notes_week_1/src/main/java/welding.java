import static input.InputUtils.yesNoInput;

public class welding {
    public static void main(String[] args) {
        boolean cotton = yesNoInput("Are you wearing cotton clothes?");
        boolean wool = yesNoInput("Are you wearing wool clothes?");
        boolean shoes = yesNoInput("Are you wearing closed toed shoes?");

        if ((cotton || wool) && shoes) {
            System.out.println("You are dressed safely!");
        }
        else {
            System.out.println("You are not dressed safely!");
        }
    }
}
