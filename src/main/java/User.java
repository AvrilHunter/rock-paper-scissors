import java.util.Scanner;

public class User {
    Scanner userInput = new Scanner(System.in);
    private String name;
    private String guess;


    public void selectGuess(){
        guess = userInput.next();
    }

    public String getGuess(){
        return guess;
    }
}
