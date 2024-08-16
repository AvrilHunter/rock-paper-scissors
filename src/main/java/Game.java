public class Game {

    public void startGame(User myUser, ComputerUser compUser) {
        System.out.println("Enter guess of rock, paper or scissors");
        myUser.setUserGuess();
        if (isDraw(myUser.getGuess(), compUser.getGuess())) {
            replayGame(myUser, compUser);
        } else {
            declareWinner(myUser, compUser);
        }
    }

    private void replayGame(User myUser, ComputerUser compUser) {
        System.out.println("It was a draw! To play again enter guess of rock, paper or scissors");
        myUser.setUserGuess();
        compUser.setGuess();
        if (isDraw(myUser.getGuess(), compUser.getGuess())) {
            replayGame(myUser, compUser);
        } else {
            declareWinner(myUser, compUser);
        }
    }

    private void declareWinner(User myUser, ComputerUser compUser){
        if(isUserWinner(myUser.getGuess(), compUser.getGuess())){
            System.out.println(myUser.getName()+" is the winner!");
        }else{System.out.println("Unfortunately you lost - better luck next time");}
        System.out.println("Game over");
    }

    private static boolean isDraw(String userGuess, String compGuess){
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
    }

