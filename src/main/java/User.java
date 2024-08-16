import java.util.Scanner;

public class User {
    Scanner userInput = new Scanner(System.in);
    private String name;
    private String guess;

    public User(){
        setName();
    }

    public String getName() {
        return name;
    }

    public void setName(){
        System.out.println("Please enter your name");
        name = userInput.nextLine();
    }

    public void setUserGuess(){
         String usersGuess = userInput.next().toLowerCase();
        if(usersGuess.equalsIgnoreCase("rock")|| usersGuess.equalsIgnoreCase("paper")||usersGuess.equalsIgnoreCase("scissors")){
            guess =usersGuess;
        }else{
            System.out.println("Please enter a valid response!");
            setUserGuess();
        }
    }

    public String getGuess(){
        return guess;
    }
}
