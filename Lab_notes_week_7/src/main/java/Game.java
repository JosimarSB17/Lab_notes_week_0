import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Game {
    private DiceCup diceCup;
    private List<Player> players;
    private int knockoutNumber;

    public static void main(String[] args) {
    Game knockout = new Game();
    knockout.startGame();
    }

    public void startGame() {
        // make player objects -- names
        // get knockout numbers
        // create dice cup
        // play the game - until one player is left
        // each player will roll dice
        // print winner

        diceCup = new DiceCup(2);
        int numberOfPlayers = positiveIntInput("Enter number of players: ");
        players = createPlayers(numberOfPlayers);

        setKnockoutNumbers();

        play();

        printGameResults();
    }

    private void printGameResults() {
        for (Player player : players) {
            if (player.isKnockout()){
                System.out.println("Player " + player.getName() + " has knocked out");
            }
            else {
                System.out.println("Player " + player.getName() + " IS THE WINNER!!!");
            }
        }
    }

    private void play() {

        int playerIndex = 0;
        int totalPlayers = players.size();
        while (moreThanOnePlayerInPlay()) {

            Player currentPlayer = players.get(playerIndex);

            if (currentPlayer.isKnockout()){
                System.out.println("Sorry" + currentPlayer.getName() + " you have been knocked out!");
            } else {
                stringInput("Player " + currentPlayer.getName() + " press enter to roll!");
                String turnResult = currentPlayer.playTurn(diceCup);
                System.out.println(turnResult);
            }
            playerIndex = (playerIndex + 1) % totalPlayers;
        }

    }

    private boolean moreThanOnePlayerInPlay() {
        int totalInPlay = 0;
        for (Player player : players) {
            if (!player.isKnockout()){
                totalInPlay++;
            }

        }
        System.out.println("There are " + totalInPlay + " player(s) in play!");
        if (totalInPlay > 1) {
            return true;
        }else {
            return false;
        }
    }

    private void setKnockoutNumbers(){
        for (Player player : players) {

            int knockoutNumber;

            do{
                knockoutNumber = intInput("Player " + player.getName() + ", enter your knockout number " +
                        "It must be 6 7 8 or 9. ");
            }while (knockoutNumber < 6 || knockoutNumber > 9 );
            player.setKnockoutNumber(knockoutNumber);
        }

    }

    private List<Player> createPlayers(int numberOfPlayers) {
        players = new ArrayList<>();

        for (int i = 0; i < numberOfPlayers; i++) {
            String name = stringInput("Enter player " + (i + 1) + ": ");
            Player player = new Player(name);
            players.add(player);
        }
        return players;
    }
}
