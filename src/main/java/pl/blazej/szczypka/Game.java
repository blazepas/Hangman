package pl.blazej.szczypka;

import static java.lang.Character.isLetter;

public class Game {
    public static final int MAX_MISSES = 7;
    private String answer;
    private String hits;
    private String misses;
    private int countMisses = 0;

    public Game(String answer){
        this.answer = answer;
//        this.hits = hits;
//        this.misses = misses;
        hits = "";
        misses = "";
    }


    public boolean applyGuess(char sign) {
        boolean isHit = answer.indexOf(sign) != -1;
        if (isLetter(sign) == true) {
            if (misses.indexOf(sign) != -1) {
//            throw new IllegalArgumentException(sign + " already used");
                System.out.println("You already use this char");
            } else {

                if (isHit) {
                    hits += sign;
                } else {
                    countMisses++;
                    misses += sign;
                    System.out.println("Wrong!");
                }
//                return isHit;
            }
//            return isHit;
        } else{
            System.out.println("This is not a char");
        }return isHit;
    }

    public int chanceLeft(){
        int countChance = MAX_MISSES - countMisses;
        return countChance;
    }

    public String getCurrentProgress() {
        String progress = "";
        for (char letter : answer.toCharArray()) {
            char display = '-';
            if (hits.indexOf(letter) != -1) {
                display = letter;
            }
            progress += display;
        } return progress;
    }
}