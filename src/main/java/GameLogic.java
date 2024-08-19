public class GameLogic {
    private Guess userGuess;
    private Guess compGuess;

    public GameLogic(Guess userGuess, Guess compGuess) {
        this.userGuess = userGuess;
        this.compGuess = compGuess;
    }

    public String returnWinner() {
        if (isDraw(userGuess, compGuess)) {
            return "Draw";
        } else {
            if (userGuess.equals(Guess.ROCK) && compGuess.equals(Guess.SCISSORS) ||
                            userGuess.equals(Guess.PAPER) && compGuess.equals(Guess.ROCK) ||
                            userGuess.equals(Guess.SCISSORS) && compGuess.equals(Guess.PAPER)
            ) {
                return "User wins";
            } else {
                return "Computer wins";
            }
        }
    }

    private static boolean isDraw(Guess userGuess, Guess compGuess) {
        return userGuess.equals(compGuess);
    }
}
