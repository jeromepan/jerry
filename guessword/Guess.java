package guessword;

/**
 * Created by lmsj0 on 9/11/2017.
 */
public class Guess {
    private String word;
    private String answer;

    Guess(){

    }

    Guess(String word, String answer){
        this.word = word;
        this.answer = answer;
    }

    public String getWord(){
        return word;
    }

    void setWord(String word){
        this.word = word;
    }

    public String getAnswer(){
        return answer;
    }

    void setAnswer(String answer){
        this.answer = answer;
    }
}
