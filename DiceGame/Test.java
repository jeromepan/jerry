package DiceGame;

import java.util.Scanner;

/**
 * Created by lmsj0 on 9/20/2017.
 */
public class Test {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Dice di = new Dice();
        String s = input.nextLine();
        di.setAnswer(s);
        int a = di.getValue();
        int b = di.getValue();
        int c= a + b;

        if(di.getAnswer().equals("low") && c >= 1 && c <=4 ){
            System.out.println("you win!");

        }else  if(di.getAnswer().equals("medium") && c >= 5 && c <=8 ){
            System.out.println("you win!");

        }else  if(di.getAnswer().equals("high") && c >= 9 && c <=12 ){
            System.out.println("you win!");

        }else{
            System.out.println("sorry, you lose!~");
        }

        System.out.println("dice1 " + a + "  dice2  " + b + "  total  " + c);
    }
}
