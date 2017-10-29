package BaseConversion;
// jian pan 5728309
import java.util.Scanner;

public class BaseConversion {
    public static void main(String [] args){
        //test case
        //vit(8,2);
        //
       Scanner input = new Scanner(System.in);
       System.out.println("input an integer and its bese: ");
       int a = input.nextInt();
       int b = input.nextInt();

       vit(a,b);


    }


    public static void vit(int a , int b){
        Stack stack = new Stack();
        //String a1 = Integer.toString(a);
        int c = 0;
        while(a >= b){
            stack.push(a%b);
            a = a/b;
            c++;
            //System.out.println(a);
        }
       // System.out.println(a);
        stack.push(a);


       for(int i = 0; i<=c; i++){
           if(!stack.isEmpty()){
               System.out.print(stack.pop().toString());
           }
     }

    }
}
