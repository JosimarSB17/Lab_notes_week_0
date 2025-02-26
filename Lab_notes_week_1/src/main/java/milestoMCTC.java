import static input.InputUtils.positiveDoubleInput;

public class milestoMCTC {
    public static void main(String[] args) {
        double miles = positiveDoubleInput("How many miles from your house to MCTC?");
        double km = miles * 1.6;
        System.out.println("you live " + km + " kilometers from MCTC");

        if (miles > 10) {
            System.out.println("you live more than 10 miles away from MCTC");
        }
        else if (miles == 10) {
            System.out.println("you live exactly 10 miles away from MCTC");
        }
        else {
            System.out.println("you live less than 10 miles away from MCTC");
        }
    }
}
