import static input.InputUtils.intInput;

public class numbelseif {
    public static void main(String[] args) {
        int secretnum = 6;

        int guess = intInput("guess the secret number: ");

        if (guess == secretnum) {
            System.out.println("You guessed secret number!");
        }
        else if (guess - secretnum == 1) {
            System.out.println("Your guess is 1 number too high!");
        }
        else if (secretnum - guess == 1) {
            System.out.println("Your guess is 1 number too low!");
        }
        else {
            System.out.println("Wrong guess! I was thinking of " + secretnum);
        }

    }
}
