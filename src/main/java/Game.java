import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void startGame(User myUser, ComputerUser compUser) {
        System.out.println("Enter guess of rock, paper or scissors");
        myUser.setUserGuess();
        if (isDraw(myUser.getGuess(), compUser.getGuess())) {
            replayGame(myUser, compUser);
        } else {
            declareWinner(myUser, compUser);
        }
    }

    public void playAgain(User myUser, ComputerUser compUser){
        System.out.println("Do you want to play again? Yes/No");
        if(input.next().equalsIgnoreCase("yes")){
            compUser.setGuess();
            startGame(myUser, compUser);
        }else {
            System.out.println("Thank you for playing, goodbye!");
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
            System.out.println(myUser.getGuess() + " beat " +compUser.getGuess()+ ": "+ myUser.getName()+" is the winner!");
        }else{
            System.out.println(compUser.getGuess() + " beat " +myUser.getGuess()+":- unfortunately you lost - better luck next time");
        playAgain(myUser, compUser);}
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

