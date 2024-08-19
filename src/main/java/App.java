public class App {

        public static String userName;

        public static void main(String[] args) {
            UserInput nameInput = new UserInput();
            userName = nameInput.setName();
            Player humanTestPlayer = new HumanPlayer(userName);
            Player compTestPlayer = new ComputerPlayer("computer");
            GamePlay myGame = new GamePlay(humanTestPlayer, compTestPlayer);
            myGame.playGame();
        }
    }


