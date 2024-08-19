public class ComputerPlayer extends Player {
    private Guess guess;
    //String[] moves = {"rock", "paper", "scissors"};
    Guess[] moves = Guess.values();

    public ComputerPlayer(String name){
        super(name);
        setGuess();
    }
    @Override
    public Guess getGuess() {
        return guess;
    }

    public void setGuess() {
        guess = moves[(int) ((Math.random() * 3)+1)-1];
       // guess = "rock";
    }
}
