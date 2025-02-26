import static input.InputUtils.stringInput;
import static input.InputUtils.doubleInput;

public class MilestoKM {
    public static void main(String[] args) {
        double miles = doubleInput("Enter a number of miles: ");
        double km = milestoKM(miles);
        System.out.println(miles + " miles is equal to " + km + " kilometers");
    }
    private static double milestoKM(double miles) {
        return miles * 1.6;
    }
}
