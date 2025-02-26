import static input.InputUtils.intInput;

public class secretnum {
    public static void main(String[] args) {
        int secretnum = 6;

        int guess = intInput("guess the secret number: ");

        if (guess == secretnum) {
            System.out.println("You guessed secret number!");
        }
        System.out.println("the end");
    }
}
