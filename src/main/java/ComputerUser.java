public class ComputerUser {
    private int randomNum;
    private String guess;

    public ComputerUser(){
//        this.randomNum = (int)((Math.random() * 3)+1);
//        convertNumToGuess(this.randomNum);
        this.guess ="paper";
    }

    private void convertNumToGuess(int num){
        switch(num){
            case 1:
                guess = "rock";
                break;
            case 2:
                guess = "paper";
                break;
            case 3:
                guess = "scissors";
                break;
        }
    }

    public String getGuess(){
        return guess;
    }

    public void setGuess() {
//        this.randomNum = (int)((Math.random() * 3)+1);
//        convertNumToGuess(this.randomNum);
        this.guess = "paper";
    }
}
