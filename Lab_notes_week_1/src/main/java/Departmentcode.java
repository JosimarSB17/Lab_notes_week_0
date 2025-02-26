import static input.InputUtils.stringInput;

public class Departmentcode {
    public static void main(String[] args) {
        String deparmentcode = stringInput("Enter the department code: ");

        // checking for valid code

        if (deparmentcode.length() == 4) {
            System.out.println("Code is valid");
            deparmentcode = deparmentcode.toUpperCase();
            System.out.println("The code is " + deparmentcode);
        }
        else {
            System.out.println("Code is not valid");
        }
    }
}
