import java.util.Scanner;

public class HumanPlayer extends Player{

    private Guess guess;
    Scanner userInput = new Scanner(System.in);

    public HumanPlayer(String name){
        super(name);
        System.out.println("Enter guess of rock, paper or scissors");
        setGuess();
    }

    @Override
    public Guess getGuess() {
        return guess;
    }

    public void setGuess() {
        String usersGuess = userInput.next().toLowerCase();
        if (usersGuess.equalsIgnoreCase("rock")){
            guess = Guess.ROCK;
        } else if(usersGuess.equalsIgnoreCase("paper")){
            guess = Guess.PAPER;
        } else if(usersGuess.equalsIgnoreCase("scissors")) {
            guess = Guess.SCISSORS;
        } else {
            System.out.println("userGuess "+ usersGuess);
            System.out.println("Please enter a valid response!");
            setGuess();
        }
    }

}
