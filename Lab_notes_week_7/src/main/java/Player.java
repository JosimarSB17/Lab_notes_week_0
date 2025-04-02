public class Player {
    private String name;
    private boolean knockout;
    private int knockoutNumber;

    public Player(String name) {
        this.name = name;
        this.knockout = false;

    }

    public boolean isKnockout() {
        return knockout;
    }

    public void setKnockout(boolean knockout) {
        this.knockout = knockout;
    }

    public String playTurn(DiceCup diceCup) {
        int score = diceCup.rollAll();
        if (playerKnockedOut(score)) {
            knockout = true;
        }
        String resultTemplate = "Player %s rolled a total of %d and knocked out %s! (your knockout number was %d)";
        String knockedOutOrNot = "was not";
        if (knockout) {
            knockedOutOrNot = "was";
        }
        String result = String.format(resultTemplate, name, score, knockedOutOrNot, knockoutNumber);
        return result;
    }

    public boolean playerKnockedOut(int score) {
        if (score == knockoutNumber) {
            return true;
        }else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKnockoutNumber() {
        return knockoutNumber;
    }

    public void setKnockoutNumber(int knockoutNumber) {
        this.knockoutNumber = knockoutNumber;
    }
}
