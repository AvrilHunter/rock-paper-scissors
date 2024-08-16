public class App {

    public static String outcome;

    public static void rePlayGame(User myUser, ComputerUser compUser, Game myGame, String outcome) {
        if (outcome.equals("Draw")) {
            System.out.println("It was a draw! To play again enter guess of rock, paper or scissors");
            myUser.selectGuess();
            compUser.setGuess();
            outcome = myGame.outcome(myUser.getGuess(), compUser.getGuess());
            if (outcome.equals("Draw")) {
                rePlayGame(myUser, compUser, myGame, outcome);
            }else{ System.out.println(outcome);
                System.out.println("Game over");
            }
        }else{
            System.out.println(outcome);
            System.out.println("Game over");
        }
    }

    public static void main(String[] args) {
        User myUser = new User();
        ComputerUser compUser = new ComputerUser();

        Game myGame = new Game();
        System.out.println("Enter guess of rock, paper or scissors");
        myUser.selectGuess();
        outcome = myGame.outcome(myUser.getGuess(), compUser.getGuess());
        rePlayGame(myUser, compUser,myGame, outcome);

//        if(outcome.equals("Draw")){
//            rePlayGame(myUser, compUser,myGame);
////            System.out.println("It was a draw! To play again enter guess of rock, paper or scissors");
////            myUser.selectGuess();
////            compUser.setGuess();
////            String outcome = myGame.outcome(myUser.getGuess(), compUser.getGuess());
////            System.out.println(outcome);
//        }else {
//            System.out.println(outcome);
//        }
       // System.out.println("Game finished");
    }
}