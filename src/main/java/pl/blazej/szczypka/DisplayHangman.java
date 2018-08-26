package pl.blazej.szczypka;

public class DisplayHangman {

    public static void main(String[] args) {
        Game game = new Game("Calypso");
        Prompter prompter = new Prompter(game);
        boolean isHit = prompter.promptForGuess();
        if (isHit){
            System.out.println("Good shot, you typed correct letter!");
        } else{
            System.out.println("Sorry you miss a chance");
        }


    }
}
