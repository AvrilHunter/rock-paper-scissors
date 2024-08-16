import java.util.Scanner;

public class User {
    Scanner userInput = new Scanner(System.in);
    private String name;
    private String option;

    public void selectOption(){
        System.out.println("Enter guess of rock, paper or scissors");
        option = userInput.next();
    }

    public String getOption(){
        return option;
    }
}
