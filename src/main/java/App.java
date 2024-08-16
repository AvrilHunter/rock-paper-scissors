public class App {

    public static void main(String[] args) {
       User myUser = new User();
        ComputerUser compUser = new ComputerUser();
        Game myGame = new Game();
        myGame.startGame(myUser, compUser);
    }
}
