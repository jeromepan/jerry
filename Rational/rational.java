package Rational;

/**
 *The class definition for Rational class is given here.
 Implement all member functions of Rational class in Rational.java.
 Create a main program that tests your class and name the file RationalSample.java
 Note that Rational class contains the following members.


 Private fields:
 int numerator
 int denominator // positive integer greater than 0

 Public methods:
 constructor with default arguments
 Create a new Rational object with the value of 0/1.
 constructor taking 2 integers which are numerator and denominator respectively:
 It creates a new Rational object with the value of numerator/denominator. If the denominator is smaller than or equal to zero. The object created will be numerator/1.
 void add(Rational r)
 This method adds this object with the given Rational object r and updates this object with the result.

 void subtract(Rational r)
 This method subtracts Rational object r from this object. The result will be stored in this object.
 void multiply(Rational r)
 This method multiplies from this object with the Rational object r . The result will be stored in this object.
 void divide(Rational r)
 This method divides this object by the Rational object r . The result will be stored in this object.
 void invert()
 This method inverts this object's numerator with its denominator i.e., the numerator becomes the denominator and the denominator becomes the numerator.
 double toDouble()
 Returns the value of this Rational as a floating-point number.
 void reduce()
 Reduces this object to its simplest form. For instance, 3/6 will be reduced to 1/2.
 String toString()
 Returns the string representation of this Rational number of the form "2/3" where 2 is the numerator and 3 is the denominator
 Private methods:

 int gcd(int a, int b)
 This is an internal method designed to be used by the reduce() method.
 *
 * Created by lmsj0 on 9/13/2017.
 */
public class rational{
    private int numerator;
    private int denominator;

    rational(){
        this(0,1);
    }

    rational(int nomerator, int denominator){
        this.numerator = nomerator;
        if(denominator == 0){
            throw new IllegalArgumentException("cannot be 0");
        }
        this.denominator = denominator;
    }

    public String getRational(){
        return numerator  + "/" + denominator;
    }

    public void add(rational ra){
        int x1 = numerator;
        int x2 = denominator;
        int y1 = ra.numerator;
        int y2 = ra.denominator;

        rational temp = new rational();
        temp.numerator = (x1 * y2 + x2 * y1 );
        temp.denominator = (y1 * y2) ;

        new rational(temp.numerator,temp.denominator);

        reduce(temp.numerator,temp.denominator);
        //System.out.println(temp.numerator + "/" + temp.denominator);
    }

    public void subtract(rational ra){
        int x1 = numerator;
        int x2 = denominator;
        int y1 = ra.numerator;
        int y2 = ra.denominator;
        rational temp = new rational();
        temp.numerator = (x1 * y2 - x2 * y1 );
        temp.denominator = (y1 * y2) ;

        new rational(temp.numerator,temp.denominator);
        reduce(temp.numerator,temp.denominator);
        //System.out.println(temp.numerator + "/" + temp.denominator);
    }

    public void mutiply(rational ra){
        int x1 = numerator;
        int x2 = denominator;
        int y1 = ra.numerator;
        int y2 = ra.denominator;
        rational temp = new rational();
       temp.numerator=  (x1 * y1 );
       temp.denominator = (x2 * y2) ;

        new rational(temp.numerator,temp.denominator);
        reduce(temp.numerator,temp.denominator);
       // System.out.println(temp.numerator + "/" + temp.denominator);
    }

    public void divide(rational ra){
        int x1 = numerator;
        int x2 = denominator;
        int y2 = ra.denominator;

        rational temp = new rational();
        temp.numerator=  (x1 * y2);
        temp.denominator = (x2 * ra.numerator) ;

        new rational(temp.numerator,temp.denominator);
        reduce(temp.numerator,temp.denominator);
        //System.out.println(temp.numerator + "/" + temp.denominator);
    }

    public void reduce(int numerator,int denominator){
        //System.out.print(numerator);
       // System.out.print(denominator);
        int t = gcd(numerator, denominator);
        //System.out.println(t);
        int x  = numerator/t;
        int y = denominator/t;

        System.out.println(x + "/" + y);

    }


    private int gcd(int numerator, int denominator){
        int x = numerator; int y = denominator;
        if(x == 0){
            return y;
        }else{
            return  gcd( y % x, x);
        }
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void inverse(){
        System.out.println(denominator + "/" + numerator);
    }

    public String tostring(){
        return numerator  + "/" + denominator;
    }

    double toDouble(){
        float t = numerator/denominator;
        return t;
    }
}
