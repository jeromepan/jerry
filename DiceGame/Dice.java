package DiceGame;

import java.util.Random;

/**
 * Created by lmsj0 on 9/20/2017.
 */
public class Dice {
    private int dice;
    private String answer;

    Dice(){
        //this.dice  = dice;
        //this.answer = answer;

    }

    public int getDice() {
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }



    public int getValue(){
        Random ran  = new Random();
        setDice(ran.nextInt(6) + 1);
        return getDice();
    }


}
