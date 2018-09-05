package pl.blazej.szczypka;

public class DisplayHangman {

    public static void main(String[] args) {
        Game game = new Game("Calypso");
        Prompter prompter = new Prompter(game);

        while(game.chanceLeft() > 0) {
            boolean isHit = prompter.promptForGuess();
            if (isHit == true) {
                System.out.println("Good shot, you typed correct letter!");
            } else {
                System.out.println("Sorry you miss a chance. Lefts " + game.chanceLeft() + " chances.");
                System.out.println(game.chanceLeft());
                if (game.chanceLeft() == 0) {
                    System.out.println("Sorry you don't have more attempts");
                }
            }
            prompter.displayProgress();
            game.chanceLeft();
        }
    }
}
