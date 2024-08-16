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

    public void selectGuess(){
        guess = userInput.next();
    }

    public String getGuess(){
        return guess;
    }
}
