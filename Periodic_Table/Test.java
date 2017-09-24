package Periodic_Table;
/**
 * Write a program that allows the user to search an element in the periodic table by the element’s name or symbol. You can use an array in this exercise
 * jerry
 */

import java.util.*;
/**
 * Created by lmsj0 on 9/25/2017.
 * Lithium       Li      3   1  2  6.940    0.534    3.13  65     8.55
 Beryllium     Be      4   2  2  9.013    1.85     2.25  6      10.1
 Boron         B       5   2 13  10.82    2.535    -999  3      -999
 Carbon        C       6   2 14  12.011   3.52     1.54  320    -999
 Nitrogen      N       7   2 15  14.008   1.14     1.06  46.3   -999
 Oxygen        O       8   2 16  16.0000  1.568    -999  466000 -999
 Fluorine      F       9   2 17  19.00    1.5      1.36  900    -999
 Neon          Ne     10   2 18  20.183   1.204    3.20  .00007 -999
 Sodium        Na     11   3  1  22.991   0.9712   3.83  28300  -999
 Magnesium     Mg     12   3  2  24.32    1.74     3.20  20900  4.35
 Aluminum      Al     13   3 13  26.98    2.70     2.82  81300  2.828
 Silicon       Si     14   3 14  28.09    2.42     2.34  277200 -999
 Phosphorus    P      15   3 15  30.975   1.83     2.16  1180   -999
 Sulfur        S      16   3 16  32.066   2.07     2.12  520    -999
 Chlorine      Cl     17   3 17  35.457   2.2      1.94  314    -999
 Argon         A      18   3 18  39.944   1.65     3.82  0.04   -999
 Potassium     K      19   4  1  39.100   0.87     4.76  25900  6.1
 Calcium       Ca     20   4  2  40.08    1.55     3.93  36300  4.59
 Scandium      Sc     21   4  3  44.96    3.02     3.20   5     -999
 Titanium      Ti     22   4  4  47.90    4.5      2.93  4400   55
 */
public class Test {
    public static void main(String[] args) throws Exception{

        //ArrayList<Object> arr = new ArrayList<>();

        //Element ele = new Element();

        System.out.println("1.Search by Name\n" +
                "2.Search by Symbol\n" +
                "3.Quit");
        Element[] arr = new Element[8];


        Element element1 = new Element("Hydrogen", 1, "H", 1.00794, 1, 1);
        Element element2 = new Element("Helium", 2, "He", 4.00260, 1, 18);
        Element element3 = new Element("Lithium", 3, "Li", 6.940, 1, 2);
        Element element4 = new Element("Beryllium", 4, "Be", 9.013, 2, 2);
        Element element5 = new Element("Boron", 5, "B", 10.82, 2, 13);
        Element element6 = new Element("Carbon", 6, "C", 12.011, 2, 14);
        Element element7 = new Element("Nitrogen",7,"N",14.008,2,15);
        Element element8 = new Element("Oxygen",8,"O",16.000,2,16);


        arr[0] = element1;
        arr[1] = element2;
        arr[2] = element3;
        arr[3] = element4;
        arr[4] = element5;
        arr[5] = element6;
        arr[6] = element7;
        arr[7] = element8;

        element1.getAdomicNumber();

        //arr.add(element1);
        //arr.add(element2);
        //arr.add(element3);
        // arr.add(element4);
        //arr.add(element5);
        // arr.add(element6);

        Scanner input = new Scanner(System.in);
        //String s = input.next();

        /**
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            if (s.equals(arr[i].getAtomicSymbol())) {
                System.out.println(arr[i]);
            }
        }
*/

        int a;
        a = input.nextInt();
        switch (a){
            case 1:
                try {
                    System.out.println("input the name:");
                    String b = input.next();
                    for (int i = 0; i < arr.length; i++) {
                        if (b.equals(arr[i].getName())) {
                            System.out.println(arr[i]);
                        }
                    }

                }catch(Exception e){
                    System.out.print("Error, please do it again: ");
            }
                break;
               // byname(arr,b);
            case 2:
                try {
                    System.out.println("input the symbol:");
                    String c = input.next();
                    for (int i = 0; i < arr.length; i++) {
                        if (c.equals(arr[i].getAtomicSymbol())) {
                            System.out.println(arr[i]);
                        }
                    }
                }catch (Exception e){
                    System.out.print("Error, please do it again: ");
                }
                break;
            case 3:
                System.exit(0);
        }

        //System.out.print("continue?");
    }
}