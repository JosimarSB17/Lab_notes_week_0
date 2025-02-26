import static input.InputUtils.intInput;

public class secretelse {
    public static void main(String[] args) {
        int secretnum = 6;

        int guess = intInput("guess the secret number: ");

        if (guess == secretnum) {
            System.out.println("You guessed secret number!");
        }
        else {
            System.out.println("Your guess was incorrect! it was " + secretnum);
        }
    }
}
