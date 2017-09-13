package Rational;

import java.util.Scanner;

/**
 *
 * test
 * Created by lmsj0 on 9/13/2017.
 */
public class TestRation {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        rational ra1 = new rational(2,3);
        rational ra2 = new rational(4,5);

        ra1.setNumerator(4);
        ra1.setDenominator(17);

        ra1.add(ra2);
        ra1.subtract(ra2);
        ra1.mutiply(ra2);
        ra1.divide(ra2);


        System.out.println(ra1.toDouble());
        ra1.inverse();

        String s = ra1.tostring();
        System.out.println(s);



    }
}
