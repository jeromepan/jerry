package guessword;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by lmsj0 on 9/11/2017.
 */


public class guessWord {

    public static int GuessGame(String word, String guess)throws IOException{
        Scanner scanObject = new Scanner(System.in);
        String lineSeparator = System.getProperty("line.separator");
        scanObject.useDelimiter(lineSeparator);

        char uChar;

        String temp;

        int count;
        int check;

        for(count = 1; count <= 10; count ++){
            System.out.println("Enter a character " );
            temp = scanObject.next();
            if(temp.length() > 1){
                System.out.println("please enter only one character ");

                count--;
            }else{

                uChar = temp.charAt(0);
                if((uChar >= 'A' && uChar <= 'Z') || (uChar >= 'a' && uChar <= 'z')){
                    temp = "";

                    for(check = 0; check < word.length(); check++){
                        if(Character.toUpperCase(word.charAt(check)) == Character.toUpperCase(uChar)){
                            temp = temp + uChar;
                        }else{
                            temp = temp + guess.charAt(check);
                        }
                    }

                    guess = temp;

                    for(check = 0; check < word.length(); check++){
                        System.out.print(guess.charAt(check) + " ");
                    }

                    System.out.println();

                    if(word.equals(guess))
                        return 1;
                    }else{
                        System.out.println("Use only alphabets to guess.");
                        count--;
                    }
                }
            }

            return 0;


        }


        public static void main(String []args)throws IOException{
            Scanner scanObject = new Scanner(System.in);
            String lineSeparator = System.getProperty("line.separator");
            scanObject.useDelimiter(lineSeparator);

            int pOneScore, pTwoScore;

            String pOneName, pTwoName;
            String word;
            String guess;

            int count;

            int uChoice;
           // System.out.println("Enter the name for player1: ");
            pOneName = "jiam";//scanObject.next();

            //System.out.println("Enter the name for player2: ");
            pTwoName = "jfo";//scanObject.next();

            uChoice = 1;
            pOneScore = pTwoScore = 0;

            while(uChoice == 1){
                System.out.println(pOneName + "Enter a word: ");
                word = scanObject.next();
                System.out.println(pTwoName + " your chance to guess word starts now: ");

                guess = "";

                for(count = 0; count < word.length(); count++){
                    guess = guess + "_";
                }

                if(GuessGame(word,guess) == 1){

                    System.out.println("you guess right");
                    pTwoScore++;
                }else{
                    System.out.println("Sorry" + pTwoName + "you missed to guess word");
                    System.out.println("The corrent word was: " + word);
                }

                System.out.println(pTwoName + "Enter a word: ");
                word = scanObject.next();
                System.out.println("you turn ");

                guess = "";
                for(count = 0; count < word.length(); count++){
                    guess = guess + "_";
                }

                if(GuessGame(word,guess) == 1){
                    System.out.println("you guessed right");
                    pOneScore++;
                }else{
                    System.out.println("Sorry" + pTwoName + "you missed to guess word");
                    System.out.println("The correct word was " + word);
                }

                System.out.println("Do you wish to play more (1.yes/2.No");
                uChoice = scanObject.nextInt();
            }
            if(pOneScore == pTwoScore){
                System.out.println("draw");
            }else{
                if(pOneScore > pTwoScore){
                    System.out.println("you win!");

                }else{
                    System.out.println("you win!");
                }
            }
    }
}

