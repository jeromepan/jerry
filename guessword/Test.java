package guessword;

import java.util.Scanner;

import java.util.Arrays;
/**5728309 jian pan
 * Created by lmsj0 on 9/18/2017.
 */
public class Test {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Guess guess = new Guess();
        guess.setWord(input.next());
        String s = guess.getWord();

       // System.out.println(guess.getWord());
        String [] g  = new String[s.length()];
        for(int i = 0; i<g.length;i++){
            g[i] = s.substring(0+i,i+1);
            System.out.print(g[i]);
        }

        String a = "";
        String b []= new String [g.length];
        String c = "";


        for(int i = 0; i<s.length(); i++){
            b[i] = "_";
            c = c+b[i];
        }



        for(int j = 0; j<= 10; j++ ){
            guess.setAnswer(input.next());
            a= guess.getAnswer();
            System.out.println(a);
            for(int i = 0; i<g.length; i++){
                if(g[i].equals(a)){

                    b[i] = a;

                }else{

                }
            }
            Arrays.equals(b,g);

            print(b);
            if(Arrays.equals(b,g) == true){
                System.out.println();
                System.out.println("bingo,you win");
                break;
            }

        }

    }

    public static void print(String [] b){
        for(int i = 0; i<b.length; i++){
            System.out.print(b[i]);
        }
    }

}
