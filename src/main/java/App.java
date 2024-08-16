public class App {

    public static void main(String[] args) {
   User myUser = new User();
   myUser.selectOption();
   ComputerUser compUser = new ComputerUser();
   System.out.println("computer guess: " +compUser.getGuess() + " user guess: " + myUser.getOption());
    }
}
