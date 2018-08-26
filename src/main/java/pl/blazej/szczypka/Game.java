package pl.blazej.szczypka;

public class Game {
    private String answer;
    private String hits;
    private String misses;


    public Game(String answer){
        this.answer = answer;
        hits = "";
        misses = "";
    }

    public boolean applyGuess(char sign){
        boolean isHit = answer.indexOf(sign) != -1;
        if (isHit){
            hits += sign;
        } else {
            misses += sign;
            System.out.println("Wrong!");
        }
        return isHit;
    }
}
