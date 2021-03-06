package pl.blazej.szczypka;
import java.util.Scanner;

public class Prompter {
    private Game game;

    public Prompter(Game game){
        this.game = game;
    }

    public boolean promptForGuess (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sign (character)");
        String guestInput = scanner.nextLine();
        char guess = guestInput.toLowerCase().charAt(0);
        return game.applyGuess(guess);
    }

    public void displayProgress(){
        System.out.printf("You already found this letters: %s%n", game.getCurrentProgress());
    }
}