import java.util.Scanner;

public class UserInput {

    Scanner userInput = new Scanner(System.in);

    public String setName(){
        System.out.println("Please enter your name");
        return userInput.nextLine();
    }
}
