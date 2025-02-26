import static input.InputUtils.yesNoInput;

public class Android {
    public static void main(String[] args) {
        System.out.println("this program will see if you meet the requirements to take ITEC Android Programming");
        System.out.println("please answer the following questions:");

        boolean csharp = yesNoInput("Have you taken C# Programming?");
        boolean java = yesNoInput("Have you taken Java Programming?");

        // using or conditional statements
        if (csharp || java) {
            System.out.println("you meet the requirements to take ITEC Android Programming");
        }
        else {
            System.out.println("you do not meet the requirements to take ITEC Android Programming");
        }
    }
}
