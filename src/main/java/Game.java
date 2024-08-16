public class Game {


    public boolean isDraw(String userGuess, String compGuess){
        return userGuess.equals(compGuess);
    }

    public boolean isUserWinner(String userGuess, String compGuess) {
        if (userGuess.equals("rock") && compGuess.equals("paper")) {
            return true;
        } else if (userGuess.equals("paper") && compGuess.equals("rock")) {
            return false;
        } else if (userGuess.equals("rock") && compGuess.equals("scissors")) {
            return true;
        } else if (userGuess.equals("scissors") && compGuess.equals("rock")) {
            return false;
        } else if (userGuess.equals("scissors") && compGuess.equals("paper")) {
            return true;
        } else {
            return true; // if (userGuess.equals("paper")&& compGuess.equals("scissors"))
        }
    }


}
