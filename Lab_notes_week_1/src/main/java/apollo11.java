import static input.InputUtils.intInput;

public class apollo11 {
    public static void main(String[] args) {
        System.out.println("Quiz time");
        System.out.println("What year did the Apollo  11 spaceship land on the moon?");

        int answer = intInput();
        // ! means if it is not equal to
        if (answer != 1969) {
            System.out.println("wrong answer it was on 1969");
        }
    }
}
