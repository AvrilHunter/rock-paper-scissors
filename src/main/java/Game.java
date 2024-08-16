public class Game {

    private boolean isDraw(String userGuess, String compGuess){
        return userGuess.equals(compGuess);
    }

    private boolean isUserWinner(String userGuess, String compGuess) {
      if(userGuess.equals("rock") && compGuess.equals("scissors")){
          return true;
      }else if(userGuess.equals("rock")&& compGuess.equals("paper")){
          return false;
      } else if (userGuess.equals("scissors") &&compGuess.equals("rock")) {
          return false;
      } else if (userGuess.equals("scissors") && compGuess.equals("paper")) {
          return true;
      } else if (userGuess.equals("paper") && compGuess.equals("scissors")) {
          return false;
      }else return true; //this covers last option (userGuess.equals("paper") && compGuess.equals("rock")
    }

    public String outcome(String userGuess, String compGuess){
        if(isDraw(userGuess, compGuess)){
            return "draw";
        } else if (isUserWinner(userGuess, compGuess)) {
            return "User is the winner";
        }else{
            return "Computer is the winner";
        }
    }

}
