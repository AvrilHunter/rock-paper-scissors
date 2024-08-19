import java.util.Scanner;

public class GamePlay {
    private String result;
    private Player humanPlayer;
    private Player computerPlayer;
    Scanner input = new Scanner(System.in);

    public GamePlay(Player humanPlayer, Player computerPlayer){
            this.humanPlayer=humanPlayer;
            this.computerPlayer=computerPlayer;
        }

    public void playGame(){
        GameLogic outcome = new GameLogic(humanPlayer.getGuess(), computerPlayer.getGuess());
        result= outcome.returnWinner();
        if(result.equalsIgnoreCase("Draw")){
            System.out.println("It was a draw! To play again enter guess of rock, paper or scissors");
            humanPlayer.setGuess();
            computerPlayer.setGuess();
            playGame();
        } else if (result.equalsIgnoreCase("User wins")) {
            System.out.println(humanPlayer.getGuess() + " beat " +computerPlayer.getGuess()+ ": "+ humanPlayer.getName()+" is the winner!");
            playAgain();
        } else if (result.equalsIgnoreCase("Computer wins")) {
            System.out.println(computerPlayer.getGuess() + " beat " +humanPlayer.getGuess()+":- unfortunately you lost - better luck next time");
            playAgain();
        }
    }

    public void playAgain(){
        System.out.println("Do you want to play again? Yes/No");
        if(input.next().equalsIgnoreCase("yes")){
            System.out.println("Enter guess of rock, paper or scissors");
            humanPlayer.setGuess();
            computerPlayer.setGuess();
            playGame();
        }else {
            System.out.println("Thank you for playing, goodbye!");
        }
    }

}
