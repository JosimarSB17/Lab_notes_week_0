import static input.InputUtils.yesNoInput;

public class MM {
    public static void main(String[] args) {
        System.out.println("This program will check if you meet the pre-requisitions for taking ITEC 1310 Microcomputer Sytems Maintenance ");
        System.out.println("please answer the following questions:");

        boolean concepts = yesNoInput("have you taken IT concepts?");
        boolean skills = yesNoInput("have you take IT skills?");
        boolean windows = yesNoInput("have you take IT windows operating systems?");

        if (concepts && skills && windows) {
            System.out.println("You meet the requirements");
        }
        else {
            System.out.println("You do not meet the requirements");
        }
    }
}
